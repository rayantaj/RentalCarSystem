/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class makeResTesting {
    
    public makeResTesting() {
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
    public void makeResTesting() {
    
    DB db = new DB();
    // int reserveId, int carId, int UserId, String dropOffLoactions, int totalPrice, String strPickupDate, String strDropOffDate
    boolean res = db.makeReservation(65725, 546378617, 123057683 , "Al-Jamiaa", 200, "2019-12-05", "2019-12-12");
    assertTrue(res);
    
    
    }
}
