package com.xworkz.hotel.fetch;

import com.xworkz.hotel.entity.Hotel1Entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Hotel1Update {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hotel");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        try {
            Hotel1Entity entity = entityManager.find(Hotel1Entity.class, 1);
            if (entity != null) {
                entity.setName("Military Hotel");
                entity.setLocation("Magadi");
                entity.setType("veg and non-veg");
                entity.setOwnerName("Muniyappa");
                entity.setRatings(2.0);
                entityTransaction.begin();
                entityManager.merge(entity);
                entityTransaction.commit();
                entityManager.close();
            }
        } catch (Exception e) {
            entityTransaction.rollback();
            System.out.println(e.getMessage());
        }
    }
}
