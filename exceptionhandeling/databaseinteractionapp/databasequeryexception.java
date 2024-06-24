package exceptionhandeling.databaseinteractionapp;

import java.sql.*;

public class databasequeryexception {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/postgresql"; // Replace with actual database URL
        String username = "javadb_owner"; // Replace with your database username
        String password = "tBvNez21GSTa"; // Replace with your database password

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(jdbcUrl, username, password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM Users"); // Replace with your SQL query

            while (resultSet.next()) {
                System.out.println("User ID: " + resultSet.getInt("id"));
                System.out.println("User Name: " + resultSet.getString("name"));
            }
        } catch (SQLException e) {
            System.out.println("An error occurred while interacting with the database: " + e.getMessage());
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println("An error occurred while closing the database resources: " + e.getMessage());
            }
        }
    }
}
