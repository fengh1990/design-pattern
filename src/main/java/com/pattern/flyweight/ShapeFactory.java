package com.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-2-27
 */
public class ShapeFactory {

    private final static Map<SupportedShape, Shape> CACHES = new HashMap<>();

    public static Shape getShape(SupportedShape shape) {

        if (CACHES.containsKey(shape)) {
            return CACHES.get(shape);
        }
        Shape result = null;
        switch (shape) {
            case LINE:
                result = new Line();
                break;
            case RECT:
                result = new Rectangle(false);
                break;
            case RECT_FILL:
                result = new Rectangle(true);
                break;
            case OVAL:
                result = new Oval(false);
                break;
            case OVAL_FILL:
                result = new Oval(true);
                break;
            default:
                throw new RuntimeException("不支持的图像类型");
        }
        CACHES.put(shape,result);
        return CACHES.get(shape);
    }
}
