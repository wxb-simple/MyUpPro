package com.simple.myapplication.observer_event.exp1.DisplayPane;

import com.simple.myapplication.JLog;
import com.simple.myapplication.observer_event.exp1.DisplayElement;
import com.simple.myapplication.observer_event.exp1.Observer;
import com.simple.myapplication.observer_event.exp1.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData; //保存 Subject 引用，方便后续 remove Observer
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temp, float humidity, float pressure) {
        tempSum += temp;
        numReadings++;

        if (temp > maxTemp) {
            maxTemp = temp;
        }

        if (temp < minTemp) {
            minTemp = temp;
        }

        display();
    }
    @Override
    public void display() {
        JLog.e("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }
}