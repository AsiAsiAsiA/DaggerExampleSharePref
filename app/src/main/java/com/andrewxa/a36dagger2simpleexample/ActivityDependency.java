package com.andrewxa.a36dagger2simpleexample;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import javax.inject.Inject;

@PerActivity
public final class ActivityDependency {
    private static final String TAG = "DaggerExample";

    private Context context;


    @Inject
    ActivityDependency(Context context) {
        this.context = context;
    }

    public void helloMethod() {
        Log.i(TAG, "Hello method "+ context.toString());
        Toast.makeText(context,"Inject context",Toast.LENGTH_LONG).show();
        Log.i(TAG, "Должен был появиться Toast");
    }
}