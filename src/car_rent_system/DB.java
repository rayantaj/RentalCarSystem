package car_rent_system;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    public boolean checkExists(Customer customer) {
        String q = "select * from customers where scn = ? OR email = ? OR phone = ?";
        try {
            PreparedStatement stat = con.prepareStatement(q, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stat.setString(1, customer.getSCN());
            stat.setString(2, customer.getEmail());
            stat.setString(3, customer.getPhone());
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

    public boolean addUser(Customer customer) {
        String q = "insert into customers values (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stat = con.prepareStatement(q, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stat.setInt(1, Integer.parseInt(customer.getSCN()));
            stat.setString(2, customer.getEmail());
            stat.setString(3, customer.getName());
            stat.setString(4, customer.getPassword());
            stat.setString(5, customer.getLicense_Number());
            stat.setDate(6, new java.sql.Date(customer.getEnd_License().getTime()));
            stat.setDate(7, new java.sql.Date(customer.getBOD().getTime()));
            stat.setString(8, customer.getPhone());
            int rs = stat.executeUpdate();
            System.out.println("USER ADDED...");
            return true;
        } catch (SQLException e) {
            System.out.println("EXCEPTION...");
            System.out.println(e.getMessage());
        }

        return false;
    }

    public boolean addCar(Car car) {

        try {
            FileInputStream fis = new FileInputStream(new File(car.getImage()));

            String pattern = "yyyy-MM-dd";
            SimpleDateFormat formatter = new SimpleDateFormat(pattern);
            String mysqlDateString = formatter.format(car.getModel_Year());

            String q = "insert into cars values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement pStat = con.prepareStatement(q, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pStat.setInt(1, Integer.parseInt(car.getRegesteration_Id()));
            pStat.setString(2, car.getCar_brand());
            pStat.setString(3, car.getCar_type());
            pStat.setString(4, mysqlDateString);
            pStat.setString(5, car.getGas_Type());
            pStat.setString(6, car.getCar_Name());
            pStat.setString(7, car.getColor());
            pStat.setBlob(8, fis);
            pStat.setInt(9, car.getNumber_Seats());
            pStat.setInt(10, car.getPrice_Per_Day());
            pStat.setString(11, car.getGearBox());
            pStat.setBoolean(12, car.isHandiCap_Support());
            pStat.setInt(13, car.getBranchID());
            pStat.setBoolean(14, true);

            int x = pStat.executeUpdate();
            if (x > 0) {
                return true;
            }
        } catch (FileNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return false;
    }

    public ResultSet search(ArrayList<String> att) {
        Statement Stat;
        String q = "select Registeration_ID, Car_Brand , Car_Name ,Gearbox_Type , n_Seats , price_per_day, street from cars , branch where cars.branchId = branch.branchID and available = 1";
        try {

            for (int i = 0; i < att.size(); i++) {
                q += " " + att.get(i);
            }

            Stat = con.createStatement();
            return Stat.executeQuery(q);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }

    public boolean makeReservation(int reserveId, int carId, int UserId, String dropOffLoactions, int totalPrice, String strPickupDate, String strDropOffDate) {
        String q = "insert into reservations values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement pStat = con.prepareStatement(q, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pStat.setInt(1, reserveId);
            pStat.setInt(2, UserId);
            pStat.setInt(3, carId);
            pStat.setString(4, strPickupDate);
            pStat.setString(5, strDropOffDate);
            pStat.setString(6, dropOffLoactions);
            pStat.setInt(7, totalPrice);

            int x = pStat.executeUpdate();
            if (x > 0 && UpdateAvailabilityOfcar(carId)) {
                return true;
            }

        } catch (SQLException e) {

            System.out.println(e.getMessage());
        }

        return false;
    }

    public boolean UpdateAvailabilityOfcar(int carId) {
        String q = "UPDATE cars SET available = 0 WHERE cars.Registeration_ID = ?";
        try {
            PreparedStatement pStat = con.prepareStatement(q, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pStat.setInt(1, carId);

            int x = pStat.executeUpdate();
            if (x > 0) {
                return true;
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;

    }

    public ResultSet getReservations(int userID) {

        // String q = "select resID , carID , car_name , pickupDate , dropoffDate , dropOffLocation , price from reservations, cars where reservations.customer_ID = ? and cars.registeration_ID = reservations.carID";
        String q = "select * from reservations where Customer_id = ?";
        try {
            PreparedStatement pStat = con.prepareStatement(q, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pStat.setInt(1, userID);
            ResultSet st = pStat.executeQuery();
            return st;
        } catch (SQLException s) {
            System.out.println(s.getMessage());
        }
        return null;
    }

    public boolean updateUser(Customer customer, String Field) {

        String q = "";
        try {
            if (Field.equalsIgnoreCase("Email")) {
                q = "update customers set email = " + customer.getEmail() + " where scn = " + customer.getSCN();
            } else if (Field.equalsIgnoreCase("Phone")) {
                q = "update customers set phone = " + customer.getPhone() + " where scn = " + customer.getSCN();
            } else {
                q = "update customers set password = " + customer.getPassword() + " where scn = " + customer.getSCN();
            }
            Statement stat = con.createStatement();
            int rs = stat.executeUpdate(q);
            if (rs > 0) {
                System.out.println("USER MODIFIED...");
                return true;
            }
        } catch (SQLException e) {
            System.out.println("EXCEPTION...");
            System.out.println(e.getMessage());
        }

        return false;
    }

    public ResultSet getAllReservations() {
 // String q = "select resID , carID , car_name , pickupDate , dropoffDate , dropOffLocation , price from reservations, cars where reservations.customer_ID = ? and cars.registeration_ID = reservations.carID";
        String q = "select * from reservations";
        try {
            Statement Stat = con.createStatement();
            ResultSet st = Stat.executeQuery(q);
            return st;
        } catch (SQLException s) {
            System.out.println(s.getMessage());
        }
        return null;
    }

}
