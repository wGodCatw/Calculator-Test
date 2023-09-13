package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {


    String num1 = "";
    String num2 = "";
    boolean plus = false;
    boolean minus = false;
    boolean divide = false;
    boolean multiply = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button oneButton = findViewById(R.id.oneButton);
        Button twoButton = findViewById(R.id.twoButton);
        Button threeButton = findViewById(R.id.threeButton);
        Button fourButton = findViewById(R.id.fourButton);
        Button fiveButton = findViewById(R.id.fiveButton);
        Button sixButton = findViewById(R.id.sixButton);
        Button sevenButton = findViewById(R.id.sevenButton);
        Button eightButton = findViewById(R.id.eightButton);
        Button nineButton = findViewById(R.id.nineButton);
        Button zeroButton = findViewById(R.id.zeroButton);
        Button clearButton = findViewById(R.id.clearButton);
        Button additionButton = findViewById(R.id.additionButton);
        Button subtractButton = findViewById(R.id.subtractButton);
        Button multiplyButton = findViewById(R.id.multiplyButton);
        Button divisionButton = findViewById(R.id.divisionButton);
        Button equalsButton = findViewById(R.id.equalsButton);
        TextView textSolution = findViewById(R.id.textSolution);


        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (plus || minus || divide || multiply) {
                    num2 = num2 + "1";
                } else {
                    num1 = num1 + "1";
                }
                if (textSolution.getText() == "") {
                    textSolution.setText("1");
                } else {
                    textSolution.setText(textSolution.getText() + "1");
                }
            }
        });

        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (plus || minus || divide || multiply) {
                    num2 = num2 + "2";
                } else {
                    num1 = num1 + "2";
                }
                if (textSolution.getText() == "") {
                    textSolution.setText("2");
                } else {
                    textSolution.setText(textSolution.getText() + "2");
                }
            }
        });

        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (plus || minus || divide || multiply) {
                    num2 = num2 + "3";
                } else {
                    num1 = num1 + "3";
                }
                if (textSolution.getText() == "") {
                    textSolution.setText("3");
                } else {
                    textSolution.setText(textSolution.getText() + "3");
                }
            }
        });

        fourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (plus || minus || divide || multiply) {
                    num2 = num2 + "4";
                } else {
                    num1 = num1 + "4";
                }
                if (textSolution.getText() == "") {
                    textSolution.setText("4");
                } else {
                    textSolution.setText(textSolution.getText() + "4");
                }
            }
        });

        fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (plus || minus || divide || multiply) {
                    num2 = num2 + "5";
                } else {
                    num1 = num1 + "5";
                }
                if (textSolution.getText() == "") {
                    textSolution.setText("5");
                } else {
                    textSolution.setText(textSolution.getText() + "5");
                }
            }
        });

        sixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (plus || minus || divide || multiply) {
                    num2 = num2 + "6";
                } else {
                    num1 = num1 + "6";
                }
                if (textSolution.getText() == "") {
                    textSolution.setText("6");
                } else {
                    textSolution.setText(textSolution.getText() + "6");
                }
            }
        });

        sevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (plus || minus || divide || multiply) {
                    num2 = num2 + "7";
                } else {
                    num1 = num1 + "7";
                }
                if (textSolution.getText() == "") {
                    textSolution.setText("7");
                } else {
                    textSolution.setText(textSolution.getText() + "7");
                }
            }
        });

        eightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (plus || minus || divide || multiply) {
                    num2 = num2 + "8";
                } else {
                    num1 = num1 + "8";
                }
                if (textSolution.getText() == "") {
                    textSolution.setText("8");
                } else {
                    textSolution.setText(textSolution.getText() + "8");
                }
            }
        });

        nineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (plus || minus || divide || multiply) {
                    num2 = num2 + "9";
                } else {
                    num1 = num1 + "9";
                }
                if (textSolution.getText() == "") {
                    textSolution.setText("9");
                } else {
                    textSolution.setText(textSolution.getText() + "9");
                }

            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = "";
                num2 = "";
                minus = multiply = divide = plus = false;
                textSolution.setText("");
            }
        });

        zeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (plus || minus || divide || multiply) {
                    num2 = num2 + "0";
                } else {
                    num1 = num1 + "0";
                }
                if (textSolution.getText() != "") {
                    textSolution.setText(textSolution.getText() + "0");
                }
            }
        });

        additionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = textSolution.getText().toString();
                if (!Objects.equals(num1, "") && !Objects.equals(num2, "")) {
                    textSolution.setText(String.valueOf(Integer.parseInt(num1) + Integer.parseInt(num2)));
                    num1 = textSolution.getText().toString();
                    num2 = "";
                    textSolution.setText(textSolution.getText().toString() + "+");
                    plus = true;
                    minus = multiply = divide = false;
                } else if (text.endsWith("*") || text.endsWith("/") || text.endsWith("-")) {
                    textSolution.setText(text.substring(0, text.length() - 1) + "+");
                    plus = true;
                    minus = multiply = divide = false;
                } else if (!text.equals("") && !plus) {
                    textSolution.setText(text + "+");
                    plus = true;
                    minus = multiply = divide = false;
                }
            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = textSolution.getText().toString();
                if (!Objects.equals(num1, "") && !Objects.equals(num2, "")) {
                    textSolution.setText(String.valueOf(Integer.parseInt(num1) - Integer.parseInt(num2)));
                    num1 = textSolution.getText().toString();
                    num2 = "";
                    textSolution.setText(textSolution.getText().toString() + "-");
                    minus = true;
                    multiply = plus = divide = false;
                } else if (text.endsWith("+") || text.endsWith("/") || text.endsWith("*")) {
                    textSolution.setText(text.substring(0, text.length() - 1) + "-");
                    minus = true;
                    multiply = plus = divide = false;
                } else if (!text.equals("") && !minus) {
                    textSolution.setText(text + "-");
                    minus = true;
                    multiply = plus = divide = false;
                }
            }
        });

        divisionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = textSolution.getText().toString();
                if (!Objects.equals(num1, "") && !Objects.equals(num2, "")) {
                    textSolution.setText(String.valueOf(Integer.parseInt(num1) / Integer.parseInt(num2)));
                    num1 = textSolution.getText().toString();
                    num2 = "";
                    textSolution.setText(textSolution.getText().toString() + "/");
                    divide = true;
                    minus = plus = multiply = false;
                } else if (text.endsWith("+") || text.endsWith("*") || text.endsWith("-")) {
                    textSolution.setText(text.substring(0, text.length() - 1) + "/");
                    divide = true;
                    minus = plus = multiply = false;
                } else if (!text.equals("") && !divide) {
                    textSolution.setText(text + "/");
                    divide = true;
                    minus = plus = multiply = false;
                }
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = textSolution.getText().toString();
                if (!Objects.equals(num1, "") && !Objects.equals(num2, "")) {
                    textSolution.setText(String.valueOf(Integer.parseInt(num1) * Integer.parseInt(num2)));
                    num1 = textSolution.getText().toString();
                    num2 = "";
                    textSolution.setText(textSolution.getText().toString() + "*");
                    multiply = true;
                    minus = plus = divide = false;

                } else if (text.endsWith("+") || text.endsWith("/") || text.endsWith("-")) {
                    textSolution.setText(text.substring(0, text.length() - 1) + "*");
                    multiply = true;
                    minus = plus = divide = false;
                } else if (!text.equals("") && !multiply) {
                    textSolution.setText(text + "*");
                    multiply = true;
                    minus = plus = divide = false;
                }
            }
        });

        equalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = textSolution.getText().toString();
                if (textSolution.getText() != "") {
                    if (multiply && !text.endsWith("*")) {
                        textSolution.setText(String.valueOf(Integer.parseInt(num1) * Integer.parseInt(num2)));
                        num1 = textSolution.getText().toString();
                        num2 = "";
                        multiply = divide = minus = plus = false;
                    } else if (divide && !text.endsWith("/")) {
                        textSolution.setText(String.valueOf(Integer.parseInt(num1) / Integer.parseInt(num2)));
                        num1 = textSolution.getText().toString();
                        num2 = "";
                        multiply = divide = minus = plus = false;
                    } else if (minus && !text.endsWith("-")) {
                        textSolution.setText(String.valueOf(Integer.parseInt(num1) - Integer.parseInt(num2)));
                        num1 = textSolution.getText().toString();
                        num2 = "";
                        multiply = divide = minus = plus = false;
                    } else if (plus && !text.endsWith("+")) {
                        textSolution.setText(String.valueOf(Integer.parseInt(num1) + Integer.parseInt(num2)));
                        num1 = textSolution.getText().toString();
                        num2 = "";
                        multiply = divide = minus = plus = false;
                    }

                }
            }
        });

    }
}
