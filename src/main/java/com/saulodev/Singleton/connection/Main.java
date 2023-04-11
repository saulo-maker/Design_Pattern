package com.saulodev.Singleton.connection;

public class Main {
    public static void main(String[] args) {
        ConnectDatabase.getInstance().connect();
    }
}