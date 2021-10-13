package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Path;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private enum Operator {none, add, minus, multiply, divide}
    private double data1 =0, data2 =0;
    private Operator optr = Operator.none;
    TextView results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intiTextView();
    }

    private void intiTextView() {
        results = (TextView)findViewById(R.id.ResultEdits);
    }

    public void sevenOnClick(View view) {

        results.setText(results.getText()+ "7");

    }

    public void eightOnClick(View view) {
        results.setText(results.getText()+ "8");
    }

    public void nineOnClick(View view) {
        results.setText(results.getText()+ "9");
    }


    public void fourOnClick(View view) {
        results.setText(results.getText()+ "4");
    }

    public void fiveOnClick(View view) {
        results.setText(results.getText()+ "5");
    }

    public void sixOnClick(View view) {
        results.setText(results.getText()+ "6");
    }


    public void oneOnClick(View view) {
        results.setText(results.getText()+ "1");
    }

    public void twoOnClick(View view) {
        results.setText(results.getText()+ "2");
    }

    public void threeOnClick(View view) {
        results.setText(results.getText()+ "3");
    }


    public void zeroOnClick(View view) {
        results.setText(results.getText()+ "0");
    }

    public void addOnClick(View view) {
        optr = Operator.add;
        data1 = Double.parseDouble(results.getText().toString());
        results.setText("");
    }

    public void subtractOnClick(View view) {
        optr = Operator.minus;
        data1 = Double.parseDouble(results.getText().toString());
        results.setText("");

    }


    public void divideOnClick(View view) {

        optr = Operator.divide;
        data1 = Double.parseDouble(results.getText().toString());
        results.setText("");

    }

    public void clearOnClick(View view) {
        results.setText("");
    }

    public void dotOnClick(View view) {

        results.setText(results.getText()+ ".");
    }

    public void multiplyOnClick(View view) {
        optr = Operator.multiply;
        data1 = Double.parseDouble(results.getText().toString());
        results.setText("");
    }

    public void equalOnClick(View view) {
        if (optr!= Operator.none) {
            data2 = Double.parseDouble(results.getText().toString());
            double endresult = 0;
            if (optr == Operator.add) {
                endresult = data1 +data2;
            } else if (optr == Operator.minus) {
                endresult = data1 - data2;
            } else if (optr == Operator.multiply){
                endresult = data1*data2;
            } else if (optr == Operator.divide){
                endresult = data1/data2;
            }
            optr = Operator.none;
            data1 = endresult;
            if ((endresult-(int)endresult)!=0)
            results.setText(String.valueOf(endresult));
            else
                results.setText(String.valueOf((int)endresult));
        }
    }
}