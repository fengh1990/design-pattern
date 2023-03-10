package com.pattern.strategy;

import lombok.Setter;
import org.apache.commons.compress.utils.IOUtils;
import org.springframework.util.CollectionUtils;

import java.io.*;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.MessageFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-10
 */
@Setter
public class CompressContext {

    private CompressStrategy compressStrategy;

    public CompressContext(CompressStrategy compressStrategy) {
        this.compressStrategy = compressStrategy;
    }

    /**
     * 压缩文件
     *
     * @param sourcePath  需要压缩的文件或文件夹
     * @param ignorePaths 忽略的文件名
     * @param destPath    目标文件
     * @throws IOException
     */
    public void compress(Path sourcePath, Path[] ignorePaths, Path destPath) throws IOException {
        List<CompressEntry> compressEntries = new ArrayList<>();
        Files.walkFileTree(sourcePath, new CompressVisitor(compressEntries, sourcePath, ignorePaths));
        doCompress(destPath, compressEntries);
    }

    private void doCompress(Path destPath, List<CompressEntry> compressEntries) throws IOException {
        FileOutputStream fos = new FileOutputStream(destPath.toString());
        compressStrategy.compress(compressEntries, fos);
        fos.close();
    }

    public void compress(Path sourcePath, Path destPath) throws IOException {
        compress(sourcePath, null, destPath);
    }

    /**
     * 压缩类文件
     *
     * @param classes
     * @param destPath
     * @throws IOException
     */
    public void compressClasses(Class<?>[] classes, Path destPath) throws IOException {
        List<CompressEntry> compressEntries = new ArrayList<>();
        for (Class<?> aClass : classes) {
            System.out.println(MessageFormat.format("    :::: 待压缩的类【{0}】", aClass.getName()));
            String simpleName = aClass.getSimpleName();
            String packetPath = URLDecoder.decode(Objects.requireNonNull(aClass.getResource("")).getPath(), StandardCharsets.UTF_8.name());
            packetPath = packetPath.substring(1);
            String classPath = packetPath + simpleName + ".class";
            compressEntries.add(getCompressEntry(Paths.get(classPath), Paths.get(simpleName+".class")));
        }
        doCompress(destPath, compressEntries);
    }

    private static CompressEntry getCompressEntry(Path file, Path relativePath) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        FileInputStream is = new FileInputStream(file.toFile());
        IOUtils.copy(is, bos, 1024);
        CompressEntry result = new CompressEntry(bos.toByteArray(), relativePath);
        is.close();
        bos.close();
        return result;
    }

    static class CompressVisitor extends SimpleFileVisitor<Path> {
        private final Collection<CompressEntry> entries;
        private final Path rootPath;
        private final Path[] ignorePaths;

        CompressVisitor(Collection<CompressEntry> entries, Path rootPath, Path[] ignorePaths) {
            this.entries = entries;
            this.rootPath = rootPath;
            this.ignorePaths = ignorePaths;
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            Path relativize = rootPath.relativize(file);
            if (ignorePaths != null && Arrays.asList(ignorePaths).contains(relativize)) {
                System.out.println(MessageFormat.format("    :::: 被忽略的文件【{0}】", file));
                return FileVisitResult.CONTINUE;
            }
            entries.add(getCompressEntry(file, relativize));
            return FileVisitResult.CONTINUE;
        }
    }

}
