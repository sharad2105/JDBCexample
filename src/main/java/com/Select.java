package com;

import java.sql.*;

public class Select {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver Loaded!");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demojdbc","root","Sharad@1998");
        System.out.println("Connected!!!!!");

        PreparedStatement pst = connection.prepareStatement("select *from sharad where id = ?");
        pst.setInt(1,101);
        ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                System.out.println(rs.getInt(1)+ " " + rs.getString(2)+
                        " " +rs.getString(3));
            }
            connection.close();

    }
}
