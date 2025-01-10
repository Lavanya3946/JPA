package com.xworkz.fan.runner;

import com.xworkz.fan.entity.MobileEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class MobileRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("fan");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        List<MobileEntity>mobileEntities=new ArrayList<>();
        mobileEntities.add(new MobileEntity(null,"oppo",40000));
        mobileEntities.add(new MobileEntity(null,"Redmi",26000));
        mobileEntities.add(new MobileEntity(null,"vivo",34000));
        mobileEntities.add(new MobileEntity(null,"realme",20000));
        mobileEntities.add(new MobileEntity(null,"samsung",40000));

        entityManager.getTransaction().begin();
        mobileEntities.forEach(e->entityManager.persist(e));
        entityManager.getTransaction().commit();
    }
}
