package com.pattern.facade;

import com.pattern.facade.bulb.GreenBulb;
import com.pattern.facade.bulb.RedBulb;
import com.pattern.facade.bulb.YellowBulb;
import com.pattern.facade.bulb.decorator.BrightEffectDecorator;
import com.pattern.facade.bulb.decorator.MarqueeEffectDecorator;
import com.pattern.facade.bulb.decorator.StrobeEffectDecorator;
import com.pattern.facade.speaker.EchoSoundEffectSpeaker;
import com.pattern.facade.speaker.OriginalSoundEffectSpeaker;
import com.pattern.facade.speaker.ReverbSoundEffectSpeaker;
import com.pattern.facade.speaker.Speaker;

/**
 * 门面模式
 *
 * @author fengh
 * @date 2023-2-24
 */
public class ModelFacade {

    private final static ModelFacade INSTANCE = new ModelFacade();

    public static ModelFacade getInstance() {
        return INSTANCE;
    }

    private Equipment redBulb=new MarqueeEffectDecorator(new RedBulb());
    private Equipment yellowBulb=new MarqueeEffectDecorator(new YellowBulb());
    private Equipment greenBulb=new MarqueeEffectDecorator(new GreenBulb());
    private Speaker speaker=new EchoSoundEffectSpeaker();

    public void open(){
        System.out.println("---打开设备");
        redBulb.open();
        yellowBulb.open();
        greenBulb.open();
        speaker.open();
        System.out.println("---现场效果");
        liveMode();
    }

    public void liveMode(){
        System.out.println("live模式");
        redBulb=new MarqueeEffectDecorator(new RedBulb());
        yellowBulb=new MarqueeEffectDecorator(new YellowBulb());
        greenBulb=new MarqueeEffectDecorator(new GreenBulb());
        speaker=new EchoSoundEffectSpeaker();
        System.out.println("---灯光效果");
        redBulb.showEffects();
        greenBulb.showEffects();
        yellowBulb.showEffects();
        System.out.println("---音响效果");
        speaker.showEffects();
    }

    public void familyMode(){
        System.out.println("居家模式");
        yellowBulb=new BrightEffectDecorator(new YellowBulb());
        greenBulb=new BrightEffectDecorator(new GreenBulb());
        speaker=new ReverbSoundEffectSpeaker();
        System.out.println("---灯光效果");
        greenBulb.showEffects();
        yellowBulb.showEffects();
        System.out.println("---音响效果");
        speaker.showEffects();
    }

    public void proMode(){
        System.out.println("专业模式");
        greenBulb=new StrobeEffectDecorator(new GreenBulb());
        speaker=new OriginalSoundEffectSpeaker();
        System.out.println("---灯光效果");
        greenBulb.showEffects();
        System.out.println("---音响效果");
        speaker.showEffects();
    }

    public void close(){
        System.out.println("---关闭设备");
        redBulb.close();
        yellowBulb.close();
        greenBulb.close();
        speaker.close();
    }
}
