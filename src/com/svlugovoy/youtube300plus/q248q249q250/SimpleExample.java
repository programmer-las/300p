package com.svlugovoy.youtube300plus.q248q249q250;

import java.sql.*;

/**
 * Created by Sergey on 09.12.2015.
 */
public class SimpleExample {
    public static void main(String[] args) {
        String user = "postgres";
        String pass = "postgres";
        String url = "jdbc:postgresql://localhost:5432/exampledb";
        String driver = "org.postgresql.Driver";

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
//1
        try {
            Class.forName(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
//2
        try {
            con = DriverManager.getConnection(url, user, pass);
//3
            st = con.createStatement();
//4
            rs = st.executeQuery("SELECT * FROM users;");
//5
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String login = rs.getString("login");
                String password = rs.getString("password");
                System.out.println("User: " + id + ", " + name + ", " + age + ", " + login + ", " + password);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//6
            try {
                rs.close();
                st.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}