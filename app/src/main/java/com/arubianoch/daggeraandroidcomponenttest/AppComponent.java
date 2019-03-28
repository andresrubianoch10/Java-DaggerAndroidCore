package com.arubianoch.daggeraandroidcomponenttest;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author Andres Rubiano Del Chiaro
 */
@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(MyApplication application);
    void inject(MainActivity mainActivity);
}
