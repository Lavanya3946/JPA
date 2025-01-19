package com.xworkz.restuarant.runner;

import com.xworkz.restuarant.entity.HotelEntity;
import com.xworkz.restuarant.service.HotelService;
import com.xworkz.restuarant.service.HotelServiceImpl;

public class HotelGetRunner {
    private static HotelService hotelService = new HotelServiceImpl();

    public static void main(String[] args) {
        String location = hotelService.GetLocationById(3);
        if (location != null) {
            System.out.println(location);
        } else {
            System.out.println("Location not found for the given id");
        }
        HotelEntity hotelEntity = hotelService.getLocationAndStateById(3);
        if (hotelEntity != null) {
            System.out.println(hotelEntity);
        } else {
            System.out.println("location and state does not found");
        }
    }
}
