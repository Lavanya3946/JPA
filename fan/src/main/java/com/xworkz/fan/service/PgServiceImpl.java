package com.xworkz.fan.service;

import com.xworkz.fan.entity.PgEntity;
import com.xworkz.fan.repositary.PgRepo;
import com.xworkz.fan.repositary.PgRepoImpl;

public class PgServiceImpl implements PgService {
    static PgRepo pgRepo = new PgRepoImpl();

    @Override
    public void save(PgEntity pgEntity) {
        Boolean save = pgRepo.save(pgEntity);
        if (save) {
            System.out.println("data saved");
        } else {
            System.out.println("data is not saved");
        }
    }

    @Override
    public Boolean getById(Integer id) {
        PgEntity pgEntity=pgRepo.getDataById(id);
        System.out.println(pgEntity);
        return null;
    }

    @Override
    public void getByName(String name) {
        pgRepo.getDataByPgName(name);
    }

    @Override
    public void getByRent(Integer rent) {
        pgRepo.getDataByRent(rent);
    }

    @Override
    public void getBySharing(Integer sharing) {
        pgRepo.getDataBySharing(sharing);
    }
}
