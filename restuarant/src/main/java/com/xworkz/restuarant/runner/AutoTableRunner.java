package com.xworkz.restuarant.runner;

import com.xworkz.restuarant.entity.HotelEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AutoTableRunner {
    public static void main(String[] args) {
        HotelEntity hotelEntity = new HotelEntity(null, "Bisi bisi Idly ", "Magadi", true, "karnataka");
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("lavanya");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(hotelEntity);
        entityManager.getTransaction().commit();
    }
}
