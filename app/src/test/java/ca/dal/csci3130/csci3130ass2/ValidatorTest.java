package ca.dal.csci3130.csci3130ass2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTest {
    //Test Stage2
    @Test
    public void validatorTestStage2() {
        //following five rules
        //rule 1: it is not "password" (case insensitive)
        //rule 2: it is at least 8 characters long
        //rule 3: it is at least 1 special character(which have to be @ ? !)
        //rule 4: it is at least 1 digit
        //rule 5: it contains both upper case and lower case

        //test if password satisfies rule 1,2,3,4,5
        assertEquals(5,Validator.Stage2("Pass123!"));

        //test if password satisfies rule 1,2,4,5
        assertEquals(4,Validator.Stage2("Ab1232434"));

        //test if password satisfies rule 1,2,3,5
        assertEquals(4,Validator.Stage2("Abcdefg!!!!"));

        //test if password satisfies rule 1,2,5
        assertEquals(3,Validator.Stage2("Youaregreat"));

        //test if password satisfies rule 1,4,5
        assertEquals(3,Validator.Stage2("You123"));

        //test if password satisfies rule 1,2
        assertEquals(2,Validator.Stage2("banananana"));

        //test if password satisfies rule 1
        assertEquals(1,Validator.Stage2("apple"));
    }
}