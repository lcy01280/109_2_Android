package com.example.drawtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView battery;
    private int imageLevel = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        battery = findViewById(R.id.battery);
        battery.setImageLevel(imageLevel);

    }

    public void setBatteryLevel(View view){
        if(view.getId() == R.id.plus){
            if (imageLevel < 6){
                imageLevel++;
                battery.setImageLevel(imageLevel);
            }
        }

        if(view.getId() == R.id.minus){
            if (imageLevel > 0){
                imageLevel--;
                battery.setImageLevel(imageLevel);
            }
        }
    }
}