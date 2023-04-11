package com.saulodev.Singleton.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectDatabase {
    // Criado atributo imutável recebendo um nova instância da classe.
    private static final ConnectDatabase singleton = new ConnectDatabase();
    // Método responsável por retornar a instância da classe
    public static ConnectDatabase getInstance() {
        return singleton;
    }
    // Criado classe conexão com o banco
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