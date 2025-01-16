package com.xworkz.metrostation.service;

import com.xworkz.metrostation.entity.MetroEntity;

public interface MetroService {
    void save(MetroEntity metroEntity);

    int updateNameById(String stationName, Integer id);

    int updateStartJourneyBYName(String startJourney, String stationName);

    int updateDestinationByTicketPrice(String destination, Integer ticketPrice);


}
