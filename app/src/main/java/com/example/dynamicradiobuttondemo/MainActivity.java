package com.example.dynamicradiobuttondemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup RG;
    ConstraintLayout CL;
    RadioButton RBHP,RBPB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RG = new RadioGroup(this);
        CL = (ConstraintLayout) findViewById(R.id.constraintLayout);
        RBHP = new RadioButton(this);
        RBPB = new RadioButton(this);

        RBHP.setText("CHITKARA Himachal Pradesh Campus");
        RBPB.setText("CHITKARA Punjab Campus");

        RG.addView(RBHP);
        RG.addView(RBPB);

        ConstraintLayout.LayoutParams CLPRM = new ConstraintLayout.LayoutParams((int) ConstraintLayout.LayoutParams.WRAP_CONTENT,(int) ConstraintLayout.LayoutParams.WRAP_CONTENT);

        CLPRM.leftMargin=160;
        CLPRM.topMargin=300;

        RG.setLayoutParams(CLPRM);
        CL.addView(RG);


        RG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = (RadioButton) findViewById(checkedId);
                Toast.makeText(getApplicationContext(),radioButton.getText(),Toast.LENGTH_LONG).show();
            }
        });
    }
}