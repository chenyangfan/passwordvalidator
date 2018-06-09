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
    public void equalsIgnoreCase_Password(){
        assertEquals(valid.validate("PaSswOrd"),1);}

    @Test
    public void lessThanEight(){
        assertEquals(valid.validate("pwod"),1);}

    @Test
    public void MoreThanEight(){
        assertEquals(valid.validate("pweravsdd"),2);}
}
