package com.example.exapp;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginScreen extends ActionBarActivity implements OnClickListener {

	
	EditText etusername,etpassword;
	Button btnverify,btnback;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login_screen);
		
		etusername = (EditText) findViewById(R.id.etusername);
		etpassword = (EditText) findViewById(R.id.etpassword);
		
		btnverify = (Button) findViewById(R.id.btnverify);
		btnverify.setOnClickListener(this);
		btnback = (Button) findViewById(R.id.btnback);
		btnback.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnverify:
			
			String username = "Modern Mum";
			String password = "babydaddy";
			
		 if (etusername.getText().toString().equals("")){
				Toast.makeText(getApplicationContext(), "Enter your Username ", Toast.LENGTH_SHORT).show();
			}
			else if (etpassword.getText().toString().equals("")){
				Toast.makeText(getApplicationContext(), "Enter your Password ", Toast.LENGTH_SHORT).show();
			}
			else if(etusername.getText().toString().equals(username) && etpassword.getText().toString().equals(password)){
				Toast.makeText(getApplicationContext(), "Welcome To Modern Mum,:-) ", Toast.LENGTH_SHORT).show();
			}
			break;
			
		case R.id.btnback:
			Toast.makeText(LoginScreen.this, "Welcome back" , Toast.LENGTH_SHORT).show();
			startActivity(new Intent(getApplicationContext(),WelcomeScreen.class));
			break;


		default:
			break;
		}
		
	}

	
}
