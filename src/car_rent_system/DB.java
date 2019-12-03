package car_rent_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DB {

 
    private Connection con;

    public DB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crents1?useSSL=false", "root", "");
        } catch (ClassNotFoundException | SQLException ex) {
            ;
        }
    }

    public void createTable(String tName, String[] att) {
        try {
            String q = "Create table " + tName + " (";
            for (int i = 0; i < att.length; i++) {
                if (i == att.length - 1) {
                    q += att[i];
                } else {
                    q += att[i] + ",";
                }
            }
            q += ")";
            System.out.println(q);
            PreparedStatement s = con.prepareStatement(q, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            s.execute();
        } catch (SQLException ex) {
            System.err.println("SQL EXCEPTION...");
            System.err.println(ex.getMessage());
        }
    }

    
       public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public boolean checkExists(Customer customer){
        String q = "select * from customers where scn = ? OR email = ? OR phone = ?";
        try {
            PreparedStatement stat = con.prepareStatement(q, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stat.setString(1,customer.getSCN());
            stat.setString(2,customer.getEmail());
            stat.setString(3,customer.getPhone());
            ResultSet rs = stat.executeQuery();
            rs.beforeFirst();
            if (rs.first()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return true;
    }
    
    public boolean addUser(Customer customer){
        String q = "insert into customers values (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stat = con.prepareStatement(q, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stat.setInt(1,Integer.parseInt(customer.getSCN()));
            stat.setString(2,customer.getEmail());
            stat.setString(3,customer.getName());
            stat.setString(4,customer.getPassword());
            stat.setString(5,customer.getLicense_Number());
            stat.setDate(6,new java.sql.Date(customer.getEnd_License().getTime()));
            stat.setDate(7,new java.sql.Date(customer.getBOD().getTime()));
            stat.setString(8,customer.getPhone());
            int rs = stat.executeUpdate();
            System.out.println("USER ADDED...");
            return true;
        }
        catch (SQLException e){ 
            System.out.println("EXCEPTION...");
            System.out.println(e.getMessage());
        }
        
        return false;
    }
    
    
}
    
