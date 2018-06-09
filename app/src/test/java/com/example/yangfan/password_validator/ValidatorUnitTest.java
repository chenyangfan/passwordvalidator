package com.example.yangfan.password_validator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ValidatorUnitTest {
    Validator valid = new Validator();
    @Test
    public void nothingInput(){
        assertEquals(valid.validate(""),1);}
    @Test
    public void equals_Password(){
        assertEquals(valid.validate("password"),1);}

    @Test
    //This output of this test will be 2 because we added "has both
    //Capital and lower case letters, passed : >=8 as well
    public void equalsIgnoreCase_Password(){
        assertEquals(valid.validate("PaSswOrd"),2);}

    @Test
    public void lessThanEight(){
        assertEquals(valid.validate("pwod"),1);}

    @Test
    public void MoreThanEight(){
        assertEquals(valid.validate("pweravsdd"),2);}

    @Test
    public void eightNumbers(){
        assertEquals(valid.validate("12345678"),3);}

    @Test
    public void eightNumbersAndallLower(){
        assertEquals(valid.validate("12345678da"),3);}

    @Test
    public void eightNumbersAndCapAndLower(){
        assertEquals(valid.validate("12345678daL"),4);}

    @Test
    public void AllCap(){
        assertEquals(valid.validate("QWERTTYDF"),2);}

    @Test
    public void allSpecialCharacter(){
        assertEquals(valid.validate("!@#%%^%$##@@"),3);}

    @Test
    public void AllFiveCriterion(){
        assertEquals(valid.validate("12345678.daL"),5);}

}
