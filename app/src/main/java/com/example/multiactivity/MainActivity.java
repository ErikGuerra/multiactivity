package com.example.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnSUMA1;
Button btnRESTA2;
    Button btnMULTIPLICACION3;
    Button btnDIVISION4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSUMA1=findViewById(R.id.btnSUM);
        btnRESTA2=findViewById(R.id.btnRES);
        btnMULTIPLICACION3=findViewById(R.id.btnMULTI);
        btnDIVISION4=findViewById(R.id.btnDIV);


        btnSUMA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pasar1=new Intent(MainActivity.this, SUM. class);
 startActivity(pasar1);
            }
        });
         btnRESTA2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent pasar1=new Intent(MainActivity.this, REST. class);
            startActivity(pasar1);
        }
         });
        btnMULTIPLICACION3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pasar1=new Intent(MainActivity.this, MULT. class);
                startActivity(pasar1);
            }
        });
        btnDIVISION4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pasar1=new Intent(MainActivity.this, DIV. class);
                startActivity(pasar1);
            }
        });
    }
}
