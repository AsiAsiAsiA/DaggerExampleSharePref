package com.andrewxa.a36dagger2simpleexample;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
interface AppComponent {
    void inject(App app);
}