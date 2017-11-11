package com.example.alondra.aplicacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //variables//
    Button btn;
    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);
        ratingBar = (RatingBar) findViewById(R.id.idratingBar);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                float ratingvalue = ratingBar.getRating();
                Toast.makeText(MainActivity.this,"Rating is " +ratingvalue,Toast.LENGTH_SHORT).show();
            }
        });
    } //Final del "OnCreate"//


} //Fin de Main Activity//