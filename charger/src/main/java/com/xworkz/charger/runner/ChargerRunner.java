package com.xworkz.charger.runner;

import com.xworkz.charger.entity.PersonEntity;
import com.xworkz.charger.service.PersonService;
import com.xworkz.charger.service.PersonServiceImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ChargerRunner {
    public static void main(String[] args) {
        System.out.println("running main method..");
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("charger");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        PersonEntity personEntity = new PersonEntity(null, "manasa", "manasa34@gmail.com", "hassan", 7412589635l);
        PersonService personService = new PersonServiceImpl();
        personService.save(personEntity);

    }
}
