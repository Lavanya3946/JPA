package com.xworkz.fan.runner;

import com.xworkz.fan.entity.PgEntity;
import com.xworkz.fan.service.PgService;
import com.xworkz.fan.service.PgServiceImpl;

public class PGFetchRunner {
    public static void main(String[] args) {
        PgService pgService=new PgServiceImpl();
        PgEntity pgEntity=new PgEntity(null,"gurukula pg",4000,3);
        pgService.save(pgEntity);
        pgService.getById(3);
        pgService.getByName("Golden");
        pgService.getByRent(6500);
        pgService.getBySharing(3);
    }
}
