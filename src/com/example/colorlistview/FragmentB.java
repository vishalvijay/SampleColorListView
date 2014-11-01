package com.example.colorlistview;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class FragmentB extends Fragment {
	private ListView listView;
	private SampleAdapter mAdapter;
	private int mColor;
	private static String COLOR_KEY = "color";

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_b, container, false);
	}

	@Override
	public void onActivityCreated(@Nullable Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		preparLayout();
	}

	private void preparLayout() {
		listView = (ListView) getView().findViewById(R.id.lv);
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("String 1");
		arrayList.add("String 2");
		arrayList.add("String 3");
		arrayList.add("String 4");
		arrayList.add("String 5");
		arrayList.add("String 6");
		arrayList.add("String 7");
		arrayList.add("String 8");
		arrayList.add("String 9");
		mAdapter = new SampleAdapter(getActivity(), arrayList, mColor);
		listView.setAdapter(mAdapter);
	}

	public static FragmentB getInstance(int color) {
		FragmentB fb = new FragmentB();
		Bundle argument = new Bundle();
		argument.putInt(COLOR_KEY, color);
		fb.setArguments(argument);
		return fb;
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		if (!isAdded())
			return;
		mColor = getArguments().getInt(COLOR_KEY);
	}
}
