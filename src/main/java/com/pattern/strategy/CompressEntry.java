package com.pattern.strategy;

import lombok.Getter;

import java.nio.file.Path;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-10
 */
@Getter
public class CompressEntry {

    /**
     * 压缩文件内容
     */
    private final byte[] content;
    /**
     * 相对路径
     */
    private final Path relativePath;

    public CompressEntry(byte[] content, Path relativePath) {
        this.content = content;
        this.relativePath = relativePath;
    }
}
