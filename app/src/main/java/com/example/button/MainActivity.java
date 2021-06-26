package com.example.button;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.lang.Math;
public class MainActivity extends AppCompatActivity {
    ImageButton b1;
    int width = (Resources.getSystem().getDisplayMetrics().widthPixels)-200;
    int height = (Resources.getSystem().getDisplayMetrics().heightPixels)-400;
    int min = 0;
    int rotate = 360;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 =  findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                    int x = (int)(Math.random()*(width-min+1)+min);
                    int y = (int)(Math.random()*(height-min+1)+min);
                    b1.setX(x);
                    b1.setY(y);
                    b1.setRotation((int)(Math.random()*(rotate-min+1)+min));
                    b1.playSoundEffect(1);
                    MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.ring);
                    ring.start();
            }
        });
    }
}
