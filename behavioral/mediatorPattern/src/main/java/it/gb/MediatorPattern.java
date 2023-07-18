package it.gb;

import it.gb.generic.ConcreteMediator;
import it.gb.simpleChat.ChatUser;
import it.gb.simpleChat.ConcreteChatMediator;

public class MediatorPattern {

    public static void executeGeneric() {
        ConcreteMediator mediator = new ConcreteMediator();

        mediator.assignTask1();
        mediator.assignTask2();
        mediator.assignTaskToAll();
    }

    public static void main(String[] args) {
        System.out.println("Hello, Mediator Pattern!");

        // uncomment to play generic mediator pattern to coordinate
        // assigning task
        //executeGeneric();

        // a simple chat
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
