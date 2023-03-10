package com.pattern.strategy;

import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import org.apache.commons.compress.archivers.jar.JarArchiveOutputStream;
import org.apache.commons.compress.utils.IOUtils;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-10
 */
public class JarCompressor implements CompressStrategy {
    @Override
    public void compress(Collection<CompressEntry> compressEntries, OutputStream out) throws IOException {
        System.out.println("开始压缩jar文件");
        JarArchiveOutputStream jos = new JarArchiveOutputStream(out, StandardCharsets.UTF_8.name());
        for (CompressEntry entry : compressEntries) {
            // 相对路径替换为linux文件分隔符，否则无法创建目录
            JarArchiveEntry jarArchiveEntry = new JarArchiveEntry(entry.getRelativePath().toString().replace(String.valueOf(File.separatorChar), "/"));
            jarArchiveEntry.setSize(entry.getContent().length);
            // 添加进压缩列表
            jos.putArchiveEntry(jarArchiveEntry);
            // 写入输出流
            jos.write(entry.getContent());
            jos.closeArchiveEntry();
        }
        jos.close();
        System.out.println("结束压缩jar文件");
    }
}
