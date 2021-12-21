package com.example.buyers;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.buyers.databinding.EmailPersonBinding;
import com.example.buyers.databinding.LastNameBinding;

public class LastName extends AppCompatActivity{

    LastNameBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = LastNameBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnBackLastName.setOnClickListener(view -> {
            Intent intentBack = new Intent(this, FirstName.class);
            startActivity(intentBack);
        });

        binding.btnNextLastName.setOnClickListener(view -> {
            Intent intentNext = new Intent(this, EmailPerson.class);
            startActivity(intentNext);
        });
    }
}
