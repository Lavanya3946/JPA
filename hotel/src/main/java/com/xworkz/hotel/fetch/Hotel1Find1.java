package com.xworkz.hotel.fetch;

import com.xworkz.hotel.entity.Hotel1Entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Hotel1Find1 {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hotel");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Hotel1Entity hotel1Entity1 = entityManager.find(Hotel1Entity.class, 2);
        Hotel1Entity hotel1Entity2 = entityManager.find(Hotel1Entity.class, 1);
        Hotel1Entity hotel1Entity3 = entityManager.find(Hotel1Entity.class, 5);
        Hotel1Entity hotel1Entity4 = entityManager.find(Hotel1Entity.class, 3);
        Hotel1Entity hotel1Entity5 = entityManager.find(Hotel1Entity.class, 7);


        System.out.println(hotel1Entity1);
        System.out.println(hotel1Entity2);
        System.out.println(hotel1Entity3);
        System.out.println(hotel1Entity4);
        System.out.println(hotel1Entity5);
    }
}
