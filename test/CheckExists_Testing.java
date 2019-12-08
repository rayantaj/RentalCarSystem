/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import car_rent_system.Customer;
import car_rent_system.DB;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class CheckExists_Testing {
    
    public CheckExists_Testing() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.out.println("BEFORE...");
    }
    
    @After
    public void tearDown() {
        System.out.println("AFTER...");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    
    @Test
    public void checkExistsTest() {
        DB db = new DB();
        // String SCN, String License_Number, Date BOD, Date End_License, String Name, String Email, String Password, String phone
        boolean exists = db.checkExists(new Customer("123057295", "123098759", new java.util.Date("01/01/1998"), new java.util.Date("01/01/2020"), "Marwan Al-Ghamdi", "marwan@gmail.com", "123456", "0590087557"));
        assertFalse(exists);
    
    }
}
