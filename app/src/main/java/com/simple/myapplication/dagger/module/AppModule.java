package com.simple.myapplication.dagger.module;

import com.simple.myapplication.app.WApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private WApplication application;

    public AppModule(WApplication application) {
        this.application = application;
    }
    @Provides
    @Singleton
    WApplication provideApplicationContext(){
        return application;
    }
}
