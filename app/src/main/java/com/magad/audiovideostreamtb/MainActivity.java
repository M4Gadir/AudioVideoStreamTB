package com.magad.audiovideostreamtb;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    FragmentManager fm;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            fm = getSupportFragmentManager();
            switch (menuItem.getItemId()) {
                case R.id.audionv:
                    fm.beginTransaction().replace(R.id.lnfragment, new AudioFragment()).addToBackStack("")
                            .commit();
                    break;
                case R.id.videonv:
                    fm.beginTransaction().replace(R.id.lnfragment, new VideoFragment()).addToBackStack("")
                            .commit();
                    break;
            }

            return false;
        }
    };
//    private BottomNavigationView.OnNavigationItemSelectedListener

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fm = getSupportFragmentManager();
        fm.beginTransaction().add(R.id.lnfragment, new AudioFragment()).addToBackStack("").commit();
        BottomNavigationView navigation = findViewById(R.id.navigasi);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
}
