package com.arubianoch.daggeraandroidcomponenttest;

import android.app.Application;

/**
 * @author Andres Rubiano Del Chiaro
 */
public class MyApplication extends Application {

    AppComponent myComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        myComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return myComponent;
    }
}
