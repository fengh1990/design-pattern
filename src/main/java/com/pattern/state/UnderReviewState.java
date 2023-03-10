package com.pattern.state;

import java.util.Arrays;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-9
 */
public class UnderReviewState extends AbstractState {
    protected UnderReviewState(Document document) {
        super(document);
    }

    @Override
    public String getStateName() {
        return "审核";
    }

    @Override
    public void saveDraft(String title, String content) {
        System.out.println("        非法操作：审核中状态不允许保存草稿");
    }

    @Override
    public void contribute() {
        System.out.println("        非法操作：当前文稿正在审核中，请勿重复投稿！");
    }

    @Override
    public void audit() {
// 如果包含了某些敏感信息，审核不通过，其他情况审核通过
        String[] sensitiveKeywords = new String[]{"资本", "社会", "恐怖"};
        String title = getDocument().getTitle();
        String content = getDocument().getContent();
        boolean val1 = Arrays.stream(sensitiveKeywords)
                .anyMatch(item -> title.contains(item) || content.contains(item));
        if (val1) {
            System.out.println("        包含敏感信息，审核失败");
            getDocument().nextState(new DraftState(getDocument()));
        } else {
            System.out.println("        审核通过");
            getDocument().nextState(new PublishedState(getDocument()));
        }
    }

    @Override
    public void revoke() {
        System.out.println("        非法操作：审核中状态不允许撤稿");
    }

    @Override
    public void remove() {
        System.out.println("        非法操作：审核中状态不允许下架");
    }
}
