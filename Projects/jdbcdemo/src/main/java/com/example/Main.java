package com.example;

import java.lang.Thread.State;
import java.sql.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;

/*
 * steps in jdbc:
 * 1. import packages  ->import java.sql.*;
 * 2. load and register ->(optional) class.forName("org.postgres.Driver")
 * 3. create connection
 * 4. create statement
 * 5. execute statement
 * 6. processs the results
 * 7. close connection  
 */
public class Main {

    static void demo1(Connection con) throws SQLException {
        
        Statement st = con.createStatement(); //create statement
        String sql = "select model from cars where brand='Tata'";
        ResultSet res = st.executeQuery(sql);
        // System.out.println(res.next());//boolean -> true if record is there , else
        // vice versa //process result
        boolean recfound = res.next();// this moves the pointer...without this, if you used getString, it may cause
         // issue
        // org.postgresql.util.PSQLException: ResultSet not positioned properly, perhaps
        // you need to call next.
        // boolean recfound = false;
        if (recfound == true) {
            String output = res.getString("model");
            System.out.println("Model is :" + output);
        } else {
            System.out.println("record not found");
        }
        System.out.println("connection closed");
    }

    static void demo2(Connection con) throws SQLException
    {
        //printing all records
        System.out.println("Lets print all records");
        Statement st = con.createStatement(); //create statement
        String sql = "select * from cars";
        
        ResultSet res =  st.executeQuery(sql);
        while (res.next()) {
            System.out.print(res.getString(1) + " ");
            System.out.print(res.getString(2) + " ");
            System.out.println(res.getInt(3));

        }
    }

    public static void main(String[] args) throws SQLException {
        System.out.println("Hello world!");
        try{Class.forName("org.postgresql.Driver");} //optioanl
        catch(Exception e) { System.out.println("Hey got exception : " + e.getMessage());}

        String url = "jdbc:postgresql://localhost:5431/";
        String uname = "postgres";
        String pass = "password";
        
        Connection con  = DriverManager.getConnection(url, uname, pass); //create connection
        System.out.println("connection established");
        
        // demo1(con);
        demo2(con);


        con.close();
        
    }
}