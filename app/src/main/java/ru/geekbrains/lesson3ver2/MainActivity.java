package ru.geekbrains.lesson3ver2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    void initView() {
        Button btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        Button btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        Button btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        Button btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
        Button btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(this);
        Button btn6 = findViewById(R.id.btn6);
        btn6.setOnClickListener(this);
        Button btn7 = findViewById(R.id.btn7);
        btn7.setOnClickListener(this);
        Button btn8 = findViewById(R.id.btn8);
        btn8.setOnClickListener(this);
        Button btn9 = findViewById(R.id.btn9);
        btn9.setOnClickListener(this);
        Button btn0 = findViewById(R.id.btn0);
        btn0.setOnClickListener(this);
        Button btnPlus = findViewById(R.id.btnPlus);
        btnPlus.setOnClickListener(this);
        Button btnMinus = findViewById(R.id.btnMinus);
        btnMinus.setOnClickListener(this);
        Button btnMulti = findViewById(R.id.btnMulti);
        btnMulti.setOnClickListener(this);
        Button btnDiv = findViewById(R.id.btnDivision);
        btnDiv.setOnClickListener(this);
        Button btnEqual = findViewById(R.id.btnEqual);
        btnEqual.setOnClickListener(this);
        Button btnClear = findViewById(R.id.btnClear);
        btnClear.setOnClickListener(this);
        Button btnPoint = findViewById(R.id.btnPoint);
        btnPoint.setOnClickListener(this);

        TextView txtVwResult = findViewById(R.id.txtVwResult);
        txtVwResult.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                calculator.btnOnePressed();
                break;
        }


    }
}