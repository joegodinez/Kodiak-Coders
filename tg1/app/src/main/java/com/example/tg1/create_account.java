package com.example.tg1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class create_account extends AppCompatActivity {

    EditText new_name, new_username, new_password, verify_password;
    TextView name_error, username_error, password_error, verify_error;
    Button create_account_confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        new_name = (EditText) findViewById(R.id.new_name_input_field);
        new_username = (EditText) findViewById(R.id.new_username_input_field);
        new_password = (EditText) findViewById(R.id.new_password_input_field);
        verify_password = (EditText) findViewById(R.id.verify_input_field);

        name_error = (TextView) findViewById(R.id.new_name_error_message);
        name_error.setVisibility(View.GONE);
        username_error = (TextView) findViewById(R.id.new_username_error_message);
        username_error.setVisibility(View.GONE);
        password_error = (TextView) findViewById(R.id.new_password_error_message);
        password_error.setVisibility(View.GONE);
        verify_error = (TextView) findViewById(R.id.verify_error_message);
        verify_error.setVisibility(View.GONE);

        create_account_confirm = (Button) findViewById(R.id.register_new_account_button);
        create_account_confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_user_home();
            }
        });

        changeMonitor();

        if(name_error.getVisibility() == View.GONE &&
            username_error.getVisibility() == View.GONE &&
            password_error.getVisibility() == View.GONE &&
            verify_error.getVisibility() == View.GONE)
        {
            create_account_confirm.setVisibility(View.VISIBLE);
        }
        else {
            create_account_confirm.setVisibility(View.INVISIBLE);
        }
    }

    private void checkNameEmpty(String name) {
        if(name.length() > 0 && name_error.getVisibility() == View.VISIBLE) {
            name_error.setVisibility(View.GONE);
        }
        else if(name.length() == 0){
            name_error.setVisibility(View.VISIBLE);
        }
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

    private void checkVerification(String password, String v_password) {
        if(password.equals(v_password) && (verify_error.getVisibility() == View.VISIBLE)) {
            verify_error.setVisibility(View.GONE);
        }
        else if(!(password.equals(v_password))){
            verify_error.setVisibility(View.VISIBLE);
        }
    }


    private void changeMonitor() {
        new_name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                checkNameEmpty(new_name.getText().toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        new_username.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                checkUsernameEmpty(new_username.getText().toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        new_password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                checkPasswordEmpty(new_password.getText().toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        verify_password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                checkVerification(new_password.getText().toString(), verify_password.getText().toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    public void open_user_home() {
        Intent intent  = new Intent(this, user_home.class);
        startActivity(intent);
    }
}