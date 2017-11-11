package com.example.alondra.aplicacion;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    //variables//
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.idSpinner);
        String [] countries={"México","Estados Unidos","Canadá","Brasil","España"};
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,countries);
        spinner.setAdapter(adapter);
    } //Final del "OnCreate"//


} //Fin de Main Activity//