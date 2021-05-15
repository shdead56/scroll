package com.example.scroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Asu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.asu);
        WebView webView =  (WebView)findViewById(R.id.video);


        webView = (WebView) findViewById(R.id.video);
        webView.loadUrl("https://pin.it/30wXOYV");
    }

}