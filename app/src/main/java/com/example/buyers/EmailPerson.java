package com.example.buyers;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.buyers.databinding.EmailPersonBinding;

public class EmailPerson extends AppCompatActivity {

    EmailPersonBinding binding;
    public String string;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = EmailPersonBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnBackEmail.setOnClickListener(view -> {
            Intent intentBackEmail = new Intent(this, LastName.class);
            startActivity(intentBackEmail);
        });

        binding.btnNextEmail.setOnClickListener(view -> {
            string = String.valueOf(binding.editTextEmail.getText());
            Intent intentNextEmail = new Intent(this, FinalData.class);
            intentNextEmail.putExtra("Email", string);
            Intent getIntentEmail = getIntent();
            intentNextEmail.putExtra("FirstName", getIntentEmail.getStringExtra("FirstName"));
            intentNextEmail.putExtra("LastName", getIntentEmail.getStringExtra("LastName"));
            startActivity(intentNextEmail);
        });
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("key_email", "string");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }
}
