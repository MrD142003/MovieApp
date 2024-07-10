package com.movie_app.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.movie_app.R;
import com.movie_app.databinding.ActivityLoginBinding;
import com.movie_app.databinding.ActivityMainBinding;

public class LoginActivity extends AppCompatActivity {
    private ActivityLoginBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        InitWidget();
    }

    private void InitWidget() {
        binding.loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(binding.userEdt.getText().toString().isEmpty() || binding.passEdt.getText().toString().isEmpty()){
                    Toast.makeText(LoginActivity.this, "Please fill your username and password", Toast.LENGTH_SHORT).show();
                } else if (binding.userEdt.getText().toString().equals("dung") || binding.passEdt.getText().toString().equals("dung")) {
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                }else {
                    Toast.makeText(LoginActivity.this, "Your username or password is not correct", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}