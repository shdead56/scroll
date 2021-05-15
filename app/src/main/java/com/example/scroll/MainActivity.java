package com.example.scroll;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton b2,b1,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b2=findViewById(R.id.imageButton2);
        b1=findViewById(R.id.imageButton);
        b4=findViewById(R.id.imageButton4);


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vid = new Intent().setClass(MainActivity.this,Asu.class);
                startActivity(vid);
            }
        });
    }

    public void mensaje(View view) {
        Toast.makeText(MainActivity.this,"A E A ",Toast.LENGTH_SHORT).show();
    }
}