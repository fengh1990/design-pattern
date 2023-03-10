package com.pattern.state;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-9
 */
public abstract class AbstractState implements State{

    private final Document document;

    protected AbstractState(Document document) {
        this.document = document;
    }

    public Document getDocument() {
        return document;
    }
}
