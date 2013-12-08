package com.vd.v3.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService extends Service {
	public MyService() {
		
	}

	@Override
	public IBinder onBind(Intent intent) {
		// TODO: Return the communication channel to the service.
		throw new UnsupportedOperationException("Not yet implemented");
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		// TODO Auto-generated method stub
		return super.onStartCommand(intent, flags, startId);
	}
	// TODO process (scheduled)
	  // TODO call actions (return dataunit, types Location, Battery...)
	  // TODO write data
	  // TODO update status
	
	// TODO bd write
}
