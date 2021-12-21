package com.example.buyers;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.buyers.databinding.EmailPersonBinding;

public class EmailPerson extends AppCompatActivity {

    EmailPersonBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = EmailPersonBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnBackEmail.setOnClickListener(view -> {
            Intent intentBack = new Intent(this, LastName.class);
            startActivity(intentBack);
        });

        binding.btnNextEmail.setOnClickListener(view -> {
            Intent intentNext = new Intent(this, FinalData.class);
            startActivity(intentNext);
        });
    }
}
