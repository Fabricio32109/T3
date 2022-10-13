package com.example.calculkadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    float respuesta=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1=(Button)findViewById(R.id.button);
        Button btn2=(Button)findViewById(R.id.button2);
        Button btn3=(Button)findViewById(R.id.button3);
        Button btn4=(Button)findViewById(R.id.button4);
        Button btn5=(Button)findViewById(R.id.button5);

        TextView num1 =(TextView) findViewById(R.id.num);
        TextView num2 =(TextView) findViewById(R.id.num2);
        TextView num3 =(TextView) findViewById(R.id.num3);
        TextView op=(TextView) findViewById(R.id.opx);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                respuesta=Float.parseFloat(num1.getText().toString())+Float.parseFloat(num2.getText().toString());
                op.setText("Suma");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                respuesta=Float.parseFloat(num1.getText().toString())-Float.parseFloat(num2.getText().toString());
                op.setText("Resta");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                respuesta=Float.parseFloat(num1.getText().toString())*Float.parseFloat(num2.getText().toString());
                op.setText("Multiplicación");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                respuesta=Float.parseFloat(num1.getText().toString())/Float.parseFloat(num2.getText().toString());
                op.setText("Division");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num3.setText(respuesta+"");
            }
        });
    }
}