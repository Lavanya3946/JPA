package com.xworkz.restuarant.runner;

import com.xworkz.restuarant.entity.HotelEntity;
import com.xworkz.restuarant.service.HotelService;
import com.xworkz.restuarant.service.HotelServiceImpl;

public class HotelRunner {
    public static void main(String[] args) {
        HotelService hotelService = new HotelServiceImpl();
        HotelEntity hotelEntity = new HotelEntity(null, "Sriramanjaya", "tiptur", true, "karnataka");

        hotelService.save(hotelEntity);
        hotelService.getId(6);
        System.out.println(hotelService.gethotelName("sriramanjaya"));
        hotelService.updateByName("Kogilu cross", "Udupi");
        hotelService.updateByLocation(true, "Banglore");

    }
}
