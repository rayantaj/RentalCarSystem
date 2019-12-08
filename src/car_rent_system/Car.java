/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car_rent_system;

import java.awt.Image;
import java.util.Date;

/**
 *
 * @author rayan taj
 */
public class Car {

    String Car_brand, Regesteration_Id, Car_type, Car_Name, Gas_Type, Color, GearBox;

    Date model_Year;
    int Number_Seats, Price_Per_Day;
    String image;
    boolean HandiCap_Support;
    int branchID;

    public Car() {
    }

    public Car(String Car_brand, String Regesteration_Id, String Car_type, String Car_Name, String Gas_Type, String Color, String GearBox, Date model_Year, int Number_Seats, int Price_Per_Day, String image, boolean HandiCap_Support, int branchID) {
        this.Car_brand = Car_brand;
        this.Regesteration_Id = Regesteration_Id;

        this.Car_type = Car_type;
        this.Car_Name = Car_Name;
        this.Gas_Type = Gas_Type;
        this.Color = Color;
        this.GearBox = GearBox;
        this.model_Year = model_Year;
        this.Number_Seats = Number_Seats;
        this.Price_Per_Day = Price_Per_Day;
        this.image = image;
        this.branchID = branchID;
        this.HandiCap_Support = HandiCap_Support;
    }

    public Car(String Car_brand, String Car_type, String Car_Name, String Gas_Type, String Color, String GearBox, Date model_Year, int Number_Seats, int Price_Per_Day, String image, boolean HandiCap_Support) {
        this.Car_brand = Car_brand;
        this.Car_type = Car_type;
        this.Car_Name = Car_Name;
        this.Gas_Type = Gas_Type;
        this.Color = Color;
        this.GearBox = GearBox;
        this.model_Year = model_Year;
        this.Number_Seats = Number_Seats;
        this.Price_Per_Day = Price_Per_Day;
        this.image = image;

        this.HandiCap_Support = HandiCap_Support;
    }

    public String getCar_brand() {
        return Car_brand;
    }

    public int getBranchID() {
        return branchID;
    }
    
    

    public void setCar_brand(String Car_brand) {
        this.Car_brand = Car_brand;
    }

    public String getRegesteration_Id() {
        return Regesteration_Id;
    }

    public void setRegesteration_Id(String Regesteration_Id) {
        this.Regesteration_Id = Regesteration_Id;
    }

    public String getCar_type() {
        return Car_type;
    }

    public void setCar_type(String Car_type) {
        this.Car_type = Car_type;
    }

    public String getCar_Name() {
        return Car_Name;
    }

    public void setCar_Name(String Car_Name) {
        this.Car_Name = Car_Name;
    }

    public String getGas_Type() {
        return Gas_Type;
    }

    public void setGas_Type(String Gas_Type) {
        this.Gas_Type = Gas_Type;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getGearBox() {
        return GearBox;
    }

    public void setGearBox(String GearBox) {
        this.GearBox = GearBox;
    }

    public Date getModel_Year() {
        return model_Year;
    }

    public void setModel_Year(Date model_Year) {
        this.model_Year = model_Year;
    }

    public int getNumber_Seats() {
        return Number_Seats;
    }

    public void setNumber_Seats(int Number_Seats) {
        this.Number_Seats = Number_Seats;
    }

    public int getPrice_Per_Day() {
        return Price_Per_Day;
    }

    public void setPrice_Per_Day(int Price_Per_Day) {
        this.Price_Per_Day = Price_Per_Day;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isHandiCap_Support() {
        return HandiCap_Support;
    }

    public void setHandiCap_Support(boolean HandiCap_Support) {
        this.HandiCap_Support = HandiCap_Support;
    }

    public void GetALL_Data() {
        System.out.println("");
        System.out.println("CAR ");
        System.out.println("");
        System.out.println("brand : " + this.Car_brand);
        System.out.println("regesteration id : " + this.Regesteration_Id);
        System.out.println("car type : " + this.Car_type);
        System.out.println("car name : " + this.Car_Name);
        System.out.println("gas type : " + this.Gas_Type);
        System.out.println("color : " + this.Color);
        System.out.println("gearbox : " + this.GearBox);
        System.out.println("model year: " + this.model_Year);
        System.out.println("number of seats : " + this.Number_Seats);
        System.out.println("price per day : " + this.Price_Per_Day);
        System.out.println("image : " + this.image);
        System.out.println("handicap support : " + this.HandiCap_Support);
    }

}
