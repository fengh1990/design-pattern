package com.pattern.memento;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-8
 */
public class Client {

    public static void main(String[] args) throws InterruptedException {
        Game game = new Game("stronger");
        HistorySave historySave = new HistorySave(game);
        Thread.sleep(3000);
        historySave.store();

        game.switchBgm("someone Like you");
        Thread.sleep(2000);

        historySave.store();

        Thread.sleep(3000);

        historySave.restore();
        Thread.sleep(2000);

        historySave.restore();

        System.exit(0);

    }
}
