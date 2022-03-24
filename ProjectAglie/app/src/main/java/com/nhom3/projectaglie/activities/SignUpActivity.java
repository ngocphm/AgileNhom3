package com.nhom3.projectaglie.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.nhom3.projectaglie.R;
import com.nhom3.projectaglie.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {
    private ActivitySignUpBinding binding ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }
    private void setListeners(){
        binding.textSignIn.setOnClickListener(v -> onBackPressed());
    }
}