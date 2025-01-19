package com.xworkz.restuarant.runner;

import com.xworkz.restuarant.entity.RestaurantEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("lavanya");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            RestaurantEntity restaurantEntity = entityManager.find(RestaurantEntity.class, 2);
            if (restaurantEntity != null) {
                restaurantEntity.setRName("Samudra Hotel");
                restaurantEntity.setLocation("VijayNagar");
                transaction.begin();
                entityManager.merge(restaurantEntity);
                transaction.commit();
                entityManager.close();
            }


        } catch (Exception e) {
            transaction.rollback();
            System.out.println(e.getMessage());
        }
    }

}
