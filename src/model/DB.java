package model;

import java.sql.*;

public class DB {
    public static String
        url = "jdbc:mysql://localhost:3306/psp_students",
        user = "root",
        password = "";

    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public static ResultSet getTable(String query) throws SQLException {
        return getConnection().createStatement().executeQuery(query);
    }
}