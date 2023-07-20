package it.gb.simpleChat;

public abstract class SimpleChatApp {
    
    public static void executeSimpleChatApp() {
        ConcreteChatMediator chat = new ConcreteChatMediator();
        ChatUser user1 = new ChatUser(chat, "us3r0n3");
        ChatUser user2 = new ChatUser(chat, "us3r7w0");
        ChatUser user3 = new ChatUser(chat, "us3rt7r33");

        user1.connect();
        user2.connect();

        user1.sendMessage("Hi!");
        user2.sendMessage("Hello!");
        user1.sendMessage(":)");
        user2.disconnect();
        user1.sendMessage("T_T");
        user3.connect();
        user1.sendMessage("Hi!");
        user3.sendMessage("Hello there!"); 
        
        user1.disconnect();
        user3.disconnect();
    }
    
}
