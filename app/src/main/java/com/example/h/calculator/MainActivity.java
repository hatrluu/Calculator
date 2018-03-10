package com.example.h.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonHandler(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        switch(view.getId()){
            case R.id.num0:
                editText.setText("0");
                break;
            case R.id.num1:
                editText.setText("1");
                break;
        }
    }
}
