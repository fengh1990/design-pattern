package com.pattern.composite;

import java.text.MessageFormat;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-2-22
 */
public class ImageFile extends AbstractFile {
    protected ImageFile(String name) {
        super(name);
    }

    @Override
    protected void destroyVirus() {
        System.out.println(MessageFormat.format("   图片文件【{0}】开始杀毒", getName()));
    }
}
