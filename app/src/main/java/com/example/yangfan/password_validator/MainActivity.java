/*This main class will used to validate
*a password strength.
*The Criteria are as following:
* passed 1 or 2 - invalid
* passed 3 or 4 - not strong
* passed 5 - strong
* */

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
        //by default, the password strength is invalid
        String passwordStrength = "invalid";
        EditText editText = (EditText)findViewById(R.id.editText);
        TextView textView = (TextView)findViewById(R.id.textView);
        //retrieve the text from the component with id=editText
        String inputEditTxt = editText.getText().toString();

        //use the string retrieved for validation
        int numPassed =new Validator().validate(inputEditTxt);
        if(numPassed == 5)
            passwordStrength = "Strong";
        else if(numPassed==3 ||numPassed ==4)
            passwordStrength = "not Strong";
        else
            passwordStrength = "invalid";

        //Update the textView with the corresponding strength.
        textView.setText(passwordStrength);

    }
}
