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
    boolean mAddition = true;
    boolean mSubtraction, mMultiplication, mDivision;

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

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (val1 == 0) {
                    val1 = 1;
                    editText.setText("1");
                } else {
                    editText.setText(editText.getText() + "1");
                }

            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (val1 == 0) {
                    val1 = 1;
                    editText.setText("2");
                } else {editText.setText(editText.getText() + "2");}
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (val1 == 0) {
                    val1 = 1;
                    editText.setText("3");
                } else {editText.setText(editText.getText() + "3");}
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (val1 == 0) {
                    val1 = 1;
                    editText.setText("4");
                } else {editText.setText(editText.getText() + "4");}
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (val1 == 0) {
                    val1 = 1;
                    editText.setText("5");
                } else {editText.setText(editText.getText() + "5");}
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (val1 == 0) {
                    val1 = 1;
                    editText.setText("6");
                } else {editText.setText(editText.getText() + "6");}
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (val1 == 0) {
                    val1 = 1;
                    editText.setText("7");
                } else {editText.setText(editText.getText() + "7");}
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (val1 == 0) {
                    val1 = 1;
                    editText.setText("9");
                } else {editText.setText(editText.getText() + "8");}
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (val1 == 0) {
                    val1 = 1;
                    editText.setText("9");
                } else {editText.setText(editText.getText() + "9");}
            }
        });
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!editText.getText().toString().equals("0")){
                    editText.setText(editText.getText() + "0");
                }
                else{
                    editText.setText("0");
                }
            }
        });

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAddition = true;
                if (val1 == 0) {
                    val1 = Float.parseFloat(editText.getText() + "");
                    mSubtraction = mMultiplication = mDivision = false;
                    editText.setText("");
                }
                else if (val2 != 0){
                    val2 = 0;
                    editText.setText("");
                }
                else{
                    val2 = Float.parseFloat(editText.getText()+"");
                    editText.setText("");
                    val1 += val2;
                    editText.setText(Float.toString(val1));

                }
            }
        });
        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(editText.getText() + "");
                mSubtraction = true;
                mAddition = mMultiplication = mDivision = false;
                editText.setText("");
            }
        });
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(editText.getText() + "");
                mMultiplication = true;
                mSubtraction = mAddition = mDivision = false;
                editText.setText("");
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(editText.getText() + "");
                mDivision = true;
                mSubtraction = mMultiplication = mAddition = false;
                editText.setText("");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val2 = Float.parseFloat(editText.getText() + "");
                if (mAddition == true) {
                    result = val1 + val2;
                    editText.setText(result + "");
                    mAddition = false;
                    val1 = val2 = 0;
                }
                if (mSubtraction == true) {
                    result = val1 - val2;
                    editText.setText(result + "");
                    mSubtraction = false;
                    val1 = val2 = 0;
                }

                if (mMultiplication == true) {
                    result = val1 * val2;
                    editText.setText(result + "");
                    mMultiplication = false;
                    val1 = val2 = 0;
                }

                if (mDivision == true) {
                    result = val1 / val2;
                    editText.setText(result + "");
                    mDivision = false;
                    val1 = val2 = 0;
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("0");
            }
        });
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
