package com.example.yangfan.password_validator;
/*Will use the following criteria(as suggested on the assignment)
*at least one special character
*at least one digit
* both upper and lower case
 */
public class Validator {
    //the following special characters are considered valid.
    private final String SpecialChars="<([{^-=$!|]})?*+.>@%~`#;";
    public int validate(String userInput ){
        //test for the basic criteria.
        int numPassed = 0 ;
        if(userInput.length() >= 8)
            numPassed++;
        if(!userInput.equalsIgnoreCase("password"))
            numPassed++;

        //will pass the userInput for three more criteria.
        numPassed+=ThreeMoreCriterionAdded(userInput);
        return numPassed;
    }

    public int ThreeMoreCriterionAdded(String userInput){
        //number of criteria for passing is 0
        int numPassed = 0;

        //all set to false
        boolean containsDigit = false;
        boolean containsCaptial = false;
        boolean containsLower = false;
        boolean specialCharacter = false;

        //check each character whether it contains
        //digit,capital letter, lower case letter or special
        //case, running the for-loop

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
        //when the string contains all digits
        //the other two criteria will automatically fail
        if(containsDigit)
            numPassed++;
        if(containsCaptial && containsLower)
            numPassed++;
        if(specialCharacter)
            numPassed++;
        //return the how many criteria passed.
        return numPassed;

    }


}
