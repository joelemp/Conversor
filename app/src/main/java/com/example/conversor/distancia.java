package com.example.conversor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class distancia extends AppCompatActivity {

    Button convertir=null;
    EditText cantidad=null;
    TextView resultado=null;
    Spinner spincl=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent recibir=getIntent();
        String titulo=recibir.getStringExtra("TITULOD");
        setTitle(titulo);
        setContentView(R.layout.activity_distancia);
        convertir=(Button)findViewById(R.id.btnten);
        cantidad=(EditText)findViewById(R.id.cant);
        resultado=(TextView)findViewById(R.id.Resu);
        spincl=(Spinner)findViewById(R.id.spinla);
        String[]op={"Selecciona una opcion ▼","METRO A CENTIMETRO","CENTIMETRO A METRO"};
        ArrayAdapter<String> adapter=new
                ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,op);
        spincl.setAdapter(adapter);
        convertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    if (cantidad.getText().toString().equals(""))
                    {
                        Toast mag=Toast.makeText(getApplicationContext(),"ESCRIBE UNA CANTIDAD",Toast.LENGTH_SHORT);
                        mag.show();
                    }
                    else
                    {
                        Double c=Double.parseDouble(cantidad.getText().toString());
                        Double res=null;
                        int select=spincl.getSelectedItemPosition();

                        switch (select)
                        {
                            case 0:
                                res=0.0;
                                Toast.makeText(distancia.this, "SELECCIONA UNA OPCION", Toast.LENGTH_SHORT).show();

                            case 1:
                                res=c * 100 ;
                                break;
                            case 2:
                                res=c/100;
                        }
                        if(select==1)
                        {
                            resultado.setText(res.toString()+" cm.");
                        }
                        else if(select==2)
                        {
                            resultado.setText(res.toString()+" m.");
                        }
                    }
                }
                catch (Exception e)
                {}
            }
        });
    }
}
