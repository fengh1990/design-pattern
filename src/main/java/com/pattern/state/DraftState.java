package com.pattern.state;

/**
 * 草稿
 *
 * @author fengh
 * @date 2023-3-9
 */
public class DraftState extends AbstractState {
    protected DraftState(Document document) {
        super(document);
    }

    @Override
    public String getStateName() {
        return "草稿";
    }

    @Override
    public void saveDraft(String title, String content) {
        this.getDocument().setTitle(title);
        this.getDocument().setContent(content);
    }

    @Override
    public void contribute() {
        this.getDocument().nextState(new UnderReviewState(this.getDocument()));
    }

    @Override
    public void audit() {
        System.out.println("        非法操作：草稿状态不允许审核");
    }

    @Override
    public void revoke() {
        System.out.println("        非法操作：草稿状态不允许撤稿");
    }

    @Override
    public void remove() {
        System.out.println("        非法操作：草稿状态不允许下架");
    }
}
