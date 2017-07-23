package com.example.lenovo.scarnersdice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class multi_splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_splash);

    }

    public void next(View v)
    {
        Intent j = new Intent(multi_splash.this,multi.class);
        startActivity(j);
        finish();
    }
}
