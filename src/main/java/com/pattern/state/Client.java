package com.pattern.state;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-9
 */
public class Client {
    public static void main(String[] args) {
        Document document = new Document("title", "");
        document.saveDraft("title", "content");
        // 投稿
        document.contribute();
        // 撤稿
        document.revoke();
        // 审核
        document.audit();
        // 下架
        document.remove();
    }
}
