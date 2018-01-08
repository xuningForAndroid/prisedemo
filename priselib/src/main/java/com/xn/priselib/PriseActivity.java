package com.xn.priselib;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

/**
 * 点赞效果的制作
 */
public class PriseActivity extends AppCompatActivity implements View.OnClickListener{
    private Button button;
    private TextView textView;
    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animation = AnimationUtils.loadAnimation(PriseActivity.this, R.anim.nn);
        button=findViewById(R.id.bt_one);
        button.setOnClickListener(this);
        textView=findViewById(R.id.tv_one);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.bt_one){
            textView.setVisibility(View.VISIBLE);
            textView.startAnimation(animation);
            new Handler().postDelayed(new Runnable(){
                public void run() {
                    textView.setVisibility(View.GONE);
                }
            }, 1000);
        }
    }


}
