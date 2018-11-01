package com.andrewxa.a36dagger2simpleexample;

import android.app.Activity;
import android.content.Context;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MainActivityModule {
    /*@PerFragment
    @ContributesAndroidInjector(modules = MainFragmentModule.class)
    abstract MainFragment mainFragmentInjector();*/
//    @Binds
//    @PerActivity
//    abstract Context activityContext(Activity activity);

}