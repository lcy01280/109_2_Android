package com.example.checkboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String topping = "Toppings:";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CheckBoxChecked(String string, CheckBox checkbox) {
        if (checkbox.isChecked()){
            if(!topping.contains(string)) {
                topping = topping.concat(" "+string);
            }
        }
        else{
            if(topping.contains(string)){
                topping  = topping.replace(" "+string, "");
            }
        }
    }

    public void ShowToast(View view){
        CheckBoxChecked(getString(R.string.choco), findViewById(R.id.chocolate));
        CheckBoxChecked(getString(R.string.sprin), findViewById(R.id.sprinkles));
        CheckBoxChecked(getString(R.string.nuts), findViewById(R.id.nuts));
        CheckBoxChecked(getString(R.string.cherry), findViewById(R.id.cherry));
        CheckBoxChecked(getString(R.string.orio), findViewById(R.id.orio));
        Toast.makeText(this,topping,Toast.LENGTH_SHORT).show();
    }
}