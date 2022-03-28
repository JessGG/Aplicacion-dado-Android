package com.example.aplicacionlanzardado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
    Button buttonLanzar;
    ImageView imageView;
    TextView numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLanzar = findViewById(R.id.buttonLanzar);
        imageView = findViewById(R.id.imageView);
        numero = findViewById(R.id.numero);

        buttonLanzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int random = (int) (Math.random()*7+1);
                switch (random){
                    case 1:
                        imageView.setImageResource(R.drawable.dice_1);
                        numero.setText("1");
                        break;
                    case 2 :
                        imageView.setImageResource(R.drawable.dice_2);
                        numero.setText("2");
                        break;
                    case 3 :
                        imageView.setImageResource(R.drawable.dice_3);
                        numero.setText("3");
                        break;
                    case 4:
                        imageView.setImageResource(R.drawable.dice_4);
                        numero.setText("4");
                        break;
                    case 5: imageView.setImageResource(R.drawable.dice_5);
                        numero.setText("5");
                        break;
                    case 6: imageView.setImageResource(R.drawable.dice_6);
                        numero.setText("6");
                        break;
                }
            }
        });

    }

}