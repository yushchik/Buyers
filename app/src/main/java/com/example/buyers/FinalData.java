package com.example.buyers;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.buyers.databinding.EmailPersonBinding;
import com.example.buyers.databinding.FinalDataBinding;

public class FinalData extends AppCompatActivity{

    FinalDataBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = FinalDataBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
