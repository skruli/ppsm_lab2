package com.example.apka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateButton(View view) {
        EditText EditTextView = findViewById(R.id.EditTextView);
        int liczba = Integer.parseInt(EditTextView.getText().toString());
        int checkedId = ((RadioGroup) findViewById(R.id.radioGroup)).getCheckedRadioButtonId();
        String jedn = " ";
        double wynik = 0;
        switch (checkedId){
            case R.id.cm:
                wynik = liczba * 100;
                jedn = " cm";
                break;
            case R.id.km:
                wynik = liczba * 0.001;
                jedn = " km";
                break;
            case R.id.mile:
                wynik = liczba * 0.00062137;
                jedn = " mil";
                break;
            case R.id.ly:
                wynik = liczba * 0.0000000000000010570;
                jedn = " ly";
                break;
        }

        TextView WynikTextView = findViewById(R.id.WynikTextView);
        WynikTextView.setText("Wynik : " + wynik + jedn);
    }
}