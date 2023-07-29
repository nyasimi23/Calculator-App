package com.example.demo;



import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1, button2 ,button3, button4, button5 , button6 ,button7 ,button8 ,button9 , multi ,div , sub, add, refresh;
    EditText operand, ans , firstNumber , secondNumber;
    Integer num1 , num2 ;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);


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

        firstNumber.setShowSoftInputOnFocus(false);
        secondNumber.setShowSoftInputOnFocus(false);



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
            operand.setText(R.string.multi);
            ans.setText(String.valueOf(num1 * num2));
        } else if (view.getId() == R.id.divide){
            operand.setText(R.string.div);
            if (num2 != 0) {
                ans.setText(String.valueOf(num1 / num2));
            } else {
                ans.setText(R.string.err);
            }

        } else if (view.getId() == R.id.subtract){
            operand.setText(R.string.sub);
            ans.setText(String.valueOf(num1 - num2));
        } else if (view.getId() == R.id.add){
            operand.setText(R.string.add);
            ans.setText(String.valueOf(num1 + num2));
        } else{
            operand.setText("");
            ans.setText("");
            firstNumber.setText("");
            secondNumber.setText("");
        }
    }

    @SuppressLint("SetTextI18n")
    private void updateNum1(String strToAdd) {
        String inp = firstNumber.getText().toString();
        firstNumber.setText(inp + strToAdd);
    }
    @SuppressLint("SetTextI18n")
    private void updateNum2(String strToAdd) {
        String inp2 = secondNumber.getText().toString();
        secondNumber.setText(inp2 + strToAdd);
    }

    public void button1(View view) {
        if (firstNumber.hasFocus()) {
            updateNum1("1");
        } else if (secondNumber.hasFocus()) {
            updateNum2("1");
        }
    }

    public void button2(View view) {
        if (firstNumber.hasFocus()) {
            updateNum1("2");
        } else if (secondNumber.hasFocus()) {
            updateNum2("2");
        }
    }

    public void button3(View view) {
        if (firstNumber.hasFocus()) {
            updateNum1("3");
        } else if (secondNumber.hasFocus()) {
            updateNum2("3");
        }
    }

    public void button4(View view) {
        if (firstNumber.hasFocus()) {
            updateNum1("4");
        } else if (secondNumber.hasFocus()) {
            updateNum2("4");
        }
    }

    public void button5(View view) {
        if (firstNumber.hasFocus()) {
            updateNum1("5");
        } else if (secondNumber.hasFocus()) {
            updateNum2("5");
        }
    }

    public void button6(View view) {
        if (firstNumber.hasFocus()) {
            updateNum1("6");
        } else if (secondNumber.hasFocus()) {
            updateNum2("6");
        }
    }

    public void button7(View view) {
        if (firstNumber.hasFocus()) {
            updateNum1("7");
        } else if (secondNumber.hasFocus()) {
            updateNum2("7");
        }
    }

    public void button8(View view) {
        if (firstNumber.hasFocus()) {
            updateNum1("8");
        } else if (secondNumber.hasFocus()) {
            updateNum2("8");
        }
    }

    public void button9(View view) {
        if (firstNumber.hasFocus()) {
            updateNum1("9");
        } else if (secondNumber.hasFocus()) {
            updateNum2("9");
        }
    }





}