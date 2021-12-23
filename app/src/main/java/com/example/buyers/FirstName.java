package com.example.buyers;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.buyers.databinding.FirstNameBinding;

public class FirstName extends AppCompatActivity{

    FirstNameBinding binding;
    public String string;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = FirstNameBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnNextFirstName.setOnClickListener(view -> {
            string = String.valueOf(binding.editTextFirstName.getText());
            Intent intentNextFirstName = new Intent(this, LastName.class);
            intentNextFirstName.putExtra("FirstName", string);
            startActivity(intentNextFirstName);
        });
    }
}
