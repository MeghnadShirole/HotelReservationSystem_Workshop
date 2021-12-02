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

        boolean hotelLakewoodAdded = hotelReservation.checkHotelAdd(new HotelInfo("LakeWoods", 110,90));
        Assert.assertTrue(hotelLakewoodAdded);
        boolean hotelBridgewoodAdded = hotelReservation.checkHotelAdd(new HotelInfo("Bridgewood", 160,60));
        Assert.assertTrue(hotelBridgewoodAdded);
        boolean hotelRidgewoodAdded = hotelReservation.checkHotelAdd(new HotelInfo("Ridgewood", 220,150));
        Assert.assertTrue(hotelRidgewoodAdded);
    }

    @Test
    public void toFindTheCheapestHotel() {
        HotelReservation cheapHotel = new HotelReservation();
        cheapHotel.findCheapestHotel();
    }
}