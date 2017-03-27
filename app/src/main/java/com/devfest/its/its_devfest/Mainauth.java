package com.devfest.its.its_devfest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mainauth extends AppCompatActivity {
    Button login,signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainauth2);
        login = (Button) findViewById(R.id.btn_l);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mainauth.this,Login.class);
                startActivity(intent);
            }
        });
        signup = (Button) findViewById(R.id.btn_register);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mainauth.this,Register.class);
                startActivity(intent);
            }
        });
    }
}
