package com.xworkz.restuarant.runner;

import com.xworkz.restuarant.entity.RestaurantEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RemoveRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("lavanya");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        RestaurantEntity restaurantEntity = entityManager.find(RestaurantEntity.class, 1);
        entityManager.getTransaction().begin();
        entityManager.remove(restaurantEntity);
        System.out.println(restaurantEntity);
        entityManager.getTransaction().commit();
    }
}
