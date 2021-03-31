package com.androidapp.buttonwinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    public BreakIterator mTextView1;
    Button mButton1, mButton2;
    TextView mtextView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton1 = findViewById(R.id.button1);
        mButton2 = findViewById(R.id.button2);
        mtextView1 =findViewById(R.id.textView1);

        mButton1.setOnClickListener(new MyOnlcickListener());
        mButton2.setOnClickListener(new MyOnlcickListener2());
    }

    class MyOnClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            mTextView1.setText("You clicked SAIDKHON button!!!");
        }
    }

    private class MyOnlcickListener2 implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            mTextView1.setText("You clicked my 2nd button!!!");
        }
    }

    private class MyOnlcickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {

        }
    }
}