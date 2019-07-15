package com.ogunjinmi.alc4phase1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import java.net.URL;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button AtALCBtn, MProBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AtALCBtn = findViewById(R.id.AboutALC);
        AtALCBtn.setOnClickListener(this);
        MProBtn = findViewById(R.id.MyProfile);
        MProBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.AboutALC: {
                startActivity(new Intent(MainActivity.this, About_ALCActivity.class));
            }
                break;
            case R.id.MyProfile: {
                startActivity(new Intent(MainActivity.this, My_ProfileActivity.class));
            }
        }
    }
}