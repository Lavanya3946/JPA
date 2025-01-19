package com.xworkz.restuarant.service;

import com.xworkz.restuarant.entity.HotelEntity;

public interface HotelService {
    void save(HotelEntity hotelEntity);

    Boolean getId(Integer id);

    boolean gethotelName(String name);

    void updateByName(String location, String name);

    int updateByLocation(Boolean taste, String location);

    String GetLocationById(Integer id);

    HotelEntity getLocationAndStateById(Integer id);

    Integer getIdByLocation(String location);

    String getLocationByName(String name);

    HotelEntity getLocationAndStateByName(String name);

    HotelEntity getLocationNameAndStateById(Integer id);
}
