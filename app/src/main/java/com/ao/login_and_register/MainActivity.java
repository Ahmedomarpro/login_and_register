package com.ao.login_and_register;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
	private ImageButton btRegister;
	private TextView tvLogin;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		btRegister  = findViewById(R.id.btRegister);
		tvLogin     = findViewById(R.id.tvLogin);
		Button login     = findViewById(R.id.login);
		btRegister.setOnClickListener(this);

		login.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent   = new Intent(MainActivity.this,RegisterActivity.class);
				startActivity(intent);

			}
		});


	}
	@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
	@Override
	public void onClick(View view) {
		if (view == btRegister){
			Intent intent   = new Intent(MainActivity.this,RegisterActivity.class);
		//**********************************************************************************************************************
			Pair[] pairs    = new Pair[1];
			pairs[0] = new Pair<View,String>(tvLogin,"tv");
			ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,pairs);
			startActivity(intent,activityOptions.toBundle());
		//*****************************************************************************************************************************

		}
	}
}
