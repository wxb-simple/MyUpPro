package com.simple.myapplication.dagger.component;

import com.simple.myapplication.app.WApplication;
import com.simple.myapplication.dagger.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    WApplication getContext();
}
