package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateExample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver Loaded!");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demojdbc","root","Sharad@1998");
        System.out.println("Connected!!!!!");

        Statement statement = connection.createStatement();
        boolean x =statement.execute("create table sharad(id int , name varchar(10), address varchar(150));") ;
        if(x){
            System.out.println("failed");
        }
        else {
            System.out.println("Successes");
        }
        connection.close();
    }
}
