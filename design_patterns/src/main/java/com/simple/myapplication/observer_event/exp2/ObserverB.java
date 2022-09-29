package com.simple.myapplication.observer_event.exp2;

public class ObserverB implements Observer {
    @Override
    public void process() {
        System.out.println("[ObserverB] processing");
    }
}
