package com.example.demo;

import static com.example.demo.R.id.multiply;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1, button2 , multi ,div , sub, add, refresh;
    EditText operand, ans , firstNumber , secondNumber;
    Integer num1 , num2 ;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        multi = findViewById(R.id.multiply);
        div = findViewById(R.id.divide);
        sub = findViewById(R.id.subtract);
        add = findViewById(R.id.add);
        refresh = findViewById(R.id.refresh);
        textView = findViewById(R.id.r);

        operand = findViewById(R.id.typeOfoPERAND);
        ans = findViewById(R.id.answer);
        firstNumber = findViewById(R.id.firstResult);
        secondNumber = findViewById(R.id.secondResult);


        button1.setOnClickListener(this::onClick2);
        button2.setOnClickListener(this::onClick2);


        multi.setOnClickListener(this);
        div.setOnClickListener(this);
        sub.setOnClickListener(this);
        add.setOnClickListener(this);
        refresh.setOnClickListener(this);

    }

    public int getIntFromEditText (EditText editText){
        if (editText.getText().toString().equals("")){
            Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
            return 0;
        }else{
            return Integer.parseInt(editText.getText().toString());
        }
    }

    @Override
    public void onClick(View view) {
        num1 = getIntFromEditText(firstNumber);
        num2 = getIntFromEditText(secondNumber);
        if (view.getId() == R.id.multiply) {
            operand.setText("multiply");
            ans.setText(String.valueOf(num1 * num2));
        } else if (view.getId() == R.id.divide){
            operand.setText("divide");
            ans.setText(String.valueOf(num1 / num2));
        } else if (view.getId() == R.id.subtract){
            operand.setText("subtract");
            ans.setText(String.valueOf(num1 - num2));
        } else if (view.getId() == R.id.add){
            operand.setText("add");
            ans.setText(String.valueOf(num1 + num2));
        } else{
            operand.setText("");
            ans.setText("");
            firstNumber.setText("");
            secondNumber.setText("");
        }
    }


    public void onClick2(View view){

    }


}