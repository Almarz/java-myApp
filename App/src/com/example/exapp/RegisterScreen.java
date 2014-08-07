package com.example.exapp;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import android.os.Bundle;

public class RegisterScreen extends ActionBarActivity implements OnClickListener {

	
	EditText etusername,etemail,etpassword;
	Button btndisplay,btnback;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register_screen);
		
		etusername = (EditText) findViewById(R.id.etusername);
		etemail =(EditText) findViewById(R.id.etemail);
		etpassword = (EditText) findViewById(R.id.etpassword);
		
		btndisplay = (Button) findViewById(R.id.btndisplay);
		btndisplay.setOnClickListener(this);
		btnback = (Button) findViewById(R.id.btnback);
		btnback.setOnClickListener(this);

	
		
	}
	@Override
	public void onClick(View v) {
	switch (v.getId()) {
	case R.id.btndisplay:
		Toast.makeText(RegisterScreen.this, "User Details" , Toast.LENGTH_SHORT).show();
		startActivity(new Intent(getApplicationContext(),RegisterScreen.class));
		break;
		
	case R.id.btnback:
		Toast.makeText(RegisterScreen.this, "Welcome back" , Toast.LENGTH_SHORT).show();
		startActivity(new Intent(getApplicationContext(),WelcomeScreen.class));
		break;

	default:
		break;
	}
		
	}

	
}
