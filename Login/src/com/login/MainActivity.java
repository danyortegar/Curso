package com.login;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button btnentrar=(Button)findViewById(R.id.btnentrar);
		btnentrar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				EditText user=(EditText)findViewById(R.id.etuser);
				EditText pass=(EditText)findViewById(R.id.etpass);
				if(user.getText().toString().equals("Daniel")&&
						pass.getText().toString().equals("1234")){
					Toast.makeText(arg0.getContext(), "Acceso Exitoso", Toast.LENGTH_SHORT).show();
				}
				else{
					Toast.makeText(arg0.getContext(), "El usuario y/o contraseña son incorrectos", Toast.LENGTH_SHORT).show();
				}
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
