/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
// Simple console menu for login and messaging system
package com.mycompany.chatapp_part3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Login login = new Login();
        Message message = new Message();

        boolean loggedIn = false;
// ===============================
// TEST LOGIN INPUT (GUIDE)
// ===============================
// Username: vincent_j
// Surname: Jonas
// Phone number: 0812345678
        while (true) {

            System.out.println("\n1. Login");
            System.out.println("2. Send Message");
            System.out.println("3. View Messages");
            System.out.println("4. Longest Message");
            System.out.println("5. Exit");
            System.out.print("Choose: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Username: ");
                    String u = input.nextLine();

                    System.out.print("Surname: ");
                    String s = input.nextLine();

                    System.out.print("Phone: ");
                    String p = input.nextLine();

                    loggedIn = login.loginUser(u, s, p);

                    System.out.println(loggedIn ? "Login success" : "Login failed");
                    break;

                case 2:
                    if (loggedIn) {
                        System.out.print("Message: ");
                        message.sendMessage(input.nextLine());
                    } else {
                        System.out.println("Login first");
                    }
                    break;

                case 3:
                    if (loggedIn) {
                        System.out.println(message.getMessages());
                    } else {
                        System.out.println("Login first");
                    }
                    break;

                case 4:
                    if (loggedIn) {
                        System.out.println("Longest: " + message.getLongestMessage());
                    } else {
                        System.out.println("Login first");
                    }
                    break;

                case 5:
                    System.out.println("Goodbye");
                    return;

                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
