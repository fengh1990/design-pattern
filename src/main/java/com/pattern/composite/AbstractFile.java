package com.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-2-22
 */
public abstract class AbstractFile {

    private final String name;

    protected List<AbstractFile> files = new ArrayList<>();

    protected AbstractFile(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected abstract void destroyVirus();

    protected void add(AbstractFile file){
        throw new UnsupportedOperationException();
    }

    protected void remove(AbstractFile file){
        throw new UnsupportedOperationException();
    }

}
