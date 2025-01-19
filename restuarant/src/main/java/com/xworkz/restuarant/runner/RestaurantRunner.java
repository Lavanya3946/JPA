package com.xworkz.restuarant.runner;

import com.xworkz.restuarant.entity.RestaurantEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RestaurantRunner {
    public static void main(String[] args) {
        System.out.println("main method method is running..");

        RestaurantEntity restaurantEntity = new RestaurantEntity();
        restaurantEntity.setId(2);
        restaurantEntity.setRName("Shivali's Grand");
        restaurantEntity.setLocation("Dhobi ghat");
        restaurantEntity.setPinCode(564564L);
        restaurantEntity.setRatings(4.6);
        restaurantEntity.setType("veg ");
        restaurantEntity.setC_no(9582715753L);

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("lavanya");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(restaurantEntity);
        entityManager.getTransaction().commit();
    }
}
