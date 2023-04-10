package com.saulodev.Singleton.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectDatabase {
    private static final ConnectDatabase singleton = new ConnectDatabase();
    public static ConnectDatabase getInstance() {
        return singleton;
    }
    public Connection connect() {

        final String url = "jdbc:postgresql://localhost/teste";
        final String user = "postgres";
        final String password = "admin123";

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conectado ao servidor com sucesso.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}