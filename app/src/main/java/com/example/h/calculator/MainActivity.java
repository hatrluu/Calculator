package com.example.h.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button num1, num2, num3, num4, num5, num6, num7, num8, num9, num0, period, equal, addition, subtraction, multiplication, division, clear, memadd,
            memsub, memrecall, memclear;
    EditText editText;
    float val1 = 0;
    float val2 = 0;

    float memory, result;
    String optr = "+";
    boolean isVal1Empty = true;
    boolean newCalc = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Binding buttons
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);
        num6 = findViewById(R.id.num6);
        num7 = findViewById(R.id.num7);
        num8 = findViewById(R.id.num8);
        num9 = findViewById(R.id.num9);
        num0 = findViewById(R.id.num0);
        period = findViewById(R.id.period);
        equal = findViewById(R.id.equal);
        addition = findViewById(R.id.addition);
        subtraction = findViewById(R.id.subtraction);
        multiplication = findViewById(R.id.multiplication);
        division = findViewById(R.id.division);
        clear = findViewById(R.id.clear);
        memadd = findViewById(R.id.memadd);
        memsub = findViewById(R.id.memsub);
        memrecall = findViewById(R.id.memrecall);
        memclear = findViewById(R.id.memclear);
        editText = findViewById(R.id.editText);

        //Set up numpads
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().equals("0") || newCalc == true) {
                    newCalc = false;
                    editText.setText("1");
                } else {
                    editText.setText(editText.getText() + "1");
                }

            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().equals("0") || newCalc == true) {
                    newCalc = false;
                    editText.setText("2");
                } else {
                    editText.setText(editText.getText() + "2");
                }
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().equals("0") || newCalc == true) {
                    newCalc = false;
                    editText.setText("3");
                } else {
                    editText.setText(editText.getText() + "3");
                }
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().equals("0") || newCalc == true) {
                    newCalc = false;
                    editText.setText("4");
                } else {
                    editText.setText(editText.getText() + "4");
                }
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().equals("0") || newCalc == true) {
                    newCalc = false;
                    editText.setText("5");
                } else {
                    editText.setText(editText.getText() + "5");
                }
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().equals("0") || newCalc == true) {
                    newCalc = false;
                    editText.setText("6");
                } else {
                    editText.setText(editText.getText() + "6");
                }
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().equals("0") || newCalc == true) {
                    newCalc = false;
                    editText.setText("7");
                } else {
                    editText.setText(editText.getText() + "7");
                }
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().equals("0") || newCalc == true) {
                    newCalc = false;
                    editText.setText("9");
                } else {
                    editText.setText(editText.getText() + "8");
                }
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().equals("0") || newCalc == true) {
                    newCalc = false;
                    editText.setText("9");
                } else {
                    editText.setText(editText.getText() + "9");
                }
            }
        });
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Adding 0s
                //When editText is not 0, e.g: 30, 40, etc.
                //When there is a decimal point, e.g: 2.04, 0.005, etc.

                //Set editText to 0
                //When editText is 0
                //After a calculation is made (new calculation)

                if (!editText.getText().toString().equals("0") && newCalc == false) {
                    editText.setText(editText.getText() + "0");
                } else if (editText.getText().toString().contains(".") && newCalc == false) {
                    editText.setText(editText.getText() + "0");

                } else if (newCalc == true) {
                    newCalc = false;
                    if(editText.getText().toString().contains(".")){
                        editText.setText(editText.getText() + "0");
                    }
                    else{
                        editText.setText("0");
                    }

                }

            }
        });
        period.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!editText.getText().toString().contains(".")) {
                    editText.setText(editText.getText() + ".");
                }
            }
        });

        //Set up operators
        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                optr = "+";
                if (isVal1Empty == true) {
                    val1 = Float.parseFloat(editText.getText() + "");
                    editText.setText("");
                    isVal1Empty = false;
                } else if (val2 != 0) {
                    val2 = 0;
                    editText.setText("");
                } else {
                    editText.setText("");
                }
            }
        });
        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                optr = "-";
                if (isVal1Empty == true) {
                    val1 = Float.parseFloat(editText.getText() + "");
                    editText.setText("");
                    isVal1Empty = false;
                } else if (val2 != 0) {
                    val2 = 0;
                    editText.setText("");
                } else {
                    editText.setText("");
                }
            }
        });
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                optr = "*";
                if (isVal1Empty == true) {
                    val1 = Float.parseFloat(editText.getText() + "");
                    editText.setText("");
                    isVal1Empty = false;
                } else if (val2 != 0) {
                    val2 = 0;
                    editText.setText("");
                } else {
                    editText.setText("");
                }
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                optr = "/";
                if (isVal1Empty == true) {
                    val1 = Float.parseFloat(editText.getText() + "");
                    editText.setText("");
                    isVal1Empty = false;
                } else if (val2 != 0) {
                    val2 = 0;
                    editText.setText("");
                } else {
                    editText.setText("");
                }
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!editText.getText().toString().equals("")) {
                    val2 = Float.parseFloat(editText.getText() + "");
                    if (optr.equals("+")) {
                        result = val1 + val2;
                        editText.setText(result + "");
                        val1 = 0;
                        isVal1Empty = newCalc = true;
                    }
                    if (optr.equals("-")) {
                        result = val1 - val2;
                        editText.setText(result + "");
                        val1 = 0;
                        isVal1Empty = newCalc = true;
                    }
                    if (optr.equals("*")) {
                        result = val1 * val2;
                        editText.setText(result + "");
                        val1 = 0;
                        isVal1Empty = newCalc = true;
                    }
                    if (optr.equals("/")) {
                        result = val1 / val2;
                        editText.setText(result + "");
                        val1 = 0;
                        isVal1Empty = newCalc = true;
                    }
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("0");
            }
        });

        //Memory calculations
        memadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                memory += result;
            }
        });
        memsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                memory -= result;
            }
        });
        memrecall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(memory + "");
            }
        });
        memclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                memory = 0;
            }
        });


    }

}
