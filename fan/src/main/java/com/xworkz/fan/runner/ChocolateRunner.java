package com.xworkz.fan.runner;

import com.xworkz.fan.entity.ChocolatesEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class ChocolateRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("fan");
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        List<ChocolatesEntity>chocolatesEntities=new ArrayList<>();
        chocolatesEntities.add(new ChocolatesEntity(null,"dairymilk",20));
        chocolatesEntities.add(new ChocolatesEntity(null,"dairymilk silk",150));
        chocolatesEntities.add(new ChocolatesEntity(null,"dairymilk fruits and nuts",70));
        chocolatesEntities.add(new ChocolatesEntity(null,"5star",5));
        chocolatesEntities.add(new ChocolatesEntity(null,"kitkat",20));


        entityManager.getTransaction().begin();
        chocolatesEntities.forEach(e->entityManager.persist(e));
        entityManager.getTransaction().commit();
    }
}
