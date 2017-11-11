package com.example.alondra.aplicacion;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //variables//
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.idtxt);
        textView.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view)
            {
                String myvar = textView.getText().toString();
                Toast.makeText(MainActivity.this,myvar, Toast.LENGTH_SHORT).show();
            }
        });
    } //Final del "OnCreate"//


} //Fin de Main Activity//