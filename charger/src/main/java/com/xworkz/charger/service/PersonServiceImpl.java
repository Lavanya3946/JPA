package com.xworkz.charger.service;

import com.xworkz.charger.entity.PersonEntity;
import com.xworkz.charger.repositary.PersonRepo;
import com.xworkz.charger.repositary.PersonRepoImpl;

public class PersonServiceImpl implements PersonService {
    PersonRepo personRepo = new PersonRepoImpl();

    @Override
    public void save(PersonEntity personEntity) {
        Boolean save = personRepo.save(personEntity);
        if (save) {
            System.out.println("data saved ");
        } else {
            System.out.println("not saved");
        }

    }

    @Override
    public int updateEmailById(String email, Integer id) {
        int row = personRepo.updateById(email, id);
        if (row > 0) {
            System.out.println("no of  email rows updated: " + row);
        } else {
            System.out.println("not updated email");
        }
        return row;
    }

    @Override
    public int updateAddressByName(String address, String name) {
        personRepo.updateByName(address, name);
        return 0;
    }

    @Override
    public PersonEntity updateContactByName(Long contactNumber, String name) {
        PersonEntity personEntity = personRepo.updateContactNumber(contactNumber, name);
        if (personEntity == null) {
            System.out.println("updated ");
        } else {
            System.out.println("not updated");
        }
        return personEntity;
    }
}
