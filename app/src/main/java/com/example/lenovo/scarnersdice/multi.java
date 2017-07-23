package com.example.lenovo.scarnersdice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;
import java.util.logging.Handler;

public class multi extends AppCompatActivity {
    int score1=0,total1=0,total2=0,x;
    ImageView i1;
    int score2=0;
    Button r1,r2,p1,p2;
    TextView t1,t2,turndisplay1,turndisplay2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi);
        i1= (ImageView)findViewById(R.id.imageView);
        t1 = (TextView)findViewById(R.id.textView10);
        t2= (TextView)findViewById(R.id.textView11);
        turndisplay1 = (TextView)findViewById(R.id.textView12);
        turndisplay2= (TextView)findViewById(R.id.textView13);
        turndisplay2.setText(" ");
        r1=(Button)findViewById(R.id.button7);
        r2=(Button)findViewById(R.id.button8);
        p1=(Button)findViewById(R.id.button9);
        p2=(Button)findViewById(R.id.button6);

        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r= new Random();
                x=r.nextInt(7-1)+1;
                if(score1>=50)
                {
                Intent j = new Intent(multi.this,win1.class);
                    startActivity(j);
                    finish();
                }
                else  if(x==1)
                {
                    i1.setImageResource(R.drawable.dice1);
                    t1.setText(String.valueOf(total1));
                    score1=total1;
                    turndisplay1.setText(" ");
                    turndisplay2.setText("Your Turn");

                }
                else if(x==2)
                {
                    i1.setImageResource(R.drawable.dice2);
                    score1+=x;
                    t1.setText(String.valueOf(score1));
                }
                else if(x==3)
                {
                    i1.setImageResource(R.drawable.dice3);
                    score1+=x;
                    t1.setText(String.valueOf(score1));
                }
                else if(x==4)
                {
                    i1.setImageResource(R.drawable.dice4);
                    score1+=x;
                    t1.setText(String.valueOf(score1));
                }
                else if(x==5)
                {
                    i1.setImageResource(R.drawable.dice5);
                    score1+=x;
                    t1.setText(String.valueOf(score1));
                }
                else if(x==6)
                {
                    i1.setImageResource(R.drawable.dice6);
                    score1+=x;
                    t1.setText(String.valueOf(score1));
                }
            }
        });

        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r= new Random();
                x=r.nextInt(7-1)+1;
                if(score2>=50)
                {
                    Intent j = new Intent(multi.this,win2.class);
                    startActivity(j);
                    finish();
                }
                else if(x==1)
                {
                    i1.setImageResource(R.drawable.dice1);
                    t2.setText(String.valueOf(total2));
                    score2=total2;
                    turndisplay2.setText(" ");
                    turndisplay1.setText("Your Turn");

                }
                else if(x==2)
                {
                    i1.setImageResource(R.drawable.dice2);
                    score2+=x;
                    t2.setText(String.valueOf(score2));
                }
                else if(x==3)
                {
                    i1.setImageResource(R.drawable.dice3);
                    score2+=x;
                    t2.setText(String.valueOf(score2));
                }
                else if(x==4)
                {
                    i1.setImageResource(R.drawable.dice4);
                    score2+=x;
                    t2.setText(String.valueOf(score2));
                }
                else if(x==5)
                {
                    i1.setImageResource(R.drawable.dice5);
                    score2+=x;
                    t2.setText(String.valueOf(score2));
                }
                else if(x==6)
                {
                    i1.setImageResource(R.drawable.dice6);
                    score2+=x;
                    t2.setText(String.valueOf(score2));
                }
            }
        });

        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total1+=score1;
                i1.setImageResource(R.drawable.wait);
                turndisplay1.setText(" ");
                turndisplay2.setText("Your Turn");
                score1=total1;

            }
        });

        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total2+=score2;
                i1.setImageResource(R.drawable.wait);
                turndisplay1.setText("Your Turn");
                turndisplay2.setText(" ");
                score2=total2;
            }
        });


}
        }