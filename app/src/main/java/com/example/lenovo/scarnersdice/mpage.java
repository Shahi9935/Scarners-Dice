package com.example.lenovo.scarnersdice;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class mpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mpage);
    }
    @Override
    public void onBackPressed()
    {
        createDialog();
    }
    private void createDialog()
    {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage("Are you sure you want to exit?");
        alert.setCancelable(false);

        alert.setPositiveButton("Yes",new DialogInterface.OnClickListener(){

            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                mpage.super.onBackPressed();
            }
        });

        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alert.create().show();
    }
    public void singleplayer(View v)
    {
    Intent j = new Intent(mpage.this,single.class);
        startActivity(j);
        finish();
    }
    public void multiplayer(View v)
    {
        Intent j = new Intent(mpage.this,multi.class);
        startActivity(j);
        finish();
    }
    public void aboutgame(View v)
    {
        Intent j = new Intent(mpage.this,aboutgame.class);
        startActivity(j);
        finish();
    }
    public void aboutme(View v)
    {
        Intent j = new Intent(mpage.this,aboutme.class);
        startActivity(j);
        finish();
    }
    public void exit(View v)
    {
        createDialog();
    }
}
