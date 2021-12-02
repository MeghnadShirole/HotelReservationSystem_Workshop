package com.company;

import org.junit.Test;
import org.junit.Assert;
/*
* test case to check whether hotel is added to list or not
* */
public class HotelReservationSystemTest {
    @Test
    public void whenHotelAdded_ShouldPassTest_IfAddedToList() {
        HotelReservation hotelReservation = new HotelReservation();

        boolean hotelLakewoodAdded = hotelReservation.checkHotelAdd(new HotelInfo("LakeWoods", 110,90,3));
        Assert.assertTrue(hotelLakewoodAdded);
        boolean hotelBridgewoodAdded = hotelReservation.checkHotelAdd(new HotelInfo("Bridgewood", 160,60,4));
        Assert.assertTrue(hotelBridgewoodAdded);
        boolean hotelRidgewoodAdded = hotelReservation.checkHotelAdd(new HotelInfo("Ridgewood", 220,150,5));
        Assert.assertTrue(hotelRidgewoodAdded);
    }

    @Test
    public void toFindTheCheapestHotel() {
        HotelReservation cheapHotel = new HotelReservation();
        cheapHotel.findCheapestHotel();
    }

    @Test
    public void toFindTheCheapestHotel_OnWeekdayAndWeekend() {
        HotelReservation cheapHotel = new HotelReservation();
        cheapHotel.findCheapestHotel_Weekday_Weekend();
    }

    @Test
    public void toFindTheCheapestBestRatedHotel_OnWeekdayAndWeekend() {
        HotelReservation cheapHotel = new HotelReservation();
        cheapHotel.findCheapestBestRatedHotel();
    }

    @Test
    public void toFindTheBestRatedHotel_OnWeekdayAndWeekend() {
        HotelReservation cheapHotel = new HotelReservation();
        cheapHotel.findBestRatedHotel();
    }
}