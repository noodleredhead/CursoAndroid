package com.example.alondra.aplicacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //variables//
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.idBtn);
    }

    public void btnClick(View v){
        Toast.makeText(this,"Button was Clicked",Toast.LENGTH_SHORT).show();
    } //Final del "OnCreate"//


} //Fin de Main Activity//