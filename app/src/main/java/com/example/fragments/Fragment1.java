package com.example.fragments;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment1 extends Fragment {


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("frag","frag 1 is getting created");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("frag","frag 1 is being attached");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1,container,false);
        Log.i("frag","frag 1's view created");

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("frag","frag 1's host activity created");
    }

    @Override
    public void onStart() {
        super.onStart();

        Log.i("frag","frag 1 got started");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("frag","frag 1 is resumed");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("frag","frag 1 is paused");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("frag","frag 1 got stopped");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("frag","frag 1's view getting destroyed");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("frag","frag 1 destroyed");
    }
}
