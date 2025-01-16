package com.xworkz.metrostation.repositary;

import com.xworkz.metrostation.entity.MetroEntity;

public interface MetroRepo {
    Boolean save(MetroEntity metroEntity);

    Integer updateById(String stationName, Integer id);

    Integer updateByName(String startJourney, String stationName);

    Integer updateByDestination(String destination, Integer ticketPrice);

}
