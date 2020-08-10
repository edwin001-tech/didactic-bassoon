package com.example.self;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class LoginActivity extends AppCompatActivity {
    private Button loginButton;
    private Button createAcctButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginButton = findViewById(R.id.email_sign_in_button);
        createAcctButton = findViewById(R.id.create_acct_button_login);

        createAcctButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,
                        CreateAccountActivity.class));
            }
        });
    }
}