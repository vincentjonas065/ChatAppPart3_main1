package com.mycompany.chatapp_part3;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTest {

    private Login login;

    @Before
    public void setUp() {
        login = new Login();
    }

    // Tests valid username format
    @Test
    public void testValidUsername() {
        assertTrue(login.checkUsername("vincent_j"));
    }

    // Tests invalid username format
    @Test
    public void testInvalidUsername() {
        assertFalse(login.checkUsername("vincent"));
    }

    // Tests valid phone number input
    @Test
    public void testValidPhone() {
        assertTrue(login.checkPhoneNumber("0812345678"));
    }

    // Tests invalid phone number input
    @Test
    public void testInvalidPhone() {
        assertFalse(login.checkPhoneNumber("abc123"));
    }
}
