/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
package com.mycompany.chatapp_part3;

/**
 * Handles user login validation logic
 */
public class Login {

    // Checks if username has underscore and minimum length
    public boolean checkUsername(String username) {
        return username != null && username.contains("_") && username.length() >= 3;
    }

    // Checks that surname is not empty
    public boolean checkSurname(String surname) {
        return surname != null && surname.trim().length() > 0;
    }

    // Checks that phone number contains only digits and is 10–15 characters long
    public boolean checkPhoneNumber(String phone) {
        return phone != null && phone.matches("\\d{10,15}");
    }

    // Validates full login input
    public boolean loginUser(String username, String surname, String phone) {
        return checkUsername(username)
                && checkSurname(surname)
                && checkPhoneNumber(phone);
    }
}
}
