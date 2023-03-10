package com.pattern.visitor.vistor;

import com.pattern.visitor.resource.AbstractResource;
import com.pattern.visitor.resource.Button;
import com.pattern.visitor.resource.Category;
import com.pattern.visitor.resource.Menu;

import java.util.List;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-6
 */
public class XmlExportVisitor implements Vistor {
    public String export(AbstractResource resource) {
        String header = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n";
        return header + resource.accept(this);
    }

    @Override
    public String visitCategory(Category category) {
        StringBuilder sb = new StringBuilder();
        sb.append("<category>").append(System.lineSeparator())
                .append("   <name>").append(category.getName()).append("</name>").append(System.lineSeparator())
                .append("   <order>").append(category.getOrder()).append("</order>").append(System.lineSeparator())
                .append(visitChildren(category))
                .append("</category>");

        return sb.toString();
    }

    @Override
    public String visitMenu(Menu menu) {
        StringBuilder sb = new StringBuilder();
        sb.append("<menu>").append(System.lineSeparator())
                .append("   <name>").append(menu.getName()).append("</name>").append(System.lineSeparator())
                .append("   <order>").append(menu.getOrder()).append("</order>").append(System.lineSeparator())
                .append("   <path>").append(menu.getPath()).append("</path>").append(System.lineSeparator())
                .append(visitChildren(menu))
                .append("</menu>");

        return sb.toString();
    }

    @Override
    public String visitButton(Button button) {
        StringBuilder sb = new StringBuilder();
        sb.append("<button>").append(System.lineSeparator())
                .append("   <name>").append(button.getName()).append("</name>").append(System.lineSeparator())
                .append("   <icon>").append(button.getIcon()).append("</icon>").append(System.lineSeparator())
                .append(visitChildren(button))
                .append("</button>");

        return sb.toString();
    }

    private String visitChildren(AbstractResource resource) {
        List<AbstractResource> children = resource.getChildren();
        StringBuilder sb = new StringBuilder();
        for (AbstractResource child : children) {
            String xml = "   " + child.accept(this);
            xml = xml.replace(System.lineSeparator(), System.lineSeparator() + "    ") + System.lineSeparator();
            sb.append(xml);
        }
        return sb.toString();
    }
}
