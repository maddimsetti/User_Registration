package com.userregistrationprogram;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistrationProblem validation = new UserRegistrationProblem();  //Creating Object for User Registration Test

    /**
     * @description create Method for Testing the Valid FirstName
     *
     */
    @Test
    public void givenFirstName_WhenValid_ShouldReturnHappy () {
        boolean result = validation.firstNameValidation("AVESh");
        Assertions.assertTrue(result);           //verifying the Result Using AssertTrue
        boolean result1 = validation.firstNameValidation("SRefR");
        Assertions.assertTrue(result1);
        boolean result2 = validation.firstNameValidation("SriRam");
        Assertions.assertTrue(result2);
    }

    /**
     * @description create Method for Testing the Invalid FirstName
     *
     */
    @Test
    public void givenFirstName_WhenNotValid_ShouldReturnSad () {
        boolean result = validation.firstNameValidation("rEsHTed");
        Assertions.assertFalse(result);          //verifying the Result Using AssertFalse
        boolean result1 = validation.firstNameValidation("saTya");
        Assertions.assertFalse(result1);
        boolean result2 = validation.firstNameValidation("lakSHmI");
        Assertions.assertFalse(result2);
    }

    /**
     * @description create Method for Testing the Valid LastName
     *
     */
    @Test
    public void givenLastName_WhenValid_ShouldReturnHappy () {
        boolean result = validation.lastNameValidation("KriSh");
        Assertions.assertTrue(result);           //verifying the Result Using AssertTrue
        boolean result1 = validation.lastNameValidation("BaLAR");
        Assertions.assertTrue(result1);
        boolean result2 = validation.lastNameValidation("GaNaPathI");
        Assertions.assertTrue(result2);
    }

    /**
     * @description create Method for Testing the Valid LastName
     *
     */
    @Test
    public void givenLastName_WhenNotValid_ShouldReturnSad () {
        boolean result = validation.lastNameValidation("kRiSh");
        Assertions.assertFalse(result);          //verifying the Result Using AssertFalse
        boolean result1 = validation.lastNameValidation("rAmesH");
        Assertions.assertFalse(result1);
        boolean result2 = validation.lastNameValidation("soWMitH");
        Assertions.assertFalse(result2);
    }

    /**
     * @description create Method for Testing the Valid EmailAddress
     *
     */
    @Test
    public void givenEmailAddress_WhenValid_ShouldReturnHappy () {
        boolean result = validation.eMailAddressValidation("maddimsetti143@gmail.com");
        Assertions.assertTrue(result);           //verifying the Result Using AssertTrue
        boolean result1 = validation.eMailAddressValidation("abc@gmail.com.in");
        Assertions.assertTrue(result1);
        boolean result2 = validation.eMailAddressValidation("krishna917@gmail.com");
        Assertions.assertTrue(result2);
    }

    /**
     * @description create Method for Testing the Invalid EmailAddress
     *
     */
    @Test
    public void givenEmailAddress_WhenNotValid_ShouldReturnSad () {
        boolean result = validation.eMailAddressValidation("Maddimsetti143@gmail.com");
        Assertions.assertFalse(result);          //verifying the Result Using AssertFalse
        boolean result1 = validation.eMailAddressValidation("#abc@gmail.com.in");
        Assertions.assertFalse(result1);
        boolean result2 = validation.eMailAddressValidation("abc&def@gmail.com.in");
        Assertions.assertFalse(result2);
    }

    /**
     * @description create Method for Testing the Valid MobileNumber
     *
     */
    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnHappy () {
        boolean result = validation.mobileNumberValidation ("91 9667914789");
        Assertions.assertTrue(result);           //verifying the Result Using AssertTrue
        boolean result1 = validation.mobileNumberValidation("91 9617648433");
        Assertions.assertTrue(result1);
        boolean result2 = validation.mobileNumberValidation("51 9843566100");
        Assertions.assertTrue(result2);
    }

    /**
     * @description create Method for Testing the Invalid MobileNumber
     *
     */
    @Test
    public void givenMobileNumber_WhenNotValid_ShouldReturnSad () {
        boolean result = validation.mobileNumberValidation("91 984685248");
        Assertions.assertFalse(result);          //verifying the Result Using AssertFalse
        boolean result1 = validation.mobileNumberValidation("98 45758234609");
        Assertions.assertFalse(result1);
        boolean result2 = validation.mobileNumberValidation("11 457582349");
        Assertions.assertFalse(result2);
    }

    /**
     * @description create Method for Testing the Valid Password
     *
     */
    @Test
    public void givenPassword_WhenValid_ShouldReturnHappy () {
        boolean result = validation.passwordValidation("P@ssWorD123");
        Assertions.assertTrue(result);           //verifying the Result Using AssertTrue
        boolean result1 = validation.passwordValidation("PassW@rD32");
        Assertions.assertTrue(result1);
        boolean result2 = validation.passwordValidation("SowM!tH32");
        Assertions.assertTrue(result2);
    }

    /**
     * @description create Method for Testing the InValid Password
     *
     */
    @Test
    public void givenPassword_WhenNotValid_ShouldReturnSad () {
        boolean result = validation.passwordValidation("PassWo@rd");
        Assertions.assertFalse(result);          //verifying the Result Using AssertFalse
        boolean result1 = validation.passwordValidation("p@ssword12");
        Assertions.assertFalse(result1);
        boolean result2 = validation.passwordValidation("PaLLaVi12");
        Assertions.assertFalse(result2);
    }
}
