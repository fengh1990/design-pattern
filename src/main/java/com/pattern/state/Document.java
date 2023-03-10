package com.pattern.state;

import java.text.MessageFormat;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-9
 */
public class Document implements State {

    private String title;
    private String content;
    private State currentState;

    public Document(String title, String content) {
        this.title = title;
        this.content = content;
        this.currentState = new DraftState(this);
    }

    @Override
    public String getStateName() {
        return currentState.getStateName();
    }

    @Override
    public void saveDraft(String title, String content) {
        currentState.saveDraft(title, content);
    }

    @Override
    public void contribute() {
        currentState.contribute();
    }

    @Override
    public void audit() {
        currentState.audit();
    }

    @Override
    public void revoke() {
        currentState.revoke();
    }

    @Override
    public void remove() {
        currentState.remove();
    }

    public void nextState(State state) {
        System.out.println(MessageFormat.format("    状态转换：【{0}】 -> 【{1}】",
                currentState.getStateName(), state.getStateName()));
        this.currentState = state;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
