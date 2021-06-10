package oop;

public class MessageParameter {

    void print(String message){
        System.out.println(message);
    }

    public static void main(String[] args) {
        MessageParameter messageParameter = new MessageParameter();
        messageParameter.print("You are a Java Challenger!");
    }
}
