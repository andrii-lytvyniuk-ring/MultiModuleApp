package alytvyniuk.com.base;

import android.util.Log;

import alytvyniuk.com.base.di.LegacyDiComponent;
import dagger.android.DaggerApplication;

public abstract class LegacyApplication extends DaggerApplication {

    private static final String TAG = "LegacyApplication";

    private static LegacyApplication instance;

    public static LegacyApplication getInstance() {
        return instance;
    }

    public static LegacyDiComponent getRingApplicationComponent() {
        return (LegacyDiComponent) instance.applicationInjector();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        Log.d(TAG, "App onCreate, initialize required libraries");
    }
}
