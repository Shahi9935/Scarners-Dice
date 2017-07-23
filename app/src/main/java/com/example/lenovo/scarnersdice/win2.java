package com.example.lenovo.scarnersdice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class win2 extends AppCompatActivity {

    Button mmwin2 = (Button)findViewById(R.id.button12);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win2);

        mmwin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(win2.this,mpage.class);
                startActivity(j);
                finish();
            }
        });
    }
}
