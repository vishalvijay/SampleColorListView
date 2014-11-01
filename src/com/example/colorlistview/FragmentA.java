package com.example.colorlistview;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class FragmentA extends Fragment implements OnClickListener {
	private LinearLayout mainLinearLayout;
	private MainActivity mActivity;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		mActivity = (MainActivity) getActivity();
		return inflater.inflate(R.layout.fragment_a, container, false);
	}

	@Override
	public void onActivityCreated(@Nullable Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		preparLayout();
	}

	private void preparLayout() {
		mainLinearLayout = (LinearLayout) getView().findViewById(R.id.mainLL);

		Button b = new Button(getActivity());
		b.setOnClickListener(this);
		b.setText("Red");
		b.setTag(Color.RED);
		mainLinearLayout.addView(b);

		b = new Button(getActivity());
		b.setOnClickListener(this);
		b.setText("Geen");
		b.setTag(Color.GREEN);
		mainLinearLayout.addView(b);

		b = new Button(getActivity());
		b.setOnClickListener(this);
		b.setText("Blue");
		b.setTag(Color.BLUE);
		mainLinearLayout.addView(b);

		b = new Button(getActivity());
		b.setOnClickListener(this);
		b.setText("Yellow");
		b.setTag(Color.YELLOW);
		mainLinearLayout.addView(b);
	}

	@Override
	public void onClick(View v) {
		int color = (Integer) v.getTag();
		mActivity.openFragmentB(color);
	}
}
