package com.android.chcboxes19112107;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String message = "";
    CheckBox checkBoxChocolate;
    CheckBox checkBoxSprinkles;
    CheckBox checkBoxCrushed;
    CheckBox checkBoxCherries;
    CheckBox checkBoxOrio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBoxChocolate = (CheckBox) findViewById(R.id.checkChocolate);
        checkBoxSprinkles = (CheckBox) findViewById(R.id.sprinkles);
        checkBoxCrushed = (CheckBox) findViewById(R.id.crushed);
        checkBoxCherries = (CheckBox) findViewById(R.id.cherries);
        checkBoxOrio = (CheckBox) findViewById(R.id.ori);

    }
    public void checkChocolate(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.checkChocolate);
        changeColor(checkBox);
    }
    public void checkOri(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.ori);
        changeColor(checkBox);
    }

    public void checkCherries(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.cherries);
        changeColor(checkBox);
    }

    public void checkCrushed(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.crushed);
        changeColor(checkBox);
    }

    public void checkSprinkles(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.sprinkles);
        changeColor(checkBox);
    }
    public void changeColor(CheckBox checkBox){
        if(checkBox.isChecked()){
            checkBox.setButtonTintList(this.getResources().getColorStateList(R.color.pink));
        }
        else {
            checkBox.setButtonTintList(null);
        }
    }

    public void showToast(View view) {
        message = "Toppings : ";
        if(checkBoxChocolate.isChecked()){
            message = message + checkBoxChocolate.getText() + " ";
        }
        if(checkBoxSprinkles.isChecked()){
            message = message + checkBoxSprinkles.getText() + " ";
        }
        if(checkBoxCrushed.isChecked()){
            message = message + checkBoxCrushed.getText() + " ";
        }
        if(checkBoxCherries.isChecked()){
            message = message + checkBoxCherries.getText() + " ";
        }
        if(checkBoxOrio.isChecked()){
            message = message + checkBoxOrio.getText() + " ";
        }

        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }



}