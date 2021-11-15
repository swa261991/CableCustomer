package com.cablecust;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        /*String jdbcUrl = "jdbc:oracle:thin:@//localhost:1521/ORCLCDB.localdomain";
        String driver = "oracle.jdbc.driver.OracleDriver";
        String user = "many_to_one";
        String pass = "esigner";*/
        String jdbcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker?allowPublicKeyRetrieval=true&useSSL=false";
        String driver = "com.mysql.jdbc.Driver";
        String user = "root";
        String pass = "my-secret-pw";

        response.setContentType("text/html");
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        try {
            out.println("<h1>Connecting to database...</h1>");
            System.out.println("Connecting to database: "+jdbcUrl);
            Class.forName(driver);
            Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
            System.out.println("Connection Successfull !!!");
            out.println("<h1>Connection Successfull !!!</h1>");
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        out.println("</body></html>");
    }

    public void destroy() {
    }
}