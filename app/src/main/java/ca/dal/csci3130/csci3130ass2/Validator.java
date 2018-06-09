package ca.dal.csci3130.csci3130ass2;

import java.util.regex.Pattern;

public class Validator {

    public static int Stage2(String password) {

        //following five rules
        //rule 1: it is not "password" (case insensitive)
        //rule 2: it is at least 8 characters long
        //rule 3: it is at least 1 special character(which have to be @ ? !)
        //rule 4: it is at least 1 digit
        //rule 5: it contains both upper case and lower case

        //initial an int to count how many rules satisfied
        int count = 0;
        // judge whether there is no password(satisfying 0 rule)
        if (password.equals("") || password == null)
            return 0;
        //satisfying 1 rule which the password is more than 8 characters
        if (password.length() >= 8)
            count++;
        //satisfying 1 rule which the password is not equal to "password"
        if (!password.toLowerCase().equals("password"))
            count++;
        //satisfying 1 rule which the password contains special character which have to be @ ? !
        if (password.contains("@") || password.contains("?") || password.contains("!"))
            count++;

        //satisfying 1 rule which the password have at least one digit
        Pattern pattern = Pattern.compile("[0-9]");
        Boolean matcher1 = pattern.matcher(password).find();
        if (matcher1)
            count++;

        //find whether satisfying 1 rule which the password have both lower and upper case
        pattern = Pattern.compile("[a-z]");
        Boolean matcher2 = pattern.matcher(password).find();
        if(matcher2) {
            pattern = Pattern.compile("[A-Z]");
            Boolean matcher3 = pattern.matcher(password).find();
            if(matcher3)
                count++;
        }

        return count;

    }
}