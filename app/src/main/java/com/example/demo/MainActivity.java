package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button multi = findViewById(R.id.multiply);

        EditText operand = findViewById(R.id.typeOfoPERAND);
        EditText ans = findViewById(R.id.answer);
        EditText firstNumber = findViewById(R.id.firstResult);
        EditText secondNumber = findViewById(R.id.secondResult);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumber.setText("1");
                secondNumber.setText("1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumber.setText("2");
                secondNumber.setText("2");
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Convert the text from editResult and edit2Result EditText to integers
                int value1 = Integer.parseInt(firstNumber.getText().toString());
                int value2 = Integer.parseInt(secondNumber.getText().toString());

                // Display the operand
                operand.setText("MULTIPLY");

                // Perform the addition and get the result
                int sum = value1 + value2;

                // Display the result in ans EditText
                ans.setText(String.valueOf(sum));

            }
        });
    }
}