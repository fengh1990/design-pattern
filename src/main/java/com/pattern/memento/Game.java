package com.pattern.memento;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.text.MessageFormat;
import java.util.Random;

/**
 * Originator
 *
 * @author fengh
 * @date 2023-3-8
 */
public class Game {

    private int money;
    private String bgm;
    private int bgmProgress;
    private int bloodBar;

    Timer timer = new Timer(1000, this::action);
    Random random = new Random();

    public Game(String bgm) {
        switchBgm(bgm);
        this.action(null);
    }

    /**
     * 创建存档点
     *
     * @return
     */
    public SavePoint createSavePoint() {
        System.out.println("开始创建存档点");
        show();
        return new SavePoint(this.money, this.bgm, this.bloodBar);
    }

    /**
     * 从存档恢复
     *
     * @param point
     */
    public void restore(SavePoint point) {
        System.out.println("开始从存档恢复");
        this.money = point.money;
        switchBgm(point.bgm);
        this.bloodBar = point.bloodBar;
        show();
    }

    public void switchBgm(String bgm) {
        this.bgm = bgm;
        this.bgmProgress = 1;
    }

    private void show() {
        String msg = MessageFormat.format("当前游戏状态：金币：{0}，背景音乐：{1}，背景音乐播放进度：{2}，血值：{3}", money, bgm, bgmProgress, bloodBar);
        System.out.println(msg);
    }

    private void action(ActionEvent e) {
        this.bgmProgress += 1;
        this.money += 100;
        this.bloodBar = random.nextInt(100);
        show();
        timer.start();
    }

    /**
     * Memento 备忘录
     */
    protected static class SavePoint {
        private final int money;
        private final String bgm;
        private final int bloodBar;

        public SavePoint(int money, String bgm, int bloodBar) {
            this.money = money;
            this.bgm = bgm;
            this.bloodBar = bloodBar;
        }
    }
}
