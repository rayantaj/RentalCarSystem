/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car_rent_system;

import java.util.Date;
import java.util.Random;

/**
 *
 * 
 */
public class Reservation {

    int reservation_ID, Number_Days;
    String Rental_ID;
    Date Date_Start_rent, Date_Finish_Rent;
    double total_price;

    public Reservation() {
    }

    public Reservation(String Rental_ID, Date Date_Start_rent, Date Date_Finish_Rent) {
        this.Number_Days = Number_Days;
        this.Rental_ID = Rental_ID;
        this.Date_Start_rent = Date_Start_rent;
        this.Date_Finish_Rent = Date_Finish_Rent;
        Generate_Reservation_ID();
    }

    public int getReservation_ID() {
        return reservation_ID;
    }

    public void setReservation_ID(int reservation_ID) {
        this.reservation_ID = reservation_ID;
    }

    public int getNumber_Days() {
        return Number_Days;
    }

    public void setNumber_Days(int Number_Days) {
        this.Number_Days = Number_Days;
    }

    public String getRental_ID() {
        return Rental_ID;
    }

    public void setRental_ID(String Rental_ID) {
        this.Rental_ID = Rental_ID;
    }

  

    public Date getDate_Start_rent() {
        return Date_Start_rent;
    }

    public void setDate_Start_rent(Date Date_Start_rent) {
        this.Date_Start_rent = Date_Start_rent;
    }

    public Date getDate_Finish_Rent() {
        return Date_Finish_Rent;
    }

    public void setDate_Finish_Rent(Date Date_Finish_Rent) {
        this.Date_Finish_Rent = Date_Finish_Rent;
    }

    public double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }


    public void Generate_Reservation_ID() {
        // initialize a Random object somewhere; you should only need one
        Random random = new Random();

        // generate a random integer from 0 to 899, then add 100
        this.reservation_ID = random.nextInt(900) + 100;

    }

    public void GetAll_Data() {

        System.out.println("");
        System.out.println("RESERVATION");
        System.out.println("the rental id : " + this.getRental_ID());
        System.out.println("reservation Id : " + this.getReservation_ID());
        System.out.println("start date : " + this.getDate_Start_rent());
        System.out.println("finish date : " + this.getDate_Finish_Rent());
        System.out.println("number of days : " + this.getNumber_Days());
        System.out.println("total price : " + this.getTotal_price());

    }

}
