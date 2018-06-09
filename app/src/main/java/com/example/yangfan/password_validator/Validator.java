package com.example.yangfan.password_validator;

public class Validator {

    public int validate(String userInput ){
        int numPassed = 0 ;

        if(userInput.length() >= 8)
            numPassed++;

        if(!userInput.equalsIgnoreCase("password"))
            numPassed++;

        return numPassed;

    }

}
