/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.expensems.db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Nadun Liyanage
 */
public class DB {
    static String url = "jdbc:mysql://localhost:3306/dbexpense";
    static Connection con = null;
    
    
    public static Connection getCon()throws Exception{
        if(con==null){
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, "root", "0147");
        }
        
        return con;
    }
    
}
