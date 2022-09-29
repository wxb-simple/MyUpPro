package com.simple.myapplication.observer_event.exp1_fault;

import com.simple.myapplication.observer_event.exp1_fault.DisplayPane.CurrentConditionsDisplay;
import com.simple.myapplication.observer_event.exp1_fault.DisplayPane.ForecastDisplay;

public class Main {
    public static void main(String[] args) {
        Pane pane = new ForecastDisplay();
        Pane pane1 = new CurrentConditionsDisplay();
        Subject subject = new Subject();
        subject.attach(pane);
        subject.attach(pane1);
        subject.notifyUpdate(11, 22, 33);
    }
}
