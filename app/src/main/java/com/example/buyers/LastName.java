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
            Intent intentBackLastName = new Intent(this, FirstName.class);

            startActivity(intentBackLastName);
        });

        binding.btnNextLastName.setOnClickListener(view -> {
            Intent intentNextLastName = new Intent(this, EmailPerson.class);
            intentNextLastName.putExtra("LastName", "Mirgorod");
            startActivity(intentNextLastName);
        });
    }
}
