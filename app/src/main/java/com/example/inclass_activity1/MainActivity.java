package com.example.inclass_activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText weightEditTxt ;
    EditText heightEditTxt ;
    EditText bmi_txt ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weightEditTxt= findViewById(R.id.weightEditTxt);
        heightEditTxt= findViewById(R.id.heightEditTxt);
        bmi_txt= findViewById(R.id.bmi_txt);

    }

    public void button_OnClick(View view)
    {
        double weight = Double.parseDouble(weightEditTxt.getText().toString());
        double height = Double.parseDouble(heightEditTxt.getText().toString());

        double bmi = (weight)/(height*height);
        if(bmi<18.5) {
            bmi_txt.setText(Math.floor(bmi * 100) / 100 + " : " +"Underweight ");
        }
        if(bmi>18.5&&bmi<24.9) {
            bmi_txt.setText(Math.floor(bmi * 100) / 100 + " : " +"Normal");
        }
        if(bmi>25&&bmi<29.9) {
            bmi_txt.setText(Math.floor(bmi * 100) / 100 + " : " +"Overweight ");
        }
        if(bmi>=30) {
            bmi_txt.setText(Math.floor(bmi * 100) / 100 + " : " +"Obesity");
        }
    }
}