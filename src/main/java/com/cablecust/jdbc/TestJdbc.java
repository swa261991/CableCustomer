package com.cablecust.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJdbc {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:oracle:thin:@//localhost:1521/ORCLCDB.localdomain";
        String userPassword = "esigner";
        try {
            System.out.println("Connecting to database: "+jdbcUrl);
            Connection myConn = DriverManager.getConnection(jdbcUrl, userPassword, userPassword);
            System.out.println("Connection Successfull !!!");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
