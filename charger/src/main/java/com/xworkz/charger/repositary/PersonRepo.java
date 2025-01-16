package com.xworkz.charger.repositary;

import com.xworkz.charger.entity.PersonEntity;

public interface PersonRepo {
    Boolean save(PersonEntity personEntity);

    Integer updateById(String email, Integer id);

    void updateByName(String address, String name);

    PersonEntity updateContactNumber(Long contactNumber, String name);

}
