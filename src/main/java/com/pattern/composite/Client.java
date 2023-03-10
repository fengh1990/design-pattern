package com.pattern.composite;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-2-22
 */
public class Client {
    public static void main(String[] args) {
        AbstractFile root = new Folder("文档资料");
        Folder node_1_1 = new Folder("杂项");
        node_1_1.add(new TextFile("梦一样的早晨.txt"));
        node_1_1.add(new ImageFile("身份证正反面.png"));
        Folder node_1_2 = new Folder("参考资料汇总");
        Folder node_2_1 = new Folder("01-招投标书");
        node_2_1.add(new TextFile("XXX项目标书模板.doc"));
        node_1_2.add(node_2_1);
        node_1_2.add(new Folder("02-设计方案"));
        TextFile file = new TextFile("参考链接汇总.txt");
        node_1_2.add(file);

        root.add(node_1_1);
        root.add(node_1_2);
        root.add(new ImageFile("备忘事项.jpg"));
        root.destroyVirus();
    }
}
