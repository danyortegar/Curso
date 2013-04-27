package com.suma;

import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
	static EditText numero1;
	static EditText numero2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero1=(EditText) findViewById(R.id.n1);
        numero2=(EditText) findViewById(R.id.n2);
        
        Button btnsuma= (Button)findViewById(R.id.btnsumar);
        btnsuma.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(numero1.getText().toString().length()==0||
						numero2.getText().toString().length()==0){
				Toast.makeText(v.getContext(), "Ingrese los valores!",Toast.LENGTH_SHORT ).show();
				}
				else{
					float rsum=Float.parseFloat(numero1.getText().toString())+Float.parseFloat(numero2.getText().toString());
					Toast.makeText(v.getContext(), "El resultado de la suma es= "+rsum,Toast.LENGTH_SHORT ).show();
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
