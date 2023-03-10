package com.pattern.facade.bulb;

import com.pattern.facade.bulb.Bulb;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-2-24
 */
public class GreenBulb extends Bulb {
    @Override
    public String attachEffect() {
        return "绿色灯光";
    }
}
