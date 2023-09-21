package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.google.android.material.switchmaterial.SwitchMaterial;

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


        ConstraintLayout background = findViewById(R.id.background);

        ImageButton oneButton = findViewById(R.id.oneButton);
        ImageButton twoButton = findViewById(R.id.twoButton);
        ImageButton threeButton = findViewById(R.id.threeButton);
        ImageButton fourButton = findViewById(R.id.fourButton);
        ImageButton fiveButton = findViewById(R.id.fiveButton);
        ImageButton sixButton = findViewById(R.id.sixButton);
        ImageButton sevenButton = findViewById(R.id.sevenButton);
        ImageButton eightButton = findViewById(R.id.eightButton);
        ImageButton nineButton = findViewById(R.id.nineButton);
        ImageButton zeroButton = findViewById(R.id.zeroButton);
        ImageButton clearButton = findViewById(R.id.clearButton);
        ImageButton additionButton = findViewById(R.id.additionButton);
        ImageButton subtractButton = findViewById(R.id.subtractButton);
        ImageButton multiplyButton = findViewById(R.id.multiplyButton);
        ImageButton divisionButton = findViewById(R.id.divisionButton);
        ImageButton equalsButton = findViewById(R.id.equalsButton);
        ImageButton pointButton = findViewById(R.id.pointButton);
        TextView textSolution = findViewById(R.id.textSolution);

        @SuppressLint("UseSwitchCompatOrMaterialCode") Switch themeSwitch = findViewById(R.id.themeSwitch);
        Resources.Theme theme = this.getTheme();

        themeSwitch.setOnCheckedChangeListener(((buttonView, isChecked) -> {
            if (isChecked) {
                background.setBackgroundResource(R.color.dyingStar);
                textSolution.setTextColor(getResources().getColor(R.color.spaceGrey, theme));
            } else {
                background.setBackgroundResource(R.color.spaceGrey);
                textSolution.setTextColor(getResources().getColor(R.color.dyingStar, theme));
            }
        }));


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
                textSolution.setText(textSolution.getText() + "0");

            }
        });

        additionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = textSolution.getText().toString();
                if (!Objects.equals(num1, "") && !Objects.equals(num2, "")) {
                    textSolution.setText(String.valueOf(Double.parseDouble(num1) + Double.parseDouble(num2)));
                    if (textSolution.getText().toString().endsWith(".0")) {
                        textSolution.setText(textSolution.getText().toString().substring(0, textSolution.getText().length() - 2));
                    }
                    num1 = textSolution.getText().toString();
                    num2 = "";
                    textSolution.setText(textSolution.getText().toString() + "+");
                    plus = true;
                    minus = multiply = divide = false;
                } else if (text.endsWith("×") || text.endsWith("÷") || text.endsWith("-")) {
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
                    textSolution.setText(String.valueOf(Double.parseDouble(num1) - Double.parseDouble(num2)));
                    if (textSolution.getText().toString().endsWith(".0")) {
                        textSolution.setText(textSolution.getText().toString().substring(0, textSolution.getText().length() - 2));
                    }
                    num1 = textSolution.getText().toString();
                    num2 = "";
                    textSolution.setText(textSolution.getText().toString() + "-");
                    minus = true;
                    multiply = plus = divide = false;
                } else if (text.endsWith("+") || text.endsWith("÷") || text.endsWith("×")) {
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
                    textSolution.setText(String.valueOf(Double.parseDouble(num1) / Double.parseDouble(num2)));
                    if (textSolution.getText().toString().endsWith(".0")) {
                        textSolution.setText(textSolution.getText().toString().substring(0, textSolution.getText().length() - 2));
                    }
                    num1 = textSolution.getText().toString();
                    num2 = "";
                    textSolution.setText(textSolution.getText().toString() + "÷");
                    divide = true;
                    minus = plus = multiply = false;
                } else if (text.endsWith("+") || text.endsWith("×") || text.endsWith("-")) {
                    textSolution.setText(text.substring(0, text.length() - 1) + "÷");
                    divide = true;
                    minus = plus = multiply = false;
                } else if (!text.equals("") && !divide) {
                    textSolution.setText(text + "÷");
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
                    textSolution.setText(String.valueOf(Double.parseDouble(num1) * Double.parseDouble(num2)));
                    if (textSolution.getText().toString().endsWith(".0")) {
                        textSolution.setText(textSolution.getText().toString().substring(0, textSolution.getText().length() - 2));
                    }
                    num1 = textSolution.getText().toString();
                    num2 = "";
                    textSolution.setText(textSolution.getText().toString() + "×");
                    multiply = true;
                    minus = plus = divide = false;

                } else if (text.endsWith("+") || text.endsWith("÷") || text.endsWith("-")) {
                    textSolution.setText(text.substring(0, text.length() - 1) + "×");
                    multiply = true;
                    minus = plus = divide = false;
                } else if (!text.equals("") && !multiply) {
                    textSolution.setText(text + "×");
                    multiply = true;
                    minus = plus = divide = false;
                }
            }
        });

        pointButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = textSolution.getText().toString();
                if (!text.endsWith("+") && !text.endsWith("-") && !text.endsWith("×") && !text.endsWith("÷")) {
                    if ((text.contains("×") || text.contains("÷") || text.contains("+") || text.contains("-")) && (!text.endsWith(".") && !num2.contains("."))) {

                        num2 = num2 + ".";
                        textSolution.setText(textSolution.getText().toString() + ".");
                    } else if (!textSolution.getText().toString().endsWith(".") && !num1.contains(".") && num2.equals("")) {
                        num1 = num1 + ".";
                        textSolution.setText(textSolution.getText().toString() + ".");
                    }
                }
            }
        });

        equalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = textSolution.getText().toString();
                if (textSolution.getText() != "") {
                    if (multiply && !text.endsWith("×")) {
                        textSolution.setText(String.valueOf(Double.parseDouble(num1) * Double.parseDouble(num2)));
                        if (textSolution.getText().toString().endsWith(".0")) {
                            textSolution.setText(textSolution.getText().toString().substring(0, textSolution.getText().length() - 2));
                        }
                        num1 = textSolution.getText().toString();
                        num2 = "";
                        multiply = divide = minus = plus = false;
                    } else if (divide && !text.endsWith("÷")) {

                        textSolution.setText(String.valueOf(Double.parseDouble(num1) / Double.parseDouble(num2)));
                        if (textSolution.getText().toString().endsWith(".0")) {
                            textSolution.setText(textSolution.getText().toString().substring(0, textSolution.getText().length() - 2));
                        }
                        if (textSolution.getText().toString().equals("Infinity") || textSolution.getText().toString().equals("-Infinity")) {
                            textSolution.setText("");
                            multiply = divide = minus = plus = false;
                            num1 = num2 = "";
                            Toast.makeText(getApplication().getBaseContext(), "Math ERROR", Toast.LENGTH_LONG).show();
                        }
                        num1 = textSolution.getText().toString();
                        num2 = "";
                        multiply = divide = minus = plus = false;

                    } else if (minus && !text.endsWith("-")) {
                        textSolution.setText(String.valueOf(Double.parseDouble(num1) - Double.parseDouble(num2)));
                        if (textSolution.getText().toString().endsWith(".0")) {
                            textSolution.setText(textSolution.getText().toString().substring(0, textSolution.getText().length() - 2));
                        }
                        num1 = textSolution.getText().toString();
                        num2 = "";
                        multiply = divide = minus = plus = false;
                    } else if (plus && !text.endsWith("+")) {
                        textSolution.setText(String.valueOf(Double.parseDouble(num1) + Double.parseDouble(num2)));
                        if (textSolution.getText().toString().endsWith(".0")) {
                            textSolution.setText(textSolution.getText().toString().substring(0, textSolution.getText().length() - 2));
                        }
                        num1 = textSolution.getText().toString();
                        num2 = "";
                        multiply = divide = minus = plus = false;
                    }

                }
            }
        });

    }
}
