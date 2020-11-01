package com.testng.zutest;

public class MessageUtil {
    private String message;

    public MessageUtil(String message) {
        this.message = message;
    }

    public String printMessage() {
        System.out.println("message = " + message);
        return message;
    }

    public String salutationMessage() {
        message = "tutorialspoint" + message;
        System.out.println("message = " + message);
        return message;
    }

    public String exitMessage() {
        message = "www." + message;
        System.out.println("message = " + message);
        return message;
    }
}
