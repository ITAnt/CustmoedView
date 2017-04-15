package com.itant.customedview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	private ImageText it_test;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		it_test = (ImageText) findViewById(R.id.it_test);
		it_test.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Toast.makeText(this, "click", Toast.LENGTH_SHORT).show();
	}

	
}
