package com.example.demo;

import org.springframework.boot.autoconfigure.jdbc.JdbcProperties;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;

public class ConnectionMysql {

    private JdbcProperties jdbcProperties;
    private JdbcTemplateAutoConfiguration jdbcTemplateAutoConfiguration;


    public static void run(){
        String sentenciaSql = "insert into personas (namePrincipal, correoPersona, edad) values (?,?,?);";
    }
}
