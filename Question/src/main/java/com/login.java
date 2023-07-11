package com;

import java.io.IOException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class login extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String sid = request.getParameter("sid");
        String sname = request.getParameter("sname");
        String phone = request.getParameter("phone");
        String marks = request.getParameter("marks");
        String branch = request.getParameter("branch");


        try {
            // Register JDBC driver
        	 Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/igt","root", "1234");

            // Prepare the SQL statement
             PreparedStatement st=con.prepareStatement("insert into students values(?,?,?,?,?)");
            st.setString(1, sid);
            st.setString(2, sname);
            st.setString(3, phone);
            st.setString(4, marks);
            st.setString(5, branch);

            // Execute the statement
            int rowsInserted = st.executeUpdate();
            st.close();
            con.close();

            if (rowsInserted > 0) {
                response.setContentType("text/html");
                PrintWriter out = response.getWriter();
                out.println("<h1>Congrats, you are successfully registered!</h1>");
            } else {
                response.setContentType("text/html");
                PrintWriter out = response.getWriter();
                out.println("<h2>Error: Registration failed!</h2>");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

