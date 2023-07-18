package it.gb.simpleChat;

import java.util.List;

public class ChatUser {
    private ChatMediator chat;
    private String nickname;
    protected boolean isConnected;
    private int lastMessageNumber;

    public int getLastMessageNumber() {
        return lastMessageNumber;
    }
    public void setLastMessageNumber(int lastMessageNumber) {
        this.lastMessageNumber = lastMessageNumber;
    }
    protected void setConnected(boolean isConnected) {
        this.isConnected = isConnected;
    }
    public boolean isConnected() {
        return this.isConnected;
    }  

    public ChatUser(ChatMediator chat, String nickname) {
        this.chat = chat;
        this.nickname = nickname;
        this.lastMessageNumber = 0;
    }

    public ChatMediator getChat() {
        return chat;
    }

    public String getNickname() {
        return nickname;
    }

    public void readMessage(String message, int messageNumber) {
        if (messageNumber <= this.lastMessageNumber) {
            System.out.println("You have read all messages.");
        } else {
            System.out.println("{" + this.nickname + "} " + message);
            this.lastMessageNumber = messageNumber;
        }
    }


    public void connect() {
        this.chat.connect(this);
        this.readMessages();
    }

    public void disconnect() {
        this.chat.disconnect(this);
    }

    public void sendMessage(String textMessage) {
        this.chat.sendMessage(this, textMessage);
        System.out.println(this.getNickname() + " - " + textMessage);
    }

    private void readMessages() {
        List<String> textMessages = this.chat.receiveMessagesNotRead(this);
        for (String message : textMessages) {
            System.out.println("{"+this.nickname+"} | " + message);
        }
    }
    
}
