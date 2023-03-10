package com.pattern.visitor.resource;

import com.pattern.visitor.vistor.Vistor;
import lombok.Data;
import lombok.Getter;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-6
 */
@Getter
public class Category extends AbstractResource {

    private final Integer order;

    public Category(String name, Integer order) {
        super(name);
        this.order = order;
    }

    @Override
    public String accept(Vistor vistor) {
        return vistor.visitCategory(this);
    }
}
