package com.example.viikko10;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView resultView;
    EditText operandView1;
    EditText operandView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultView = findViewById(R.id.textSeeResult);
        operandView1 = findViewById(R.id.editFirstNumber);
        operandView2 = findViewById(R.id.editSecondNumber);
    }
    private float getNumber(EditText operandView) {
        if (operandView.getText().toString().isEmpty()) {
            return 0;
        } else {
            return Float.parseFloat(operandView.getText().toString());
        }
    }
    private void setResultView(float result) {
        resultView.setText(Float.toString(result));
    }
    public void add(View view) {
        float result = Float.NaN;
        result = getNumber(operandView1) + getNumber(operandView2);
        setResultView(result);
    }
    public void substract(View view) {
        float result = Float.NaN;
        result = getNumber(operandView1) - getNumber(operandView2);
        setResultView(result);
    }
    public void multiply(View view) {
        float result = Float.NaN;
        result = getNumber(operandView1) * getNumber(operandView2);
        setResultView(result);
    }
    public void divide(View view) {
        float result = Float.NaN;
        result = getNumber(operandView1) / getNumber(operandView2);
        setResultView(result);
    }
}