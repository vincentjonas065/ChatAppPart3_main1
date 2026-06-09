/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
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

    @Test
    public void testValidUsername() {
        assertTrue(login.checkUsername("vincent_j"));
    }

    @Test
    public void testInvalidUsername() {
        assertFalse(login.checkUsername("vincent"));
    }

    @Test
    public void testValidPhone() {
        assertTrue(login.checkPhoneNumber("0812345678"));
    }

    @Test
    public void testInvalidPhone() {
        assertFalse(login.checkPhoneNumber("abc123"));
    }
}