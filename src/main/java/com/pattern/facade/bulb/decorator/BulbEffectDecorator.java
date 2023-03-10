package com.pattern.facade.bulb.decorator;

import com.pattern.facade.bulb.Bulb;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-2-24
 */
public abstract class BulbEffectDecorator extends Bulb {
    private final Bulb bulb;

    protected BulbEffectDecorator(Bulb bulb) {
        this.bulb = bulb;
    }

    protected Bulb getBulb() {
        return bulb;
    }
}
