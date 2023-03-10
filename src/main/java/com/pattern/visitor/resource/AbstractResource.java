package com.pattern.visitor.resource;

import com.pattern.visitor.vistor.Vistor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-6
 */

@Data
public abstract class AbstractResource {

    private final String name;
    private List<AbstractResource> children = new ArrayList<>();

    protected AbstractResource(String name) {
        this.name = name;
    }

    public AbstractResource addChildren(AbstractResource resource) {
        children.add(resource);
        return this;
    }

    public abstract String accept(Vistor vistor);
}
