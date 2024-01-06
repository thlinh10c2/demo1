/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dal.dbconnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;

/**
 *
 * @author admin
 */
//CREATE TABLE admins (
//    Username VARCHAR(20) PRIMARY KEY,
//    [Password] VARCHAR(32) NOT NULL
//);
//
//INSERT INTO admins (Username, [Password])
//VALUES ('admin', CONVERT(VARCHAR(32), HASHBYTES('MD5', 'Admin@2023'), 2)),
//       ('user', CONVERT(VARCHAR(32), HASHBYTES('MD5', 'user@2023'), 2))

public class LoginDao {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public Account checkLogin(String user, String pass) {
        try {
            String query = "SELECT * FROM admins where username=? and password=?";
            conn = new dbconnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                Account a = new Account(rs.getString(1), rs.getString(2));
                return a;
            }
        } catch (Exception e) {
        }
        return null;
    }

    public boolean Login(Account acc) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            String query = "select * from admins where username=? and password=?";
            conn = new dbconnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, acc.getUsername());

            // Mã hóa mật khẩu bằng MD5 trước khi so sánh
            String hashedPassword = getMD5Hash(acc.getPassword());
            ps.setString(2, hashedPassword);

            rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(LoginDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs.next();
    }
    
     public int AddNew(Account acc) {
        String sql = "insert into admins values(?,?)";
        int ketqua = 0;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, acc.getUsername());
            String hashedNewPassword = getMD5Hash(acc.getPassword());
            ps.setString(2, hashedNewPassword);
            ketqua = ps.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.getMessage();
        }
        return ketqua;
    }

    public String getMD5Hash(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            StringBuilder hexString = new StringBuilder();

            for (byte b : messageDigest) {
                hexString.append(String.format("%02x", b));
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

}
