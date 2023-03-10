package com.pattern.state;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-9
 */
public class RemovedState extends AbstractState{
    protected RemovedState(Document document) {
        super(document);
    }

    @Override
    public String getStateName() {
        return "已下架";
    }

    @Override
    public void saveDraft(String title, String content) {
        System.out.println("        非法操作：已下架状态不允许保存草稿");
    }

    @Override
    public void contribute() {
        System.out.println("        非法操作：已下架状态不能再投稿");
    }

    @Override
    public void audit() {
        System.out.println("        非法操作：已下架状态不需要审核");
    }

    @Override
    public void revoke() {
        getDocument().nextState(new DraftState(getDocument()));
    }

    @Override
    public void remove() {
        System.out.println("        非法操作：已下架状态不允许再次下架");
    }
}
