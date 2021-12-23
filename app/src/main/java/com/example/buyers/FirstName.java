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

        if(savedInstanceState != null){
            string = savedInstanceState.getString("FirstName");
        }

        binding.btnNextFirstName.setOnClickListener(view -> {
            string = String.valueOf(binding.editTextFirstName.getText());
            Intent intentNextFirstName = new Intent(this, LastName.class);
            intentNextFirstName.putExtra("FirstName", string);
            startActivity(intentNextFirstName);
        });
    }

    // сохранение состояния
    @Override
    protected void onSaveInstanceState(Bundle saveInstanceState) {
        super.onSaveInstanceState(saveInstanceState);
        saveInstanceState.putString("FirstName", string = String.valueOf(binding.editTextFirstName.getText()));
    }
    // получение ранее сохраненного состояния
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        String name = savedInstanceState.getString("FirstName");
        binding.editTextFirstName.setText(name);
    }
}
