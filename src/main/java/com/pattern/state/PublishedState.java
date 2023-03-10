package com.pattern.state;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-9
 */
public class PublishedState extends AbstractState {
    protected PublishedState(Document document) {
        super(document);
    }

    @Override
    public String getStateName() {
        return "发布";
    }

    @Override
    public void saveDraft(String title, String content) {
        System.out.println("        非法操作：已发布状态不允许保存草稿");
    }

    @Override
    public void contribute() {
        System.out.println("        非法操作：已发布状态不允许投稿");
    }

    @Override
    public void audit() {
        System.out.println("        非法操作：已发布状态不需要审核");
    }

    @Override
    public void revoke() {
        getDocument().nextState(new DraftState(getDocument()));
    }

    @Override
    public void remove() {
        getDocument().nextState(new RemovedState(getDocument()));
    }
}
