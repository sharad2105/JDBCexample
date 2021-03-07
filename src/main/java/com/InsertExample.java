package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertExample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver Loaded!");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demojdbc","root","Sharad@1998");
        System.out.println("Connected!!!!!");

        PreparedStatement preparedStatement = connection.prepareStatement("insert into sharad values (?, ?, ?) ");
        preparedStatement.setInt(1,101);
        preparedStatement.setString(2, "suraj");
        preparedStatement.setString(3, "Nyahalod");
        int x = preparedStatement.executeUpdate();
        if (x > 0 ){
            System.out.println("Success");
        }
        else {
            System.out.println("failed");
        }
//
//        PreparedStatement preparedStatement1 = connection.prepareStatement("delete from sharad where address = ?;");
//        preparedStatement1.setString(1," chiplun");
//        int x1 = preparedStatement1.executeUpdate();
//        if (x1 > 0 ){
//            System.out.println("Success");
//        }
//        else {
//            System.out.println("failed");
//

        connection.close();
    }
}
