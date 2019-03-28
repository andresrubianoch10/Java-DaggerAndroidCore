package com.arubianoch.daggeraandroidcomponenttest;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author Andres Rubiano Del Chiaro
 */
@Module
public class AppModule {

    private final MyApplication myApplication;

    public AppModule(MyApplication myApplication) {
        this.myApplication = myApplication;
    }

    @Provides
    @Singleton
    Context provideAppContext() {
        return myApplication;
    }

    @Provides
    @Singleton
    SharedPreferences provideSharedPreferences(Context context) {
        return context.getSharedPreferences("pref", Context.MODE_PRIVATE);
    }

    @Provides
    Resources getResources(Context context) {
        return context.getResources();
    }
}
