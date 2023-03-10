package com.pattern.visitor.vistor;

import com.pattern.visitor.resource.Button;
import com.pattern.visitor.resource.Category;
import com.pattern.visitor.resource.Menu;

/**
 * 访问者
 *
 * @author fengh
 * @date 2023-3-6
 */
public interface Vistor {

    /**
     * 访问目录
     *
     * @param category
     * @return
     */
    String visitCategory(Category category);
    /**
     * 访问菜单
     *
     * @param menu
     * @return
     */
    String visitMenu(Menu menu);

    /**
     * 访问按钮
     *
     * @param button
     * @return
     */
    String visitButton(Button button);
}
