package com.xworkz.restuarant.runner;

import com.xworkz.restuarant.service.HotelService;
import com.xworkz.restuarant.service.HotelServiceImpl;

public class HotelTaskRunner {
    static HotelService hotelService = new HotelServiceImpl();

    public static void main(String[] args) {
        System.out.println("The id for given location is: " + hotelService.getIdByLocation("Kogilu cross"));
        System.out.println("The location for given name is: " + hotelService.getLocationByName("Manya Hotel"));
        System.out.println(hotelService.getLocationAndStateByName("Bisi bisi Idly "));
        System.out.println(hotelService.getLocationNameAndStateById(3));

    }
}
