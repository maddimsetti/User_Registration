package com.userregistrationprogram;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @description Class for defining the User Registration with regex
 *
 */
public class UserRegistrationProblem {
    //constant
    private static final Scanner sc = new Scanner(System.in);
    //Regex Patterns
    private static final String FIRST_NAME_PATTERN = "^[A-Z][a-zA-Z]{3,}$";
    private static final String LAST_NAME_PATTERN = "^[A-Z][a-zA-Z]{3,}$";
    private static final String EMAIL_ADDRESS = "^[a-z0-9]+(([.+-_][a-z0-9])?)+(@[a-z0-9]{1})+(.[a-z]{3,4})+((.[a-z]{2})?)$";
    private static final String MOBILE_FORMAT = "^[1-9]{2} [1-9][0-9]{9}$";
    private static final String PASSWORD = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@~#$%^&*()]).{8,}$";

    /**
     * @description create method for First Name Validation
     * Rule: first name starts with Cap and has minimum 3 characters
     *
     */
    private void firstNameValidation ()  {
        List<String> myList = Arrays.asList("Krishna","sahil","Bhaskar","Sowmith");
        //Matching the given name with regular expression
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        Predicate<String> predicate = pattern.asPredicate();
        myList.forEach(firstName -> {
            System.out.println("The Valid FirstName of " + firstName + " check for valid " + predicate.test(firstName));});

    }

    /**
     * @description create method for First Name Validation
     * Rule: first name starts with Cap and has minimum 3 characters
     *
     */
    private void lastNameValidation () {
        List<String> myList = Arrays.asList("Maddimsetti","Mohammad","Nakkina","Narayana");
        //Matching the given name with regular expression
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        Predicate<String> predicate = pattern.asPredicate();
        myList.forEach(lastName -> {
            System.out.println("The Valid LastName of " + lastName + " check for valid " + predicate.test(lastName));});
    }

    /**
     * @description create method for EmailAddress Validation
     * Rules: Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with
     * precise @ and . positions
     * E.g. abc.xyz@bl.co.in
     */
    private void eMailAddressValidation ()  {
        List<String> myList = Arrays.asList("maddimsetti143@gmail.com","abc.100@gmail.com","krishna@gmail.com","divya.ser345@gmail.au.in","%abc-@gmail.com.com");
        //Matching the given Email Address with regular expression
        Pattern pattern = Pattern.compile(EMAIL_ADDRESS);
        Predicate<String> predicate = pattern.asPredicate();
        myList.forEach(emailAddress -> {
            System.out.println("The Valid Email Address of " + emailAddress + " check for valid " + predicate.test(emailAddress));});
    }

    /**
     * @description create method for Mobile Number Validation
     * Rule: Country code follow by space and 10 digit number
     * E.g. 91 9919819801
     */
    private void mobileNumberValidation ()  {
        List<String> myList = Arrays.asList("91 9669874583","85 4785456152","451058478945","91 457845612","11 4561237895");
        //Matching the given PhoneNumber with regular expression
        Pattern pattern = Pattern.compile(MOBILE_FORMAT);
        Predicate<String> predicate = pattern.asPredicate();
        myList.forEach(mobileNumber -> {
            System.out.println("The Valid Mobile Number of " + mobileNumber + " check for valid " + predicate.test(mobileNumber));});
    }
    /**
     * @description create method for Validating Password
     * Rule1: minimum 8 Characters
     * Rule2:Should have at least 1 Upper Case
     * Rule3:Should have at least 1 Numerical Number
     * Rule4: should have at least 1 Special Character
     */
    private void passwordValidation ()  {
        List<String> myList = Arrays.asList("Password@1","passw@rD123","password@123","PassWord123","Passw@RdEr","Passw@Redr123");
        //Matching the given password with regular expression
        Pattern pattern = Pattern.compile(PASSWORD);
        Predicate<String> predicate = pattern.asPredicate();
        myList.forEach(password -> {
            System.out.println("The Valid Password of " + password + " check for valid " + predicate.test(password));});
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
