package com.xworkz.fan.runner;

import com.xworkz.fan.entity.RiverEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class RiverRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("fan");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<RiverEntity> riverEntityList = new ArrayList<>();
        riverEntityList.add(new RiverEntity(null, "ganga", "west bengal"));
        riverEntityList.add(new RiverEntity(null, "yamuna", "Shivmogga"));
        riverEntityList.add(new RiverEntity(null, "krishna", "Bhadravathi"));
        riverEntityList.add(new RiverEntity(null, "netravathi", "udupi"));
        riverEntityList.add(new RiverEntity(null, "brahmaputra", "shivmogga"));
        entityManager.getTransaction().begin();
        riverEntityList.forEach(e -> entityManager.persist(e));
        entityManager.getTransaction().commit();


    }
}
