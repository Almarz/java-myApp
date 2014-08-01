package com.example.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.Toast;

public class Logins extends Activity implements OnClickListener,
		OnCheckedChangeListener {

	//Declaration - Global Variables
	EditText etuser, etpass;
	Button btntoast, btnback;
	CheckBox chshow;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.logins);

		//Initialization
		etuser = (EditText) findViewById(R.id.etuser);
		etpass = (EditText) findViewById(R.id.etpass);

		btntoast = (Button) findViewById(R.id.btnLoginToast);
		btntoast.setOnClickListener(this);

		btnback = (Button) findViewById(R.id.btnLoginback);
		btnback.setOnClickListener(this);

		chshow = (CheckBox) findViewById(R.id.chshow);
		chshow.setOnCheckedChangeListener(this);

	}

	@Override
	public void onClick(View v) {

		switch (v.getId()) {
		case R.id.btnLoginback:
			startActivity(new Intent(getApplicationContext(), Main.class));
			break;

		case R.id.btnLoginToast:
			
			String userName = "Akirachix";
			String password = "girls2013";
			
			//Check if both fields are empty
			if(etuser.getText().toString().equals("") && etpass.getText().toString().equals("")){
				Toast.makeText(getApplicationContext(), "Please enter username and password", Toast.LENGTH_SHORT).show();
			}
			//Check if user name is empty
			else if (etuser.getText().toString().equals("")){
				Toast.makeText(getApplicationContext(), "Please enter username ", Toast.LENGTH_SHORT).show();
			}
			else if (etpass.getText().toString().equals("")){
				Toast.makeText(getApplicationContext(), "Please enter Password ", Toast.LENGTH_SHORT).show();
			}//Validation
			else if(!etuser.getText().toString().equals(userName)) {
				Toast.makeText(getApplicationContext(), "Please enter the correct name ", Toast.LENGTH_SHORT).show();
			}
			else if(!etpass.getText().toString().equals(password)) {
				Toast.makeText(getApplicationContext(), "Please enter the correct password ", Toast.LENGTH_SHORT).show();
			}
			else if(etuser.getText().toString().equals(userName) && etpass.getText().toString().equals(password)){
				Toast.makeText(getApplicationContext(), "Login Success. Welcome. ", Toast.LENGTH_SHORT).show();
			}
			break;

		default:
			break;
		}
	}

	@Override
	public void onCheckedChanged(CompoundButton button, boolean checked) {
		if (!checked) {

			// showing password
			etpass.setTransformationMethod(PasswordTransformationMethod
					.getInstance());

		} else {

			// hiding password
			etpass.setTransformationMethod(HideReturnsTransformationMethod
					.getInstance());

		}

	}

}
