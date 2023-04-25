package com.example.tg1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    public Button home_login;
    public Button home_create_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        home_login = (Button)findViewById(R.id.home_login_button);
        home_create_account = (Button)findViewById(R.id.home_create_account_button);

        home_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_login();
            }
        });

        home_create_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_create_account();
            }
        });
    }

    public void open_login () {
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }

    public void open_create_account() {
        Intent intent = new Intent(this, create_account.class);
        startActivity(intent);
    }
}