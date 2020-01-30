package com.ao.login_and_register;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.ao.ui.HomePage;

public class RegisterActivity extends AppCompatActivity {

	private RelativeLayout rlayout;
	private Animation animation;

	private Button sign_up;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);

		Toolbar toolbar = findViewById(R.id.bgHeader);
		setSupportActionBar(toolbar);
		getSupportActionBar().setTitle("");
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);

		rlayout = findViewById(R.id.rlayout);
		animation = AnimationUtils.loadAnimation(this,R.anim.uptodowndiagonal);
		rlayout.setAnimation(animation);

		sign_up = findViewById(R.id.sign_UP);;
		sign_up.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(RegisterActivity.this, HomePage.class);
				startActivity(intent);

			}
		});

	}

	@Override
	public boolean onOptionsItemSelected(@NonNull MenuItem item) {
		switch (item.getItemId()){
			case android.R.id.home :
				onBackPressed();
				return true;
		}

		return super.onOptionsItemSelected(item);
	}
}
