package com.example.alondra.aplicacion;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //variables//
    Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aSwitch = (Switch) findViewById(R.id.idSwitch);
    }
    public void onSwitchClick(View v)
    {
        if(aSwitch.isChecked())
        {
            Toast.makeText(this,"Toggle ON",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this,"Toggle OFF",Toast.LENGTH_SHORT).show();
        }
    } //Final del "OnCreate"//


} //Fin de Main Activity//