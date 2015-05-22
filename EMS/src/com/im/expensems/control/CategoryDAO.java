/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.expensems.control;

import com.im.expensems.db.DB;
import com.im.expensems.model.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Nadun Liyanage
 */
public class CategoryDAO {
    public static void save(Category c){
        try {
            String sql = "INSERT INTO category (name) VALUES (?)";
            Connection con = DB.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, c.getName());
            ps.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Saved!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
