package com.xworkz.restuarant.repositary;

import com.xworkz.restuarant.entity.HotelEntity;

public interface HotelRepo {
    Boolean save(HotelEntity hotelEntity);

    HotelEntity getDataById(Integer id);

    void getDataByName(String hotelName);

    HotelEntity updateDataByName(String location, String name);

    int updateByLocation(Boolean taste, String location);

    String getLocationById(Integer id);

    HotelEntity getLocationAndStateById(Integer id);

    Integer getIdByLocation(String location);

    String getLocationByName(String name);

    HotelEntity getLocationAndStateByName(String name);

    HotelEntity getLocationNameAndStateById(Integer id);

}
