package com.example.colorlistview;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		getSupportFragmentManager().beginTransaction()
				.add(R.id.flContainer, new FragmentA()).commit();
	}

	public void openFragmentB(int color) {
		getSupportFragmentManager().beginTransaction()
				.add(R.id.flContainer, FragmentB.getInstance(color))
				.addToBackStack(null).commit();
	}
}
