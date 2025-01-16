package com.xworkz.metrostation.runner;

import com.xworkz.metrostation.entity.MetroEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class MetroRunner {
    public static void main(String[] args) {
        System.out.println("main method is running");
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("metro");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        try {
            List<MetroEntity> metroEntities = new ArrayList<>();
            metroEntities.add(new MetroEntity(null, "Rajajinagar Metro", "Rajajinagar", "Silk Institute", 30));
            metroEntities.add(new MetroEntity(null, "Kuvempu mahakavi Metro", "Navarang", "Silk Institute", 60));
            metroEntities.add(new MetroEntity(null, "Silk Board Metro", "Silk Institue", "Rajajinagar", 45));
            metroEntities.add(new MetroEntity(null, "mantri square Metro", "Rajajinagar", "mantri square", 20));
            metroEntities.add(new MetroEntity(null, "Basavangudi Metro", "Basavangudi", "Silk Institute", 60));

            entityManager.getTransaction().begin();
            metroEntities.forEach(e -> entityManager.persist(e));
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            System.out.println(e.getMessage());
        } finally {
            entityManager.close();
        }
    }
}
