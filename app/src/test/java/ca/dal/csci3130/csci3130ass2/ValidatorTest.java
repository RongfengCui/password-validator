package ca.dal.csci3130.csci3130ass2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTest {
    //Test Stage1
    @Test
    public void validatorTestStage1() {
        //following two rules
        //it is not "password" (case insensitive)
        //it is at least 8 characters long

        //test if user doesn't type any password(satisfy 0 rule)
        assertEquals(0, Validator.Stage1(""));

        //test if user type a "password" in any case(satisfy 1 rule)
        assertEquals(1, Validator.Stage1("Password"));

        //test if user type a word which has less than 8 characters(satisfy 1 rule)
        assertEquals(1, Validator.Stage1("pass"));

        //test if user type a word which has more than or equal 8 characters and not equal "password"(satisfy 2 rules)
        assertEquals(2, Validator.Stage1("abcdefgh"));
        assertEquals(2, Validator.Stage1("aaaaaaaaaaaaaa123"));
    }
}