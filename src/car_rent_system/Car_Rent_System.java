package car_rent_system;

import java.util.Date;

public class Car_Rent_System {

    public static void main(String[] args) {
        
        //===ADMIN==\\
        //String Name, String Email, String Password, String phone
        Admin admin = new Admin("ZA LeGend", "HoWComE?@Freak.com", "totoa", "040430232");
        
        admin.getAllData();
        

        //===CUSTOMER===\\
        // String SCN, String License_Number, Date BOD, Date End_License, boolean handicap, String Name, String Email, String Password, String phone
        Customer rayan = new Customer("1108340000", "1111111111", new Date(), new Date(), true, "rayan taj", "rayantaj@gmail.com", "00000", "050530303030");

        rayan.GetALL_Data();

        //===ORGNAIZATION==\\
        //String Org_Id, String Super_visour, String Orgnaization_Name, String Email, String Password, String phone
        Orgnaization company = new Orgnaization("123", "faisal", "abdographics", "ahla_wa_sahla@", "s3hf84", "93649364");

        company.GetAll_Data();

        //===CAR===\\
        
        // C1 WILL BE USED WHEN THE ADMIN ADD ONE CAR AT THE TIME 
        
       //String Car_brand, String Regesteration_Id, String license_Number, String Car_type, String Car_Name, String Gas_Type, String Color, String GearBox, Date model_Year, int Number_Seats, int Price_Per_Day, Image image, boolean Cruse, boolean HandiCap_Support
        Car c1=new Car("KIA", "101010", "345323", "SUV", "BLAH BLAH ","Hyprid", "tiffany", "automatic", null, 5, 50, null, true, true)    ;

        c1.GetALL_Data();
        
        
        // C2 WILL BE USED WHEN THE ADMIN ADD MULTIPLE CARS AT THE TIME .....WHERE THE REGESERATION AND LICENSE NUMBER WILL BE ADDED BY THE SET METHODS .
        
        Car c2 = new Car("KIA","SUV", "BLAH BLAH ","Hyprid", "tiffany", "automatic", null, 5, 50, null, true, true);
        c2.setRegesteration_Id("0987654");
        c2.setLicense_Number("865234087364348670986230986352350986385907");
        c2.GetALL_Data();

        //RESERVATION==\\
        // int Number_Days, String Rental_ID, String Car_ID, Date Date_Start_rent, Date Date_Finish_Rent, Car car 
        Reservation res1 = new Reservation(3, rayan.getSCN(), null, null, c1);

        res1.GetAll_Data();

    }

}
