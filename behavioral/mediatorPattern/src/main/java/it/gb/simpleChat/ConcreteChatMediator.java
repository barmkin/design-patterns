package it.gb.simpleChat;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConcreteChatMediator implements ChatMediator {
    private List<String> chatHistory;
    private Set<ChatUser> users;

    public ConcreteChatMediator() {
        super();
        chatHistory = new ArrayList<String>();
        users = new HashSet<ChatUser>();
    }

    @Override
    public void connect(ChatUser user) {
        if (this.users.contains(user)) {
            System.out.println("Already connected");
        } else {
            users.add(user);
            user.setConnected(true);
            System.out.println("User " + user.getNickname() + " connected");
        }
    }

    @Override
    public void disconnect(ChatUser user) {
        if (!this.users.contains(user)) {
            System.out.println("Already disconnected");
        } else {
            users.remove(user);
            user.setConnected(false);
            System.out.println("User " + user.getNickname() + " disconnected");
        }
    }

    private void messageCountersPlusPlus() {
        for (ChatUser user : this.users) {
            user.setLastMessageNumber(this.chatHistory.size());
        }
    }

    @Override
    public void sendMessage(String textMessage) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");
        String chatMessage = sdf.format(timestamp) + " - " + textMessage;
        chatHistory.add(chatMessage);
        this.messageCountersPlusPlus();
    }

    @Override
    public void sendMessage(ChatUser user, String textMessage) {
        if (!this.users.contains(user)) {
            System.out.println("Cannot send message to " + user.getNickname() + ". Not connected");
            return;
        }
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");
        String chatMessage = sdf.format(timestamp) + " - from " + user.getNickname() + " - " + textMessage;
        chatHistory.add(chatMessage);
        this.messageCountersPlusPlus();
    }

    @Override
    public List<String> receiveMessagesNotRead(ChatUser user) {
        List<String> textMessages = new ArrayList<String>();
        int userLastMessage = user.getLastMessageNumber();
        if (userLastMessage >= this.chatHistory.size()) {
            return textMessages;
        }
        for (int i = userLastMessage; i < this.chatHistory.size(); i++) {
            textMessages.add(this.chatHistory.get(i));
        }
        return textMessages;
    }
    
    
}
