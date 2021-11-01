package com.maulanaahmad.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("tes_halo_dunia", "onCreate: Activity dibuat");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("tes_halo_dunia", "onStart: Activity dimulai");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("tes_halo_dunia", "onPause: Activity dihentikan sementara");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i("tes_halo_dunia", "onPostResume: Activity dilanjutkan kembali");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("tes_halo_dunia", "onStop: Activity dihentikan");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("tes_halo_dunia", "onDestroy: Activity dihancurkan");
    }
}