package com.xworkz.fan.runner;

import com.xworkz.fan.entity.PersonEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class PersonRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("fan");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        List<PersonEntity> personEntities=new ArrayList<>();
        personEntities.add(new PersonEntity(null,"Lavanya",21,"lavanyaanand200@gmail"));
        personEntities.add(new PersonEntity(null,"Monika",21,"monikaaanand99@gmail"));
        personEntities.add(new PersonEntity(null,"Sneha",21,"snehachaya12@gmail"));
        personEntities.add(new PersonEntity(null,"Yashu",21,"yashur34@gmail"));
        personEntities.add(new PersonEntity(null,"Nisarga",21,"nisarga345@gmail"));

        entityManager.getTransaction().begin();
        personEntities.forEach(e->entityManager.persist(e));
        entityManager.getTransaction().commit();
    }
}
