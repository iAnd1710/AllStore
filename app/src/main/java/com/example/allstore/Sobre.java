package com.example.allstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Sobre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);

        Intent intent2 = getIntent();

        TextView txtLoja = findViewById(R.id.txtLoja);
        TextView txtNome = findViewById(R.id.txtNome);
        TextView txtRM = findViewById(R.id.txtRM);
        TextView txtEM = findViewById(R.id.txtEM);





    }
}
