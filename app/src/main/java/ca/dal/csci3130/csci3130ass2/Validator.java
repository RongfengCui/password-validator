package ca.dal.csci3130.csci3130ass2;

public class Validator {

    public static int Stage1(String password) {
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
            return count;
    }
}