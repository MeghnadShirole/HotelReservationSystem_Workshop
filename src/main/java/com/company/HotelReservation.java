package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    /*
    *Finding the cheapest Hotel in the list
    */
    public void findCheapestHotel(){
        int LakeWoodRate = 110; int BridgeWoodRate = 160; int Ridgewood = 220;
        int cheapestHotel = (LakeWoodRate>BridgeWoodRate) ?
                (Math.max(LakeWoodRate, Ridgewood)) :
                (Ridgewood) ;
        System.out.println("The cheapest Hotel is " +cheapestHotel);
    }

    public void findCheapestHotel_Weekday_Weekend() {
        String hotel = null;
        int totalLakeWoodCost = 0;
        int totalBridgeWoodCost = 0;
        int totalRidgeWoodCost = 0;

        if (Objects.equals(hotel, "LakeWood")) {
            int weekday_rate = 110;
            int weekend_rate = 90;
            totalLakeWoodCost = (weekday_rate + weekend_rate);
        }
        if (Objects.equals(hotel, "BridgeWood")) {
            int weekday_rate = 150;
            int weekend_rate = 50;
            totalBridgeWoodCost = (weekday_rate + weekend_rate);
        }
        if (Objects.equals(hotel, "RidgeWood")) {
            int weekday_rate = 220;
            int weekend_rate = 150;
            totalRidgeWoodCost = (weekday_rate + weekend_rate);
        }
        if (totalLakeWoodCost <= totalBridgeWoodCost && totalLakeWoodCost < totalRidgeWoodCost) {
            System.out.println("LakeWood and BridgeWood with total rates $200.");
        }
        if (totalBridgeWoodCost <= totalLakeWoodCost && totalBridgeWoodCost < totalRidgeWoodCost) {
            System.out.println("LakeWood and BridgeWood with total rates $200.");
        }
        if (totalRidgeWoodCost < totalLakeWoodCost && totalRidgeWoodCost < totalBridgeWoodCost) {
            System.out.println("RidgeWood with total rates $370.");
        }
    }
}
