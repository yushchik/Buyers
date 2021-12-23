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
        if(savedInstanceState != null){
            string = savedInstanceState.getString("Email");
        }
        binding.btnBackEmail.setOnClickListener(view -> {
            Intent intentBackEmail = new Intent(this, LastName.class);
            startActivity(intentBackEmail);
        });

        binding.btnNextEmail.setOnClickListener(view -> {
            this.string = String.valueOf(binding.editTextEmail.getText());
            Intent intentNextEmail = new Intent(this, FinalData.class);
            intentNextEmail.putExtra("Email", string);
            Intent getIntentEmail = getIntent();
            intentNextEmail.putExtra("FirstName", getIntentEmail.getStringExtra("FirstName"));
            intentNextEmail.putExtra("LastName", getIntentEmail.getStringExtra("LastName"));
            startActivity(intentNextEmail);
        });
    }
    // сохранение состояния
    @Override
    protected void onSaveInstanceState(Bundle saveInstanceState) {
        super.onSaveInstanceState(saveInstanceState);
        saveInstanceState.putString("Email", string = String.valueOf(binding.editTextEmail.getText()));
    }
    // получение ранее сохраненного состояния
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        String name = savedInstanceState.getString("Email");
        binding.editTextEmail.setText(name);
    }
}
