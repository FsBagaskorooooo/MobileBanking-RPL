package com.example.mbankingrpl;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class menuUtama extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);


        // Set onClickListeners for menu buttons
        findViewById(R.id.buttonCekSaldo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Checking balance...");
            }
        });

        findViewById(R.id.buttonTransfer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Initiating transfer...");
            }
        });

        findViewById(R.id.buttonPembayaran).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Processing payment...");
            }
        });

        findViewById(R.id.buttonBayarTagihan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Paying bill...");
            }
        });
    }

    private void showToast(String message) {
        // Example method for showing toast messages
        // Implement your own way of displaying messages to the user
        // (e.g)

    }
}
