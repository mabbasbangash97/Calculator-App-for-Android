package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {



    public void add(View view){
        EditText val1EditText = (EditText)findViewById(R.id.val1_TextView);
        EditText val2EditText = (EditText)findViewById(R.id.val2_TextView);
        int val1 = Integer.parseInt(val1EditText.getText().toString());
        int val2 = Integer.parseInt(val2EditText.getText().toString());
        int result;
        Toast.makeText(this, ""+(val1+val2),Toast.LENGTH_LONG).show();
    }

    public void subtract(View view){
        EditText val1EditText = (EditText)findViewById(R.id.val1_TextView);
        EditText val2EditText = (EditText)findViewById(R.id.val2_TextView);
        int val1 = Integer.parseInt(val1EditText.getText().toString());
        int val2 = Integer.parseInt(val2EditText.getText().toString());
        int result;
        Toast.makeText(this, ""+(val1-val2),Toast.LENGTH_LONG).show();
    }

    public void divide(View view){
        EditText val1EditText = (EditText)findViewById(R.id.val1_TextView);
        EditText val2EditText = (EditText)findViewById(R.id.val2_TextView);
        int val1 = Integer.parseInt(val1EditText.getText().toString());
        int val2 = Integer.parseInt(val2EditText.getText().toString());
        int result;
        Toast.makeText(this, ""+val1/val2,Toast.LENGTH_LONG).show();
    }

    public void multiply(View view){
        EditText val1EditText = (EditText)findViewById(R.id.val1_TextView);
        EditText val2EditText = (EditText)findViewById(R.id.val2_TextView);
        int val1 = Integer.parseInt(val1EditText.getText().toString());
        int val2 = Integer.parseInt(val2EditText.getText().toString());
        int result;
        Toast.makeText(this, ""+val1*val2,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}