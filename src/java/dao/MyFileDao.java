/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelPackage.MyFile;
import util.DBconnector;

/**
 *
 * @author antonis
 */
public class MyFileDao {

//    Connection con=null;
//
//    public MyFileDao() {
//        Connection con = DBconnector.getConnection();
//    } ayto to kano otan den exo class connector
    public MyFileDao() {
    }

    public MyFile getById(int id) {
        MyFile myfile = new MyFile();
        Connection con = DBconnector.getConnection();

        try {

            String sql = "SELECT * FROM MY_FILES WHERE MYFILE_ID=?";

            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                myfile.setId(rs.getInt(1));
                myfile.setFilename(rs.getString(2));
                //myfile.setthefile(rs.getBytes(3));
                myfile.setThefileasablop(rs.getBlob(3));
            }

        } catch (SQLException ex) {
            Logger.getLogger(MyFileDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(MyFileDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return myfile;
    }

    public ArrayList<MyFile> getAll() {
        ArrayList<MyFile> myfiles = new ArrayList<MyFile>();
        try {
            Connection con = DBconnector.getConnection();

            String sql = "SELECT * FROM MY_FILES";

            PreparedStatement pst = con.prepareStatement(sql);

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                MyFile myfile = new MyFile();
                myfile.setId(rs.getInt(1));
                myfile.setFilename(rs.getString(2));
                myfile.setThefileasablop(rs.getBlob(3));
                myfiles.add(myfile);

            }

        } catch (SQLException ex) {
            Logger.getLogger(MyFileDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return myfiles;

    }

    public void deleteFile(int id) {
        try {
            MyFile myfile = new MyFile();
            Connection con = DBconnector.getConnection();
            
            String sql = "DELETE FROM MY_FILES WHERE MYFILE_ID=?";
            
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            
            System.out.println("rows deleted "+pst.executeUpdate());
        } catch (SQLException ex) {
            Logger.getLogger(MyFileDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void insertFile() throws SQLException {

        MyFile myfile = new MyFile();
        Connection con = DBconnector.getConnection();
        PreparedStatement ps = null;
        String query = "INSERT INTO MY_FILES VALUES(null,?,?)";
        ps = con.prepareStatement(query);
        ps.setString(1, myfile.getFilename());
        ps.setBlob(2, myfile.getThefileasablop());
        ps.executeUpdate();
    }
}
