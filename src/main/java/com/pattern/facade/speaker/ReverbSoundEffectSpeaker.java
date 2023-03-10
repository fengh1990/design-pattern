package com.pattern.facade.speaker;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-2-24
 */
public class ReverbSoundEffectSpeaker extends Speaker{
    @Override
    public void showEffects() {
        System.out.println("音箱使用混响音效");
    }
}
