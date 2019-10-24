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
public class Admin extends User{
    
    String AdminID;

    public Admin(String Name, String Email, String Password, String phone) {
        super(Name, Email, Password, phone);
        AdminID=Generate_AdminID();
    }

    public String getAdminID() {
        return AdminID;
    }

    public void setAdminID(String AdminID) {
        this.AdminID = AdminID;
    }
    
    public void getAllData(){
        System.out.println("ADMIN ");
        System.out.println("");
           System.out.println("Name : " + this.getName());
           System.out.println("Admin ID :"+ this.getAdminID());
         System.out.println("email :" + this.getEmail());
        System.out.println("password : " + this.getPassword());
         System.out.println("phone : " + this.phone);
        System.out.println("");
    }
    
    // GENERATE A NUMBER THAT WILL BE CONSIDERED AS ID FOR THE ADMIN .
    //THE NUMBER MUST BE CHANGED TO STRING INSTAD OF INT .
    public String Generate_AdminID(){
        
        
        
        return "111";
        
    }
}
