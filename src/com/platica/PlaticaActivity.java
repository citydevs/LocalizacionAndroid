package com.platica;

import com.mikesaurio.modulolocalizacion.ServicioLocalizacion;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class PlaticaActivity extends Activity {
 
	TextView tv_hola;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_platica);
		
		tv_hola =(TextView)findViewById(R.id.tv_hola);
		
		startService(new Intent(PlaticaActivity.this, ServicioLocalizacion.class));
		
		
		tv_hola.setText(getResources().getString(R.string.hola));
	}
}
