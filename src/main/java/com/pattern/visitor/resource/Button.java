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
public class Button extends AbstractResource {

    private final String icon;

    public Button(String name, String icon) {
        super(name);
        this.icon = icon;
    }

    @Override
    public String accept(Vistor vistor) {
        return vistor.visitButton(this);
    }
}
