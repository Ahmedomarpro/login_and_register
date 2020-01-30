package com.ao.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.ao.login_and_register.R;
import com.ao.ui.activity.Main_Ides;
import com.ao.ui.activity.Main_Job;
import com.ao.ui.activity.Main_Shadow;
import com.ao.ui.activity.Main_Status_details;

public class HomePage extends AppCompatActivity implements View.OnClickListener {

	protected Button statusDetails;
	protected Button shadow;
	protected Button job;
	protected Button ides;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.setContentView(R.layout.activity_home_page);
		initView();
	}

	@Override
	public void onClick(View view) {
		if (view.getId() == R.id.status_details) {
			startActivity(new Intent(HomePage.this, Main_Status_details.class));

		} else if (view.getId() == R.id.shadow) {
			startActivity(new Intent(HomePage.this, Main_Shadow.class));

		} else if (view.getId() == R.id.job) {
			startActivity(new Intent(HomePage.this, Main_Job.class));

		} else if (view.getId() == R.id.ides) {
			startActivity(new Intent(HomePage.this, Main_Ides.class));

		}
	}

	private void initView() {
		statusDetails = (Button) findViewById(R.id.status_details);
		statusDetails.setOnClickListener(HomePage.this);
		shadow = (Button) findViewById(R.id.shadow);
		shadow.setOnClickListener(HomePage.this);
		job = (Button) findViewById(R.id.job);
		job.setOnClickListener(HomePage.this);
		ides = (Button) findViewById(R.id.ides);
		ides.setOnClickListener(HomePage.this);
	}
}
