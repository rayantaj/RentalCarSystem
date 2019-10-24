/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car_rent_system;

/**
 *
 * @author rayan taj
 */
public  abstract class Renter extends User{

    public Renter(String Name, String Email, String Password, String phone) {
        super(Name, Email, Password, phone);
    }
    
}
