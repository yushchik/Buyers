package com.example.buyers;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.buyers.databinding.FinalDataBinding;

public class FinalData extends AppCompatActivity{

    FinalDataBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = FinalDataBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        binding.textViewFirstName.setText(intent.getStringExtra("FirstName"));
        binding.textViewLastName.setText(intent.getStringExtra("LastName"));
        binding.textViewEmail.setText(intent.getStringExtra("Email"));

        binding.btnBackFinal.setOnClickListener(view -> {
            Intent intentBackFinal = new Intent(this, EmailPerson.class);
            startActivity(intentBackFinal);
        });

        binding.btnConfirm.setOnClickListener(view -> {
            Intent intentConfirm = new Intent(this, MainActivity.class);
            startActivity(intentConfirm);
        });
    }
}
