package com.simple.myapplication.app;

import android.app.Application;

import com.simple.myapplication.dagger.component.AppComponent;
import com.simple.myapplication.dagger.component.DaggerAppComponent;
import com.simple.myapplication.dagger.module.AppModule;

public class WApplication extends Application {
    private static WApplication instance;
    public static AppComponent appComponent = null;

    public static synchronized WApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static AppComponent getAppComponent(){
        if (appComponent == null) {
            appComponent = DaggerAppComponent.builder()
                    .appModule(new AppModule(instance))
                    .build();
        }
        return appComponent;
    }
}
