package com.example.bindingexample_01;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.bindingexample_01.databinding.ActivityBindingBinding;
import com.example.bindingexample_01.databinding.ActivityMainBinding;

import javax.xml.transform.Result;

public class BindingActivity extends AppCompatActivity {

    //La clase de la variable binding siempre sera igual al
    //nombre de la clase en la que esta más la palabra Binding
    // Ej: public class Example --> private ExampleBinding binding
    // Ej: public class ExampleActivity --> private ActivityExampleBinding binding
    private ActivityBindingBinding binding;

    Button red, blue;
    ImageView circle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Inflate es una funcionalidad de android que se usa
        //para inflar las vistas es decir llenar un contenedor con elementos
        binding= ActivityBindingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        red= binding.buttonRed;
        blue=binding.buttonBlue;
        circle=binding.imageViewCircle;

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circle.setBackgroundColor(Color.RED);
            }
        });

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circle.setBackgroundColor(Color.BLUE);
            }
        });

    }
}