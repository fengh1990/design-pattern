package com.pattern.observer;

import java.text.MessageFormat;
import java.util.Observable;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-7
 */
public class WeatherData extends Observable {
    private Data data;

    public WeatherData() {
        this.data = new Data();
    }

    public void updateData(float temperature, float pressure) {
        data.temperature = temperature;
        data.pressure = pressure;
        //设置changed为true，才能使调用notifyObservers生效
        this.setChanged();
        this.notifyObservers(data);
    }

    public static class Data {
        private float temperature;
        private float pressure;

        public Data(float temperature, float pressure) {
            this.temperature = temperature;
            this.pressure = pressure;
        }

        public Data() {
        }

        public void print() {
            System.out.println(MessageFormat.format("temperature:{0}", this.temperature));
            System.out.println(MessageFormat.format("pressure:{0}", this.pressure));
        }
    }
}
