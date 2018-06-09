package com.example.yangfan.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClick(View v){
        String passwordStrength = "not Strong";
        EditText e1 = (EditText)findViewById(R.id.editText);
        TextView t1 = (TextView)findViewById(R.id.textView);
        String e = e1.getText().toString();
        Validator valid = new Validator();
        int numPassed = valid.validate(e);
        if(numPassed == 5)
            passwordStrength = "Strong";
        t1.setText(passwordStrength);
    }
}
