package com.xworkz.restuarant.service;

import com.xworkz.restuarant.entity.HotelEntity;
import com.xworkz.restuarant.repositary.HotelRepo;
import com.xworkz.restuarant.repositary.HotelRepoImpl;

public class HotelServiceImpl implements HotelService {

    static HotelRepo hotelRepo = new HotelRepoImpl();

    @Override
    public void save(HotelEntity hotelEntity) {
        Boolean save = hotelRepo.save(hotelEntity);
        if (save) {
            System.out.println("data saved");
        } else {
            System.out.println("data is not saved");
        }
    }

    @Override
    public Boolean getId(Integer id) {
        HotelEntity hotelEntity = hotelRepo.getDataById(id);
        System.out.println(hotelEntity);
        return null;
    }

    @Override
    public boolean gethotelName(String name) {
        hotelRepo.getDataByName(name);
        return false;
    }

    @Override
    public void updateByName(String location, String name) {
        HotelEntity hotelEntity = hotelRepo.updateDataByName(location, name);
        if (hotelEntity != null) {
            System.out.println("updated succesfully.." + hotelEntity);
        } else {
            System.out.println("can not update the location ");
        }
    }

    @Override
    public int updateByLocation(Boolean taste, String location) {
        int row = hotelRepo.updateByLocation(taste, location);
        if (row > 0) {
            System.out.println("updated rows: " + row);
        } else {
            System.out.println("not updated");
        }
        return row;
    }

    @Override
    public String GetLocationById(Integer id) {
        return hotelRepo.getLocationById(id);

    }

    @Override
    public HotelEntity getLocationAndStateById(Integer id) {
        return hotelRepo.getLocationAndStateById(id);

    }

    @Override
    public Integer getIdByLocation(String location) {
        return hotelRepo.getIdByLocation(location);
    }

    @Override
    public String getLocationByName(String name) {
        return hotelRepo.getLocationByName(name);
    }

    @Override
    public HotelEntity getLocationAndStateByName(String name) {
        return hotelRepo.getLocationAndStateByName(name);
    }

    @Override
    public HotelEntity getLocationNameAndStateById(Integer id) {
        return hotelRepo.getLocationNameAndStateById(id);
    }
}
