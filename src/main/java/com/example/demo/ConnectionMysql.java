package com.example.demo;

import org.springframework.boot.autoconfigure.jdbc.JdbcProperties;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;

import java.sql.*;

public class ConnectionMysql {
    static Connection con;
    private JdbcProperties jdbcProperties;
    private JdbcTemplateAutoConfiguration jdbcTemplateAutoConfiguration;

    public static void run() {
        //Class.forName("com.mysql.jdbc.Driver");
        //con= DriverManager.getConnection("jdbc:mysql://localhost:3306/AppCertus","root","Aarom456");
        //Statement sentencia = con.createStatement();
        //ResultSet resultSet = sentencia.executeQuery("Select * from personas");
        String sentenciaSql = "insert into personas (namePrincipal, correoPersona, edad) values (?,?,?);";
    }
}
