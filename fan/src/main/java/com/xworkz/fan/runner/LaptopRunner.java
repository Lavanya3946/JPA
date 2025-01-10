package com.xworkz.fan.runner;

import com.xworkz.fan.entity.LaptopEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class LaptopRunner {
    public static void main(String[] args) {
       EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("fan");
       EntityManager entityManager=entityManagerFactory.createEntityManager();
        List<LaptopEntity> laptopEntities=new ArrayList<>();
        laptopEntities.add(new LaptopEntity(null,"Hp","black",40000.0));
        laptopEntities.add(new LaptopEntity(null,"Lenovo","silver",44000.0));
        laptopEntities.add(new LaptopEntity(null,"Acer","black",36000.0));
        laptopEntities.add(new LaptopEntity(null,"Dell","black",25000.0));
        laptopEntities.add(new LaptopEntity(null,"Hp","black",40000.0));

       entityManager.getTransaction().begin();
       laptopEntities.forEach(e->entityManager.persist(e));
       entityManager.getTransaction().commit();
    }
}
