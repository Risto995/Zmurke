package com.example.riki.myplaces;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        setTitle("Change password");

        final ImageView button1 = (ImageView) findViewById(R.id.cancelButton);
        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                finish();

            }
        });

    }
}
