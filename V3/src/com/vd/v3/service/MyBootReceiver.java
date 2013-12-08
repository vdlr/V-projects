package com.vd.v3.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyBootReceiver extends BroadcastReceiver {
    public MyBootReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        //start MyService
    	Intent myServiceIntent = new Intent(context, MyService.class);
    	context.startService(myServiceIntent);
    }
}
