package com.pattern.memento;

import java.util.Stack;

/**
 * Caretaker
 *
 * @author fengh
 * @date 2023-3-8
 */
public class HistorySave {

    private final Game currentGame;
    private final Stack<Game.SavePoint> history = new Stack<>();

    public HistorySave(Game currentGame) {
        this.currentGame = currentGame;
    }

    public void store() {
        Game.SavePoint savePoint = currentGame.createSavePoint();
        history.push(savePoint);
    }

    public void restore() {
        if (history.empty()) {
            return;
        }
        Game.SavePoint pop = history.pop();
        currentGame.restore(pop);
    }


}
