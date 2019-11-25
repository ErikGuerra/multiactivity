package com.example.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PRINCIPAL extends AppCompatActivity {
  Button btnprincipal1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        btnprincipal1=findViewById(R.id.btnprincipal);

        btnprincipal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pasar1=new Intent(PRINCIPAL.this, MainActivity. class);
                startActivity(pasar1);
            }
        });

    }
}
