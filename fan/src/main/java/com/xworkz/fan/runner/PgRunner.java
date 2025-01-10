package com.xworkz.fan.runner;

import com.xworkz.fan.entity.PgEntity;
import com.xworkz.fan.entity.ShoppingEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class PgRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactor= Persistence.createEntityManagerFactory("fan");
        EntityManager entityManager= entityManagerFactor.createEntityManager();
        List<PgEntity> pgEntities=new ArrayList<>();
        pgEntities.add(new PgEntity(null,"Golden",6000,2));
        pgEntities.add(new PgEntity(null,"womens",6000,4));
        pgEntities.add(new PgEntity(null,"Kalika",6000,4));
        pgEntities.add(new PgEntity(null,"Kushi",6000,2));
        pgEntities.add(new PgEntity(null,"Meghana",6500,2));


        entityManager.getTransaction().begin();
       pgEntities.forEach(e->entityManager.persist(e));
        entityManager.getTransaction().commit();
    }
}
