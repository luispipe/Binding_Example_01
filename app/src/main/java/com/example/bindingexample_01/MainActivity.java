package com.example.bindingexample_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bindingexample_01.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    Button normal, toBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        View view= binding.getRoot();
        setContentView(view);
        normal=binding.buttonNormal;
        toBinding= binding.buttonBinding;

        Intent viewNormal= new Intent(getApplicationContext(),
                NormalActivity.class);
        Intent viewBinding= new Intent(getApplicationContext(),
                BindingActivity.class);

        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(viewNormal);
            }
        });

        toBinding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(viewBinding);
            }
        });
    }
}