package com.example.lenovo.scarnersdice;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class aboutme extends AppCompatActivity {
    Button fb;
    TextView email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutme);
        fb= (Button)findViewById(R.id.button11);
        email = (TextView)findViewById(R.id.textView18);

        SpannableString content = new SpannableString("adityan.shahi2014@gmail.com");
        content.setSpan(new UnderlineSpan(), 0, content.length(), 0);


        email.setText(content);

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailintent = new Intent(android.content.Intent.ACTION_SEND);
                emailintent.setType("plain/text");
                emailintent.putExtra(android.content.Intent.EXTRA_EMAIL,new String[] {"adityan.shahi2014@gmail.com" });
                emailintent.putExtra(android.content.Intent.EXTRA_SUBJECT, "");
                emailintent.putExtra(android.content.Intent.EXTRA_TEXT,"");
                startActivity(Intent.createChooser(emailintent, "Send mail..."));
            }
        });

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://www.facebook.com/aditya9935");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent j = new Intent(aboutme.this,mpage.class);
        startActivity(j);
        finish();
    }
}
