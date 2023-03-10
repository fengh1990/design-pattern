package com.pattern.facade.speaker;

/**
 * 回声音效
 *
 * @author fengh
 * @date 2023-2-24
 */
public class EchoSoundEffectSpeaker extends Speaker {
    @Override
    public void showEffects() {
        System.out.println("音箱使用回声音效");
    }
}
