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
 *
 * @author Student
 */
public class Login {

    public boolean checkUsername(String username) {
        return username != null && username.contains("_") && username.length() >= 3; // checking username
    }

    public boolean checkSurname(String surname) {
        return surname != null && surname.trim().length() > 0;
    }

    public boolean checkPhoneNumber(String phone) {
        return phone != null && phone.matches("\\d{10,15}");
    }

    public boolean loginUser(String username, String surname, String phone) {
        return checkUsername(username)
                && checkSurname(surname)
                && checkPhoneNumber(phone);
    }
}
