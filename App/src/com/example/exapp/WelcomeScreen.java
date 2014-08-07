package com.example.exapp;
import com.example.exapp.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
public class WelcomeScreen extends ActionBarActivity implements OnClickListener {

Button btnRegister,btnLogin;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome_screen);
		
		btnRegister=(Button) findViewById(R.id.btnregister);
		btnRegister.setOnClickListener(this);
		btnLogin=(Button) findViewById(R.id.btnlogin);
		btnLogin.setOnClickListener(this);
			
	}


	@Override
	public void onClick(View v) {
switch (v.getId()) {
case R.id.btnregister:
	Toast.makeText(WelcomeScreen.this, "Register" , Toast.LENGTH_SHORT).show();
	startActivity(new Intent(getApplicationContext(),RegisterScreen.class));
	break;
	
case R.id.btnlogin:
	Toast.makeText(WelcomeScreen.this, "Login" , Toast.LENGTH_SHORT).show();
	startActivity(new Intent(getApplicationContext(),LoginScreen.class));
	
	

default:
	break;
}
		
	}

	
	}

