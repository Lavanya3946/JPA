package com.xworkz.metrostation.service;

import com.xworkz.metrostation.entity.MetroEntity;
import com.xworkz.metrostation.repositary.MetroRepo;
import com.xworkz.metrostation.repositary.MetroRepoImpl;

public class MetroServiceImpl implements MetroService {
    MetroRepo metroRepo = new MetroRepoImpl();

    @Override
    public void save(MetroEntity metroEntity) {
        Boolean save = metroRepo.save(metroEntity);
        if (save) {
            System.out.println("data saved");
        } else {
            System.out.println("data not saved");
        }

    }

    @Override
    public int updateNameById(String stationName, Integer id) {
        int row = metroRepo.updateById(stationName, id);
        if (row > 0) {
            System.out.println("no of names updated by id: " + row);
        } else {
            System.out.println("names not updated ");
        }
        return row;
    }

    @Override
    public int updateStartJourneyBYName(String startJourney, String stationName) {
        int row = metroRepo.updateByName(startJourney, stationName);
        if (row > 0) {
            System.out.println("no of updated startJourney updated: " + row);

        } else {
            System.out.println("not updated");
        }
        return row;
    }

    @Override
    public int updateDestinationByTicketPrice(String destination, Integer ticketPrice) {
        int row = metroRepo.updateByDestination(destination, ticketPrice);
        if (row > 0) {
            System.out.println("no of updated destination updated: " + row);

        } else {
            System.out.println("not updated");
        }
        return row;
    }
}
