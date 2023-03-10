package com.pattern.mediator;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-8
 */
public class Client {

    public static void main(String[] args) {
        LiveHouse liveHouse = new LiveHouse();
        RemoteController remoteController = new RemoteController(liveHouse);
        liveHouse.register(remoteController);
        liveHouse.register(new TV(liveHouse));
        liveHouse.register(new CoffeeMachine(liveHouse));
        liveHouse.register(new Light(liveHouse));

        liveHouse.openRemoteController();

        System.out.println("=======观看电视中=======");

        liveHouse.closeRemoteController();
    }
}
