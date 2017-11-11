package com.example.alondra.aplicacion;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    //variables//
    ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButton = (ToggleButton) findViewById(R.id.idToggleButton);
    }
    public void onToggleClick(View v)
    {
        if(toggleButton.isChecked())
        {
            Toast.makeText(this,"Toggle ON",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this,"Toggle OFF", Toast.LENGTH_SHORT).show();
        }

    } //Final del "OnCreate"//


} //Fin de Main Activity//