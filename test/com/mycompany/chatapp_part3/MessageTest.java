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

    // Tests that a message is successfully added
    @Test
    public void testSendMessage() {
        message.sendMessage("Hello");
        assertEquals(1, message.getMessageCount());
    }

    // Tests that stored messages contain the correct value
    @Test
    public void testMessageStored() {
        message.sendMessage("Hi");
        assertTrue(message.getMessages().contains("Hi"));
    }

    // Tests that message count increases correctly
    @Test
    public void testMessageCountIncrease() {
        int before = message.getMessageCount();
        message.sendMessage("Test");
        assertEquals(before + 1, message.getMessageCount());
    }

    // Tests that longest message is correctly identified
    @Test
    public void testLongestMessage() {
        message.sendMessage("short");
        message.sendMessage("this is the longest message");

        assertEquals("this is the longest message", message.getLongestMessage());
    }

    // Tests behaviour when no messages exist
    @Test
    public void testEmptyLongestMessage() {
        Message m = new Message();
        assertNull(m.getLongestMessage());
    }

    // Ensures getMessages never returns null
    @Test
    public void testGetMessagesNotNull() {
        assertNotNull(message.getMessages());
    }
}
