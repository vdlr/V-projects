package com.vd.v3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

import com.vd.v3.service.MyService;

public class MainActivity extends Activity {

	//register service (if not yet)
	
	//create db (if not yet)
	
	//read status
	
	//refresh
	
	//paint data
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //start myService
        Intent myServiceIntent = new Intent();
        myServiceIntent.setAction(MyService.class.getName());
        startService(myServiceIntent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    
    
}
