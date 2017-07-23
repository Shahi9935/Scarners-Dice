package com.example.lenovo.scarnersdice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        splash s= new splash();
        s.start();
    }
    class splash extends Thread{
        public void run()
        {
            try{
                sleep(2000);
            }catch(Exception e){}
            Intent j= new Intent(MainActivity.this,mpage.class);
            startActivity(j);
            finish();

        }
    }
}
