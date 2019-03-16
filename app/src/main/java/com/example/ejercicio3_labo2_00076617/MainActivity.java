package com.example.ejercicio3_labo2_00076617;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.ejercicio3_labo2_00076617.R.color;

import java.util.Random;

import static com.example.ejercicio3_labo2_00076617.R.color.br_blue;
import static com.example.ejercicio3_labo2_00076617.R.color.br_green;

public class MainActivity extends AppCompatActivity {

    private int [] ColorArray = {
            R.color.br_red, color.br_green, br_blue};

    private int cont1 = 0;
    private int cont2 = 1;
    private int cont3 = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout ll1 = findViewById(R.id.ll1);
        final LinearLayout ll2 = findViewById(R.id.ll2);
        final LinearLayout ll3 = findViewById(R.id.ll3);

        ll1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cont2 < 3){
                    ll1.setBackgroundColor(getResources().getColor(ColorArray[cont2]));
                    cont2+=1;
                }else {
                    cont2=0;
                }
            }
        });
        ll2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cont3 < 3){
                    ll2.setBackgroundColor(getResources().getColor(ColorArray[cont3]));
                    cont3+=1;
                }else {
                    cont3=0;
                }
            }
        });
        ll3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cont1 < 3){
                    ll3.setBackgroundColor(getResources().getColor(ColorArray[cont1]));
                    cont1+=1;
                }else {
                    cont1=0;
                }
            }
        });

    }


}
