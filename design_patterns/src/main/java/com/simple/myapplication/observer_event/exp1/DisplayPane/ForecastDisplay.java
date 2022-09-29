package com.simple.myapplication.observer_event.exp1.DisplayPane;

import com.simple.myapplication.JLog;
import com.simple.myapplication.observer_event.exp1.DisplayElement;
import com.simple.myapplication.observer_event.exp1.Observer;
import com.simple.myapplication.observer_event.exp1.Subject;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData; //保存 Subject 引用，方便后续 remove Observer
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temperature, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
    }

    @Override
    public void display() {
        JLog.e("Forecast: ");
        if (currentPressure > lastPressure) {
            JLog.e("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            JLog.e("More of the same");
        } else if (currentPressure < lastPressure) {
            JLog.e("Watch out for cooler, rainy weather");
        }
    }
}