package com.pattern.composite;

import java.text.MessageFormat;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-2-22
 */
public class TextFile extends AbstractFile {
    protected TextFile(String name) {
        super(name);
    }

    @Override
    protected void destroyVirus() {
        System.out.println(MessageFormat.format("   文本文件【{0}】开始杀毒", getName()));
    }
}
