package com.company;
import java.util.ArrayList;
import java.util.List;

/*
* In this class we store Add the Hotel details in the List
* */
public class HotelReservation {
    List<HotelInfo> hotelDetails=new ArrayList<>();

    //looking hotels and list of hotels
    public void  addHotel(String hotelName, int weekdayRate, int weekendRate) {
        HotelInfo hotel= new HotelInfo(hotelName,weekdayRate,weekendRate );
        hotelDetails.add(hotel);
    }
    public void getHotelDetails(){
        System.out.println(hotelDetails);
    }
/*
* Here we check whether the hotel is been added or not
* */
    public boolean checkHotelAdd(HotelInfo hotel) {
      return hotelDetails.add(hotel);
    }
}
