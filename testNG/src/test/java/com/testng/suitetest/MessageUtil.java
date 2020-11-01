package com.testng.suitetest;

public class MessageUtil {
    private String message;

    public MessageUtil(String message) {
        this.message = message;
    }

    //打赢返回message
    public String pringMessage() {
        System.out.println("message = " + message);
        return message;
    }

    //增加message字符串长度
    public String salutationMessage() {
        message = "Hi" + message;
        System.out.println("message = " + message);
        return message;
    }
}
