package com.mobilesiri.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fadeIn(View view) {
        ImageView image = (ImageView) findViewById(R.id.mobile_siri);
        Animation startFadeIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fadein);
        image.startAnimation(startFadeIn);

    }

    public void fadeOut(View view) {
        ImageView image = (ImageView) findViewById(R.id.mobile_siri);
        Animation startFadeOut = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fadeout);
        image.startAnimation(startFadeOut);

    }

    public void blink(View view) {
        ImageView image = (ImageView) findViewById(R.id.mobile_siri);
        Animation startBlink = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        image.startAnimation(startBlink);

    }

    public void zoomIn(View view) {
        ImageView image = (ImageView) findViewById(R.id.mobile_siri);
        Animation startZoomIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoomin);
        image.startAnimation(startZoomIn);

    }

    public void zoomOut(View view) {
        ImageView image = (ImageView) findViewById(R.id.mobile_siri);
        Animation startZoomOut = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoomout);
        image.startAnimation(startZoomOut);

    }
}
