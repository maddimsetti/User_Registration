package com.userregistrationprogram;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class ParameterizedUserRegistrationTest {
    public final String validEmailTest;
    public final boolean expectedEmailResult;
    public UserRegistrationProblem userRegistrationProblem;

    public ParameterizedUserRegistrationTest(String email, boolean expectedEmailResult) {
        super();
        this.validEmailTest = email;
        this.expectedEmailResult = expectedEmailResult;
    }

    @Before
    public void initialize() {
        userRegistrationProblem = new UserRegistrationProblem();
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true},
                {"abc", false},
                {"abc@.com", false},
                {"abc123@gmail.a", false},
                {"abc123@.com", false},
                {"abc123@.com.com", false},
                {".abc@abc.com", false},
                {"abc()*@gmail.com", false},
                {"abc@%*.com", false},
                {"abc..2002@gmail.com", false},
                {"abc.@gmail.com", false},
                {"abc@abc@gmail.com", false},
                {"abc@gmail.com.1a", false},
                {"abc@gmail.com.aa.au", false}
        });
    }

    @Test
    public void givenEmailAsVariable_ShouldReturn_AsPerParameterisedResult() throws Exception {
        System.out.println("This is Expected Result " + this.expectedEmailResult);
        Assert.assertEquals(this.expectedEmailResult, userRegistrationProblem.eMailAddressValidation(this.validEmailTest));
    }
}
