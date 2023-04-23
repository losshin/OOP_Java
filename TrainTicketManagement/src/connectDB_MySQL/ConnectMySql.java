package connectDB_MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public abstract class ConnectMySql {
    public static Connection mysqlconnection;
    public static Statement stm;
    
    public static void configDB() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost:3306/dbnitihsepur"; //url database
            String user = "root"; //user database
            String pass = ""; //password database
//            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Class.forName("com.mysql.cj.jdbc.Driver");
            mysqlconnection = DriverManager.getConnection(url, user, pass);
            stm = mysqlconnection.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"koneksi gagal"); //perintah menampilkan error pada koneksi
        }
    }
    
//    public static Connection configDB()throws SQLException{
//        try {
//            String url="jdbc:mysql://localhost:3306/dbtiketkereta"; //url database
//            String user="root"; //user database
//            String pass=""; //password database
//            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//            mysqlconnection=DriverManager.getConnection(url, user, pass);            
//        } catch (Exception e) {
//            System.err.println("koneksi gagal "+e.getMessage()); //perintah menampilkan error pada koneksi
//        }
//        return mysqlconnection;
//    }
}


/* Insert Database
    try {
        int i = 1;
        String sql = "INSERT INTO client VALUES ('"+(i++)+"','"+userTextField.getText()+"','"+passTextField.getText()+"')";
        java.sql.Connection conn=(Connection)ConnectMySql.configDB();
        java.sql.PreparedStatement pst=conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    } 
*/

/* Update Database
    try {
        int i = 1;
        String sql = "UPDATE INTO client VALUES ('"+(i++)+"','"+userTextField.getText()+"','"+passTextField.getText()+"')";
        java.sql.Connection conn=(Connection)ConnectMySql.configDB();
        java.sql.PreparedStatement pst=conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    } 
*/

/* Delete Database
    try {
        String sql = "DELETE" + "'search.TextField.getText()'" + "FROM client";
        java.sql.Connection conn=(Connection)ConnectMySql.configDB();
        java.sql.PreparedStatement pst=conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    } 
*/

/* Search Database
    try {
        int i = 1;
        String sql = "SHOW INTO client LIKE  ('"+(i++)+"','"+userTextField.getText()+"','"+passTextField.getText()+"')";
        java.sql.Connection conn=(Connection)ConnectMySql.configDB();
        java.sql.PreparedStatement pst=conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    } 
*/