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
    private static final String EMAIL_ADDRESS = "^[a-z0-9]+(([.+-_][a-z0-9])?)+(@[a-z0-9]{1})+(.[a-z]{3,4})+((.[a-z]{2})?)$";
    private static final String MOBILE_FORMAT = "^[1-9]{2} [1-9][0-9]{9}$";
    private static final String PASSWORD = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@~#$%^&*()]).{8,}$";

    /**
     * @description create method for producing the Result in terms of Valid or Invalid
     *
     */
    public void printingResult() {
        if (result) { //Verifying whether given Result is valid
            System.out.println("You Entered Input is Proper and Valid");
        } else {
            System.out.println("You Entered Input is inValid. Try again using Conditions");
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
     * @description create method for EmailAddress Validation
     * Rules: Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with
     * precise @ and . positions
     * E.g. abc.xyz@bl.co.in
     */
    private void eMailAddressValidation () {
        System.out.println("Enter the Your Email Address");
        String eMailAddress = sc.nextLine();
        //Matching the given Email Address with regular expression
        Pattern pattern = Pattern.compile(EMAIL_ADDRESS);
        result = pattern.matcher(eMailAddress).matches();
        printingResult();
    }

    /**
     * @description create method for Mobile Number Validation
     * Rule: Country code follow by space and 10 digit number
     * E.g. 91 9919819801
     */
    private void mobileNumberValidation () {
        System.out.println("Enter the Mobile Number");
        String mobileNumber = sc.nextLine();
        //Matching the given PhoneNumber with regular expression
        Pattern pattern = Pattern.compile(MOBILE_FORMAT);
        result = pattern.matcher(mobileNumber).matches();
        printingResult();
    }
    /**
     * @description create method for Validating Password
     * Rule1: minimum 8 Characters
     *Rule2:Should have at least 1 Upper Case
     * Rule3:Should have at least 1 Numerical Number
     * Rule4: should have at least 1 Special Character
     */
    private void passwordValidation () {
        System.out.println("Enter the Password");
        String password = sc.nextLine();
        //Matching the given password with regular expression
        Pattern pattern = Pattern.compile(PASSWORD);
        result = pattern.matcher(password).matches();
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
        userRegistration.eMailAddressValidation(); //calling EmailAddressValidation Method
        userRegistration.mobileNumberValidation(); //calling MobileNumber validation Method
        userRegistration.passwordValidation();     //calling Password Validation Method
    }
}
