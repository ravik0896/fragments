package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mButton1,mButton2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        mButton1 = (Button)findViewById(R.id.fargment1);
        mButton2 = (Button)findViewById(R.id.fargment2);

mButton1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.containerfrag1,new Fragment1());
fragmentTransaction.addToBackStack(null);
fragmentTransaction.commit();
    }
});

mButton2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {


        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.containerfrag2,new Fragment2());
 fragmentTransaction.addToBackStack(null);
 fragmentTransaction.commit();

    }
});







    }
}
