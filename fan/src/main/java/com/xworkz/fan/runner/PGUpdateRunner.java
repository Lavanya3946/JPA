package com.xworkz.fan.runner;

import com.xworkz.fan.service.PgService;
import com.xworkz.fan.service.PgServiceImpl;

public class PGUpdateRunner {
    private static PgService pgService = new PgServiceImpl();

    public static void main(String[] args) {
        pgService.updateRentByName(6500, "womens");
        pgService.updateSharingByRent(3, 6000);
        pgService.updateNameById("Kalpataru Pg", 6);
    }
}
