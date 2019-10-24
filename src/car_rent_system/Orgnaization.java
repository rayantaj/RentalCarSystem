/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car_rent_system;

/**
 * -ORGNAIZATION CLASS IS A SUBCLASS OF USER_DATA 
 * -CREATING ORGNAIZATION OBJECT MEANS THAT YOU MUST ALSO CALL THE COSTRUCTOR OF USER DATA
 * -WITHOUT THIS CLASS YOU CAN'T MAKE ANY RESERVATION ON THE CARS IN THE SYSTEM.
 * -THE ORGNAIZATION CAN RENT AT MOST 10 CARS AT THE TIME  
 */
public class Orgnaization extends Renter {

    String Org_Id, Super_visour;
    Reservation O_reservation;

    public Orgnaization(String Org_Id, String Super_visour, String Orgnaization_Name, String Email, String Password, String phone) {
        super(Orgnaization_Name, Email, Password, phone);
        this.Org_Id = Org_Id;
        this.Super_visour = Super_visour;
    }

    public String getOrg_Id() {
        return Org_Id;
    }

    public void setOrg_Id(String Org_Id) {
        this.Org_Id = Org_Id;
    }

    public String getSuper_visour() {
        return Super_visour;
    }

    public void setSuper_visour(String Super_visour) {
        this.Super_visour = Super_visour;
    }

    public Reservation getO_reservation() {
        return O_reservation;
    }

    public void setO_reservation(Reservation O_reservation) {
        this.O_reservation = O_reservation;
    }

    public void GetAll_Data() {
        System.out.println("");
        System.out.println("ORGNAIZATION ");
        System.out.println("");
        System.out.println("Name : " + this.getName());
        System.out.println("email :" + this.getEmail());
        System.out.println("password : " + this.getPassword());
        System.out.println("phone : " + this.phone);
        System.out.println("Orgnaization ID  : " + this.getOrg_Id());
        System.out.println("supervisour : " + this.getSuper_visour());

    }

}
