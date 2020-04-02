package com.example.allstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onAmazon(View view) {
        onLoja("https://amazon.com.br");
    }
    public void onAme(View view) {
        onLoja("https://americanas.com.br");
    }
    public void onMagalu(View view) {
        onLoja("https://m.magazineluiza.com.br");
    }
    public void onSaraiva(View view) {
        onLoja("https://saraiva.com.br");
    }
    public void onSubmarino(View view) {
        onLoja("https://submarino.com.br");
    }

    protected void onLoja(String url){
        Intent intent = new Intent(this,WebviewActivity.class);
        intent.putExtra("url", url);
        startActivity(intent);
    }

    public void onSobre(View view){

        Intent intent2 = new Intent(this,Sobre.class);
        startActivity(intent2);
    }






}
