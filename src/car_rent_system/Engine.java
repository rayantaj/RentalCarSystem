package car_rent_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Engine extends Thread {

    static DB db = new DB();
    UserPage p;
    Connection con = db.getCon();

    @Override
    public void run() {

        p = new UserPage(con,db);
        p.setVisible(true);
      
        

    }

 

    private void InitiateTables() {

        //String attCustomer = "scn int primary key, email char(30) not null, name char (30) not null, password char(20) not null, lNumber char (10) not null, eLicDate char(8)not null, dob char (8) not null";
        //db.createTable("Customers", attCustomer.split(","));
        // String attAdmin = "adminID int primary key, email char(30) not null , name char(30) not null, password char(20) not null";
        // db.createTable("Admins", attAdmin.split(","));
        // String attBranch = "branchID int primary key, city char(40) not null, street char(20) not null";
        // db.createTable("Branch", attBranch.split(","));
        //String attCars = "Registeration_ID int primary key,Car_Brand char (10), Car_Type char(10) , Model_Year Date, Gas_Type char(2), Car_Name char(20) ,Color char(10) , image mediumblob , n_Seats int, price_per_day int , cruse boolean, Gearbox_Type char(10) , Handicap_support boolean, branchID int ,FOREIGN KEY (branchID) REFERENCES branch(branchID)";
        //db.createTable("Cars", attCars.split(","));
        //String attReservations = "resID int primary key not null, ID int foreign key refereneces customers(scn), carID int foreign key references Cars(Registeration_ID), sDate Date, eDate Date, price double, daysNum int";
        // db.createTable("Customer_Reservations", attReservations.split(","));
    }

}
