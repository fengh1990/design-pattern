package com.pattern.facade.bulb.decorator;

import com.pattern.facade.bulb.Bulb;

import java.text.MessageFormat;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-2-24
 */
public class MarqueeEffectDecorator extends BulbEffectDecorator {
    public MarqueeEffectDecorator(Bulb bulb) {
        super(bulb);
    }

    @Override
    public String attachEffect() {
        return MessageFormat.format("跑马灯效果的{0}", getBulb().attachEffect());
    }
}
