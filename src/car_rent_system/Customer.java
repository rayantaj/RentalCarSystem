
package car_rent_system;

import java.util.Date;

/**
 * -CUSTOMER CLASS IS A SUBCLASS OF USER_DATA 
 * -CREATING CUSTOMER OBJECT MEANS THAT YOU MUST ALSO CALL THE COSTRUCTOR OF USER DATA
 * -WITHOUT THIS CLASS YOU CAN'T MAKE ANY RESERVATION ON THE CARS IN THE SYSTEM.
 * -THE CUSTOMER CAN RENT ONE AND ONLY ONE CAR AT THE TIME 
 * 
 */
public class Customer extends Renter {

    String SCN, License_Number;
    Date DOB, End_License;
    boolean handicap;
    Reservation C_Reservation;

    public Customer(String SCN, String License_Number, Date BOD, Date End_License, boolean handicap, String Name, String Email, String Password, String phone) {
        super(Name, Email, Password, phone);
        this.SCN = SCN;
        this.License_Number = License_Number;
        this.DOB = BOD;
        this.End_License = End_License;
        this.handicap = handicap;

    }

    public String getSCN() {
        return SCN;
    }

    public void setSCN(String SCN) {
        this.SCN = SCN;
    }

    public String getLicense_Number() {
        return License_Number;
    }

    public void setLicense_Number(String License_Number) {
        this.License_Number = License_Number;
    }

    public Date getBOD() {
        return DOB;
    }

    public void setBOD(Date BOD) {
        this.DOB = BOD;
    }

    public Date getEnd_License() {
        return End_License;
    }

    public void setEnd_License(Date End_License) {
        this.End_License = End_License;
    }

    public boolean isHandicap() {
        return handicap;
    }

    public void setHandicap(boolean handicap) {
        this.handicap = handicap;
    }

    public Reservation getC_Reservation() {
        return C_Reservation;
    }

    public void setC_Reservation(Reservation C_Reservation) {
        this.C_Reservation = C_Reservation;
    }

    public void GetALL_Data() {
        System.out.println("");
        System.out.println("CUSTOMER ");
        System.out.println(" ");
        System.out.println("Name : " + this.getName());
        System.out.println("SCN : " + this.getSCN());
        System.out.println("DOB : " + this.getBOD());
        System.out.println("email :" + this.getEmail());
        System.out.println("password : " + this.getPassword());
        System.out.println("LICENSE NUMBER : " + this.getLicense_Number());
        System.out.println("End of license : " + this.getEnd_License());
        System.out.println("is handicap ? : " + this.isHandicap());
        System.out.println("phone : " + this.phone);
    }

}
