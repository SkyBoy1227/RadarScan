package com.yqy.leidascandemo;

import android.app.Activity;
import android.os.Bundle;

import com.yqy.leidascandemo.view.RadarView;

public class MainActivity extends Activity {

	private RadarView mRadarView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mRadarView = (RadarView) findViewById(R.id.radar_view);
		mRadarView.setSearching(true);
		for (int i = 0; i < 10; i++) {
			mRadarView.addPoint();
		}
	}

}