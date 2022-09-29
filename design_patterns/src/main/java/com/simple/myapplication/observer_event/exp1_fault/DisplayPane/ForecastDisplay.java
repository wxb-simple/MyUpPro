package com.simple.myapplication.observer_event.exp1_fault.DisplayPane;


import com.simple.myapplication.JLog;
import com.simple.myapplication.observer_event.exp1_fault.Pane;

public class ForecastDisplay implements Pane {
    @Override
    public void update(float temp, float humidity, float pressure) {
        JLog.e("ForecastDisplay", temp + humidity + pressure + "");
    }
}
