package com.pattern.observer;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-7
 */
public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentCondition currentCondition = new CurrentCondition();
        weatherData.addObserver(currentCondition);

        weatherData.updateData(30.4f, 200f);

    }
}
