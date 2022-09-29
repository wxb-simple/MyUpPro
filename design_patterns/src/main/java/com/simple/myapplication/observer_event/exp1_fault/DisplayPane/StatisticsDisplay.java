package com.simple.myapplication.observer_event.exp1_fault.DisplayPane;

import com.simple.myapplication.JLog;
import com.simple.myapplication.observer_event.exp1_fault.Pane;

public class StatisticsDisplay implements Pane {
    @Override
    public void update(float temp, float humidity, float pressure) {
        JLog.e("StatisticsDisplay", temp + humidity + pressure + "");
    }
}
