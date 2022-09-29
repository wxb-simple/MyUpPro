package com.simple.myapplication.observer_event.exp1_fault;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Pane> panes = new ArrayList<>();
    public void attach(Pane display) {
        panes.add(display);
    }
    public void remove(Pane display) {
        panes.remove(display);
    }
    public void notifyUpdate(float temp, float humidity, float pressure){
        for (int i = 0; i < panes.size(); i++) {
            panes.get(i).update(temp, humidity, pressure);
        }
    }
}
