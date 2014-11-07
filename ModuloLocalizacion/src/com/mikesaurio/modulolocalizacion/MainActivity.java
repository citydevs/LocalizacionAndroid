package com.mikesaurio.modulolocalizacion;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ServicioLocalizacion.activity = MainActivity.this;
		startService(new Intent(MainActivity.this,ServicioLocalizacion.class));
		
		
		
		
	}
}
