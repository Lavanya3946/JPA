package com.xworkz.fan.service;

import com.xworkz.fan.entity.PgEntity;

public interface PgService {
    void save(PgEntity pgEntity);
    Boolean getById(Integer id);
    void getByName(String name);
    void getByRent(Integer rent);
    void getBySharing(Integer sharing);
}