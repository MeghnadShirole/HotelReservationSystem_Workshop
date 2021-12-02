package com.company;

public class HotelReservationSystem {

    public static void main(String[] args) {

        HotelReservation hotelReservation = new HotelReservation();

        hotelReservation.addHotel("LakeWood", 110,90);
        hotelReservation.addHotel("BridgeWood", 150,60);
        hotelReservation.addHotel("RidgeWood", 220,150);

        hotelReservation.getHotelDetails();
        hotelReservation.findCheapestHotel();
    }
}
