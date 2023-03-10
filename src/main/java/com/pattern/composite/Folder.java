package com.pattern.composite;

import java.text.MessageFormat;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-2-22
 */
public class Folder extends AbstractFile {
    public Folder(String name) {
        super(name);
    }

    @Override
    protected void destroyVirus() {
        System.out.println(MessageFormat.format("====>文件夹【{0}】开始杀毒", getName()));
        for (AbstractFile file : files) {
            file.destroyVirus();
        }
    }

    @Override
    protected void add(AbstractFile file) {
        super.files.add(file);
    }

    @Override
    protected void remove(AbstractFile file) {
        super.files.remove(file);
    }
}
