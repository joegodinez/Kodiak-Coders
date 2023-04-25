package com.example.tg1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.tg1.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class user_home extends AppCompatActivity {

    BottomNavigationView bnv;

    user_logs user_logs = new user_logs();
    search search = new search();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home);

        bnv = findViewById(R.id.bottom_nav);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, user_logs).commit();

        bnv.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {

                switch(item.getItemId()) {
                    case(R.id.user_logs):
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, user_logs).commit();
                        return true;
                    case(R.id.search):
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, search).commit();
                        return true;
                }

                return false;
            }
        });
    }
}