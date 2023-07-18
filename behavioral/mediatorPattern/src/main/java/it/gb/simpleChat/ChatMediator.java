package it.gb.simpleChat;

import java.util.List;

public interface ChatMediator {
    void connect(ChatUser user);
    void disconnect(ChatUser user);
    void sendMessage(String textMessage);
    void sendMessage(ChatUser user, String textMessage);
    List<String> receiveMessagesNotRead(ChatUser user);
}
