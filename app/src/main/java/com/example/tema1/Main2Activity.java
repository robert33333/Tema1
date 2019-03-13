package com.example.tema1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Fragment nextFrag= new BlankFragment2_1();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame, nextFrag, "findThisFragment1")
                .addToBackStack(null)
                .commit();
    }
}
