package com.pattern.visitor.resource;

import com.pattern.visitor.vistor.Vistor;
import lombok.Getter;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-6
 */
@Getter
public class Menu extends AbstractResource {

    private final Integer order;
    private final String path;

    public Menu(String name, Integer order, String path) {
        super(name);
        this.order = order;
        this.path = path;
    }

    @Override
    public String accept(Vistor vistor) {
        return vistor.visitMenu(this);
    }
}
