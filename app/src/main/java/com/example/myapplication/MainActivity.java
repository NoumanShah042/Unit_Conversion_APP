package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText editText;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        editText = findViewById(R.id.editTextNumber);
        textView = findViewById(R.id.textView2);

        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
//                Toast.makeText(   MainActivity.this, "Event Listner Worked", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                if( s.matches("")){
                    textView.setText("");
                    Toast.makeText(   MainActivity.this, "Give some Value", Toast.LENGTH_SHORT).show();

                }
                else{
                    int kg = Integer.parseInt(s);
                    double pound = 2.205 * kg;
                    pound = (double) (Math.round(pound*100.0)/100.0); //  round upto 2 decimal places
                    textView.setText("In Pounds = " + pound);
                }
            }
        });

    }
}