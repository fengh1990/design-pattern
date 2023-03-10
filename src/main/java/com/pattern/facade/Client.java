package com.pattern.facade;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-2-24
 */
public class Client {

    public static void main(String[] args) {
        ModelFacade.getInstance().open();
        ModelFacade.getInstance().familyMode();
        ModelFacade.getInstance().proMode();
        ModelFacade.getInstance().liveMode();
        ModelFacade.getInstance().close();
    }
}
