package com.mycompany.chatapp_part3;

import java.util.ArrayList;

/**
 * Stores and manages user messages
 */
public class Message {

    private ArrayList<String> messages = new ArrayList<>();

    // Adds a new message if it's not empty
    public void sendMessage(String msg) {
        if (msg != null && !msg.trim().isEmpty()) {
            messages.add(msg);
        }
    }

    // Returns a copy of all stored messages
    public ArrayList<String> getMessages() {
        return new ArrayList<>(messages);
    }

    // Returns total number of messages stored
    public int getMessageCount() {
        return messages.size();
    }

    // Finds and returns the longest message
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
