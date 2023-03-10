package com.pattern.strategy;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * zip压缩
 *
 * @author fengh
 * @date 2023-3-10
 */
public class ZipCompressor implements CompressStrategy {
    @Override
    public void compress(Collection<CompressEntry> compressEntries, OutputStream out) throws IOException {
        System.out.println("开始压缩zip文件");
        ZipOutputStream zos = new ZipOutputStream(out, StandardCharsets.UTF_8);
        for (CompressEntry entry : compressEntries) {
            // 添加进压缩列表
            zos.putNextEntry(new ZipEntry(entry.getRelativePath().toString()));
            // 写入输出流
            zos.write(entry.getContent());
            zos.closeEntry();
        }
        zos.close();
        System.out.println("结束压缩zip文件");
    }
}
