package com.pattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-7
 */
public class CurrentCondition implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof WeatherData.Data) {
            WeatherData.Data data = (WeatherData.Data) arg;
            data.print();
        }
    }
}
