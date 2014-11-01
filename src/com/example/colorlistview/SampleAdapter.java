package com.example.colorlistview;

import java.util.ArrayList;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class SampleAdapter extends ArrayAdapter<String> {
	private int mColor;

	public SampleAdapter(Context context, ArrayList<String> data, int color) {
		super(context, android.R.layout.simple_list_item_1, data);
		mColor = color;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View view = super.getView(position, convertView, parent);
		view.setBackgroundColor(mColor);
		return view;
	}

}
