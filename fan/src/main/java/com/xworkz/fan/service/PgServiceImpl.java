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
        PgEntity pgEntity = pgRepo.getDataById(id);
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

    @Override
    public void updateRentByName(Integer rent, String name) {
        PgEntity pg = pgRepo.updateDataByName(rent, name);
        if (pg != null) {
            System.out.println("rent updated succesfully.." + pg);
        } else {
            System.out.println("rent not updated");
        }
    }

    @Override
    public int updateSharingByRent(Integer sharing, Integer rent) {
        int row = pgRepo.updateByRent(sharing, rent);
        if (row > 0) {
            System.out.println("no of updated sharing : " + row);
        } else {
            System.out.println("not updated");
        }
        return row;
    }

    @Override
    public int updateNameById(String name, Integer id) {
        int row = pgRepo.updateById(name, id);
        if (row > 0) {
            System.out.println("no of names updated : " + row);
        } else {
            System.out.println("names not updated..");
        }
        return row;
    }
}
