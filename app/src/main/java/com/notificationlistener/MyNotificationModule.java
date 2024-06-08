package com.myproject;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class MyNotificationModule extends ReactContextBaseJavaModule {
    static {
        System.loadLibrary("mynotificationmodule");
    }

    private native String getNotification();

    public MyNotificationModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "MyNotificationModule";
    }

    @ReactMethod
    public void fetchNotification(Callback callback) {
        String notification = getNotification();
        callback.invoke(notification);
    }
}
