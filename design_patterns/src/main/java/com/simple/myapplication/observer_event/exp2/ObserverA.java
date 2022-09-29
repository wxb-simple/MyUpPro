package com.simple.myapplication.observer_event.exp2;

public class ObserverA implements Observer {
    @Override
    public void process() {
        System.out.println("[ObserverA] processing");
    }
}
