package com.simple.myapplication.observer_event.exp1.DisplayPane;

import com.simple.myapplication.JLog;
import com.simple.myapplication.observer_event.exp1.DisplayElement;
import com.simple.myapplication.observer_event.exp1.Observer;
import com.simple.myapplication.observer_event.exp1.Subject;

public class CurrentConditionsDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData; //保存 Subject 引用，方便后续 remove Observer
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        JLog.e("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
