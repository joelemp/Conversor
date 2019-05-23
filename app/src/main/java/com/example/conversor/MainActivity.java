package com.example.conversor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void temp(View v)
    {
        Intent sig=new Intent(this,temp.class);
        sig.putExtra("TITULOT","TEMPERATURA-");
             startActivity(sig);
    }
    public void area(View v)
    {
        Intent sig=new Intent(this,area.class);
        sig.putExtra("TITULOA","AREA");
        startActivity(sig);
    }
    public void dist(View v)
    {
        Intent sig=new Intent(this,distancia.class);
        sig.putExtra("TITULOD","DISTANCIA");
        startActivity(sig);
    }
}
