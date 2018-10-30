package com.andrewxa.a36dagger2simpleexample;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

// PerActivity.java
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {
}