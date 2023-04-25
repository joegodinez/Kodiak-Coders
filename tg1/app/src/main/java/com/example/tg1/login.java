package com.example.tg1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class login extends AppCompatActivity {

    Button login;

    EditText login_username, login_password;
    TextView username_error, password_error, not_found;

    kodiak_users kc = new kodiak_users();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login_username = findViewById(R.id.sign_in_username_field);
        login_password = findViewById(R.id.sign_in_password_field);

        username_error = findViewById(R.id.username_error_message);
        username_error.setVisibility(View.GONE);
        password_error = findViewById(R.id.password_error_message);
        password_error.setVisibility(View.GONE);
        not_found = findViewById(R.id.not_found_message);
        not_found.setVisibility(View.INVISIBLE);

        login = (Button)findViewById(R.id.sign_in_login_button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean check = checkAdmin(login_username.getText().toString(),
                        login_password.getText().toString(), kc.kc);

                if(check == true) {
                    open_user_home();
                }
                else{
                    not_found.setVisibility(View.VISIBLE);
                }
            }
        });

        changeMonitor();

    }

    private boolean checkAdmin(String username, String password, user[] kc) {
        boolean yes = false;
        for(int i=0; i<5; i++) {
            if(username.equals(kc[i].email) && password.equals(kc[i].password)) {
                user_home.current_user = kc[i];
                yes = true;
            }
        }
        return yes;
     }

    private void checkUsernameEmpty(String username) {
        if(username.length() > 0 && username_error.getVisibility() == View.VISIBLE) {
            username_error.setVisibility(View.GONE);
        }
        else if(username.length() == 0){
            username_error.setVisibility(View.VISIBLE);
        }
    }

    private void checkPasswordEmpty(String password) {
        if(password.length() > 0 && password_error.getVisibility() == View.VISIBLE) {
            password_error.setVisibility(View.GONE);
        }
        else if(password.length() == 0){
            password_error.setVisibility(View.VISIBLE);
        }
    }

    private void changeMonitor() {

        login_username.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                checkUsernameEmpty(login_username.getText().toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        login_password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                checkPasswordEmpty(login_password.getText().toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    public void open_user_home() {
        Intent intent = new Intent(this, user_home.class);
        startActivity(intent);
    }
}