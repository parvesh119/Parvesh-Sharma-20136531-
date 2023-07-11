package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

 

public class Question1 {

    public static void main(String[] args) {

        // Create Connection object
     

        try {

            // Register JDBC driver
        	 Class.forName("com.mysql.cj.jdbc.Driver");

        	 Connection connection  = DriverManager.getConnection("jdbc:mysql://localhost:3306/exam", "root", "1234");
            Statement statement = connection.createStatement();
            System.out.println("Connection established ");

            

//          statement.execute("INSERT INTO Emp VALUES(100,'Thanesh', 25, 50000, 'Developer')");
//          statement.execute("INSERT INTO Emp VALUES(200,'Suman', 45, 60000, 'Clerk')");
//          statement.execute("INSERT INTO Emp VALUES(300,'Pravin', 55, 90000, 'Manager')");


            
           // System.out.println("Data inserted successfully!");
            Statement st = connection.createStatement();    
            ResultSet rs = st.executeQuery("select * from emp");

            while(rs.next()) {
            	System.out.println("   ");
                System.out.println(" " + rs.getInt(1) + "  " + rs.getString(2)  + "      " + rs.getInt(3) + "     "
                + rs.getInt(4) + "    " + rs.getString(5));

            }

 

        }

        catch (ClassNotFoundException e) {

            // JDBC driver not found exception

            System.out.println("JDBC driver not found!");
            e.printStackTrace();
        }
        catch (SQLException e) {
            // Connection error
            System.out.println(" failed!");
            e.printStackTrace();
        }
    }
}