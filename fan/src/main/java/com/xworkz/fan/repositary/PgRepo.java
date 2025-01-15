package com.xworkz.fan.repositary;

import com.xworkz.fan.entity.PgEntity;

public interface PgRepo {
    Boolean save(PgEntity pgEntity);
    PgEntity getDataById(Integer id);
    void getDataByPgName(String pgname);
    void getDataByRent(Integer rent);
    void getDataBySharing(Integer sharing);
}
