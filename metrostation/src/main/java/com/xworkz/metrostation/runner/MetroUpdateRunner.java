package com.xworkz.metrostation.runner;

import com.xworkz.metrostation.service.MetroService;
import com.xworkz.metrostation.service.MetroServiceImpl;

public class MetroUpdateRunner {
    private static MetroService metroService = new MetroServiceImpl();

    public static void main(String[] args) {
        metroService.updateNameById("jaynagar", 2);
        metroService.updateStartJourneyBYName("mejestic", "Silk Board Metro");
        metroService.updateDestinationByTicketPrice("yeswanthpur", 30);

    }
}
