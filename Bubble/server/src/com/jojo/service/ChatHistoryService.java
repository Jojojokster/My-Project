
package com.jojo.service;

import com.jojo.model.Model_Receive_Message;
import java.util.ArrayList;
import java.util.List;

public class ChatHistoryService {

    private List<Model_Receive_Message> chatHistory;

    public ChatHistoryService() {
        this.chatHistory = new ArrayList<>();
    }

    // Method to save a received message into the chat history
    public void saveReceivedMessage(Model_Receive_Message message) {
        chatHistory.add(message);
        // You can also save the message to a database or file here
    }

    // Method to retrieve the entire chat history
    public List<Model_Receive_Message> getChatHistory() {
        return chatHistory;
        // You can also retrieve the chat history from a database or file here
    }
}
