package com.testng.performtest;

public class MessageUtil {
    private String message;

    public MessageUtil(String message) {
        this.message = message;
    }

    public String pringMessage(){
        System.out.println(message);
        return message;
    }
}
