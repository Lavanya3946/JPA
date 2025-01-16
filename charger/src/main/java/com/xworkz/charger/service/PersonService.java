package com.xworkz.charger.service;

import com.xworkz.charger.entity.PersonEntity;

public interface PersonService {
    void save(PersonEntity personEntity);

    int updateEmailById(String email, Integer id);

    int updateAddressByName(String address, String name);

    PersonEntity updateContactByName(Long contactNumber, String name);
}
