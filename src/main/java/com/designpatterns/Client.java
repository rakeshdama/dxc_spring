package com.designpatterns;

public class Client {

    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        try
        {
            internet.connectTo("rakeshdama.me");
            internet.connectTo("google.com");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
