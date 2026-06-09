/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
package com.mycompany.chatapp_part3;

import java.util.ArrayList;

public class Message {

    private ArrayList<String> messages = new ArrayList<>();

    public void sendMessage(String msg) {
        if (msg != null && !msg.trim().isEmpty()) {
            messages.add(msg);
        }
    }

    public ArrayList<String> getMessages() {
        return new ArrayList<>(messages);
    }

    public int getMessageCount() {
        return messages.size();
    }

    public String getLongestMessage() {
        if (messages.isEmpty()) return null;

        String longest = messages.get(0);

        for (String m : messages) {
            if (m.length() > longest.length()) {
                longest = m;
            }
        }

        return longest;
    }
}