package com.userregistrationprogram;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @description Class for defining the User Registration with regex
 *
 */
public class UserRegistrationProblem {
    //constant
    public static boolean result = false;
    private static final Scanner sc = new Scanner(System.in);
    //Regex Patterns
    private static final String FIRST_NAME_PATTERN = "^[A-Z][a-zA-Z]{3,}$";
    private static final String LAST_NAME_PATTERN = "^[A-Z][a-zA-Z]{3,}$";

    /**
     * @description create method for producing the Result in terms of Valid or Invalid
     *
     */
    public void printingResult() {
        if (result) { //Verifying whether given Result is valid
            System.out.println("You Entered result is Proper and Valid");
        } else {
            System.out.println("You Entered result is in Valid. Try again using Conditions");
        }
    }

    /**
     * @description create method for First Name Validation
     * Rule: first name starts with Cap and has minimum 3 characters
     *
     */
    private void firstNameValidation () {
        System.out.println("Enter the First Name");
        String firstName = sc.nextLine();
        //Matching the given name with regular expression
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        result = pattern.matcher(firstName).matches();
        printingResult();
    }

    /**
     * @description create method for First Name Validation
     * Rule: first name starts with Cap and has minimum 3 characters
     *
     */
    private void lastNameValidation () {
        System.out.println("Enter the Last Name");
        String lastName = sc.nextLine();
        //Matching the given name with regular expression
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        result = pattern.matcher(lastName).matches();
        printingResult();
    }

    /**
     * @description Main method to create the objects and for calling the methods
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Program"); //Printing the Welcome Message
        UserRegistrationProblem userRegistration = new UserRegistrationProblem();
        userRegistration.firstNameValidation();    //calling firstNameValidation Method
        userRegistration.lastNameValidation();     //calling lastNameValidation Method
    }
}
