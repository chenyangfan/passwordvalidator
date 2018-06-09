package com.example.yangfan.password_validator;

public class Validator {
    private final String SpecialChars="<([{\\^-=$!|]})?*+.>@%~`#;";
    public int validate(String userInput ){

        int numPassed = 0 ;

        if(userInput.length() >= 8)
            numPassed++;

        if(!userInput.equalsIgnoreCase("password"))
            numPassed++;

        boolean containsDigit = false;
        boolean containsCaptial = false;
        boolean containsLower = false;
        boolean specialCharacter = false;
        for(int i =0 ; i < userInput.length(); i++ ) {
            if (Character.isDigit(userInput.charAt(i)))
                containsDigit = true;
            if(userInput.charAt(i) >=65 && userInput.charAt(i) <= 90)
                containsCaptial = true;
            if(userInput.charAt(i) >=97 && userInput.charAt(i) <= 122)
                containsLower = true;
            if(SpecialChars.indexOf(userInput.charAt(i)) != -1)
                specialCharacter = true;
        }

        if(containsDigit)
            numPassed++;
        if(containsCaptial && containsLower)
            numPassed++;
        if(specialCharacter)
            numPassed++;
        return numPassed;
    }


}
