package com.example.upbuttonhw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ClickedImage(View view){
        Intent intent;
        switch (view.getId()){
            case R.id.donut:
                intent = new Intent(this,OrderActivity1.class);
                startActivity(intent);
                break;
            case R.id.froyo:
                intent = new Intent(this,OrderActivity2.class);
                startActivity(intent);
                break;
            case R.id.cream:
                intent = new Intent(this,OrderActivity3.class);
                startActivity(intent);
                break;
            default:break;
        }
    }

}