package com.xworkz.fan.runner;

import com.xworkz.fan.entity.FanEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class FanRunner {
    public static void main(String[] args) {
        System.out.println("main method is running..");
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("fan");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<FanEntity> fanEntityList=new ArrayList<>();
        fanEntityList.add(new FanEntity(null,"usha","black",4000.0));
        fanEntityList.add(new FanEntity(null,"bajaj","white",3000.0));
        fanEntityList.add(new FanEntity(null,"Havells","blcck",5000.0));
        fanEntityList.add(new FanEntity(null,"Crompton","black",2000.0));
        fanEntityList.add(new FanEntity(null,"usha","white",5000.0));
        entityManager.getTransaction().begin();
        fanEntityList.forEach(e->entityManager.persist(e));
        entityManager.getTransaction().commit();

    }
}
