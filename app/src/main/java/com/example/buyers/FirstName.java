package com.example.buyers;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.buyers.databinding.FirstNameBinding;

public class FirstName extends AppCompatActivity{

    FirstNameBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = FirstNameBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnBackFirstName.setOnClickListener(view -> {
            Intent intentBack = new Intent(this, MainActivity.class);
            startActivity(intentBack);
        });

        binding.btnNextFirstName.setOnClickListener(view -> {
            Intent intentNext = new Intent(this, LastName.class);
            startActivity(intentNext);
        });
    }
}
