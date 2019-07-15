package com.ogunjinmi.alc4phase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class My_ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my__profile);

        UtilsActivity.darkenStatusBar(this, R.color.colorPrimary);
    }
}
