package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HotelReservationSystem {

    public static void main(String[] args) throws ParseException {

        HotelReservation hotelReservation = new HotelReservation();

        hotelReservation.addHotel("LakeWood", 110,90,3);
        hotelReservation.addHotel("BridgeWood", 150,60,4);
        hotelReservation.addHotel("RidgeWood", 220,150,5);

        String sDate1="10-09-2020";
        String sDate2="11-09-2020";
        Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
        Date date2=new SimpleDateFormat("dd-MM-yyyy").parse(sDate2);
        System.out.println(sDate1+"\t"+date1);
        System.out.println(sDate2+"\t"+date2);

        hotelReservation.getHotelDetails();
        hotelReservation.findCheapestHotel();
        hotelReservation.findCheapestHotel_Weekday_Weekend();
        hotelReservation.findCheapestBestRatedHotel();
    }
}
