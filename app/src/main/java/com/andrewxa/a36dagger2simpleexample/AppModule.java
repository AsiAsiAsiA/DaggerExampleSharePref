package com.andrewxa.a36dagger2simpleexample;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.AndroidInjectionModule;
import dagger.android.ContributesAndroidInjector;

@Module(includes = AndroidInjectionModule.class)
abstract class AppModule {
    @Binds
    @Singleton
    abstract Application application(App app);

    @Binds
    @PerActivity
    abstract Context activityContext(MainActivity mainActivity);

    @PerActivity
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity mainActivityInjector();
}