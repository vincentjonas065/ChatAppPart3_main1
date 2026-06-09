/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

package com.mycompany.chatapp_part3;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MessageTest {

    private Message message;

    @Before
    public void setUp() {
        message = new Message();
    }

    @Test
    public void testSendMessage() {
        message.sendMessage("Hello");
        assertEquals(1, message.getMessageCount());
    }

    @Test
    public void testMessageStored() {
        message.sendMessage("Hi");
        assertTrue(message.getMessages().contains("Hi"));
    }

    @Test
    public void testMessageCountIncrease() {
        int before = message.getMessageCount();
        message.sendMessage("Test");
        assertEquals(before + 1, message.getMessageCount());
    }

    @Test
    public void testLongestMessage() {
        message.sendMessage("short");
        message.sendMessage("this is the longest message");

        assertEquals("this is the longest message", message.getLongestMessage());
    }

    @Test
    public void testEmptyLongestMessage() {
        Message m = new Message();
        assertNull(m.getLongestMessage());
    }

    @Test
    public void testGetMessagesNotNull() {
        assertNotNull(message.getMessages());
    }
}