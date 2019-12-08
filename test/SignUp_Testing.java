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
public class SignUp_Testing {
    
    public SignUp_Testing() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.out.println("BEFORE...   ");
    }
    
    @After
    public void tearDown() {
        System.out.println("AFTER...   ");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    
    @Test
    public void testSignUp() {
        
        DB db = new DB();
        // String SCN, String License_Number, Date BOD, Date End_License, String Name, String Email, String Password, String phone
        Customer temp = new Customer("123057100", "123098100", new java.util.Date("01/01/1998"), new java.util.Date("01/01/2020"), "Khalid Shoman", "khalidsh@gmail.com", "1234567890", "0541176619");
        boolean signUp = db.addUser(temp);
        assertTrue(signUp);       
    
    }
}
