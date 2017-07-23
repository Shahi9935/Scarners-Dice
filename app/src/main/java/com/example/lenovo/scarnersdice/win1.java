package com.example.lenovo.scarnersdice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class win1 extends AppCompatActivity {

    Button mmwin1 = (Button)findViewById(R.id.button13);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win1);
        mmwin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j= new Intent(win1.this,mpage.class);
                startActivity(j);
                finish();
            }
        });
    }
}
