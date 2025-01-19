package com.xworkz.restuarant.runner;

import com.xworkz.restuarant.entity.RestaurantEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("lavanya");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        RestaurantEntity restaurantEntity = entityManager.find(RestaurantEntity.class, 2);
        System.out.println(restaurantEntity);
    }
}
