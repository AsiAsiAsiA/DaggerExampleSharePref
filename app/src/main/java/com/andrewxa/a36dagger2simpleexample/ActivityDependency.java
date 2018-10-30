package com.andrewxa.a36dagger2simpleexample;

import javax.inject.Inject;

@PerActivity
public final class ActivityDependency {
    @Inject
    ActivityDependency() {
    }

    public void helloMethod() {
        System.out.println("Hello method");
    }
}