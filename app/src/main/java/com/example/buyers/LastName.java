package com.example.buyers;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.buyers.databinding.EmailPersonBinding;
import com.example.buyers.databinding.LastNameBinding;

public class LastName extends AppCompatActivity{

    LastNameBinding binding;
    public String string;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = LastNameBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        if(savedInstanceState != null){
            string = savedInstanceState.getString("LastName");
        }

        binding.btnBackLastName.setOnClickListener(view -> {
            Intent intentBackLastName = new Intent(this, FirstName.class);
            startActivity(intentBackLastName);
        });

        binding.btnNextLastName.setOnClickListener(view -> {
            string = String.valueOf(binding.editTextLastName.getText());
            Intent intentNextLastName = new Intent(this, EmailPerson.class);
            intentNextLastName.putExtra("LastName", string);
            Intent getFirstName = getIntent();
            intentNextLastName.putExtra("FirstName", getFirstName.getStringExtra("FirstName"));
            startActivity(intentNextLastName);
        });
    }

    // сохранение состояния
    @Override
    protected void onSaveInstanceState(Bundle saveInstanceState) {
        super.onSaveInstanceState(saveInstanceState);
        saveInstanceState.putString("LastName", string = String.valueOf(binding.editTextLastName.getText()));
    }
    // получение ранее сохраненного состояния
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        String name = savedInstanceState.getString("LastName");
        binding.editTextLastName.setText(name);
    }
}
