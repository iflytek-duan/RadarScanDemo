package com.zihao.radar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zihao.radar.view.RadarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    /**
     * TODO <初始化视图/>
     */
    private void initView(){
        RadarView mRadarView = (RadarView) findViewById(R.id.radar_view);
        mRadarView.setSearching(true);
        mRadarView.addPoint();
        mRadarView.addPoint();
    }

}