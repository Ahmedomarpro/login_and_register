package com.ao.login_and_register;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;

public class RegisterActivity extends AppCompatActivity {

	private RelativeLayout rlayout;
	private Animation animation;


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
