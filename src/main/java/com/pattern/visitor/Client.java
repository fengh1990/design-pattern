package com.pattern.visitor;

import com.pattern.visitor.resource.AbstractResource;
import com.pattern.visitor.resource.Button;
import com.pattern.visitor.resource.Category;
import com.pattern.visitor.resource.Menu;
import com.pattern.visitor.vistor.XmlExportVisitor;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-6
 */
public class Client {

    public static void main(String[] args) {
        XmlExportVisitor xmlExportVisitor = new XmlExportVisitor();
        AbstractResource category = new Category("系统管理", 1)
                .addChildren(new Menu("用户管理", 1, "/sys/user/index")
                        .addChildren(new Button("新增用户", "add"))
                        .addChildren(new Button("删除用户", "delete")))
                .addChildren(new Menu("角色管理", 2, "/sys/role/index")
                        .addChildren(new Button("角色列表", "query"))
                        .addChildren(new Button("授权", "auth")));
        System.out.println(xmlExportVisitor.export(category));
    }
}
