package com.xworkz.hotel.runner;

import com.xworkz.hotel.entity.Hotel2Entity;
import com.xworkz.hotel.entity.Hotel5Entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Hotel5Runner {
    public static void main(String[] args) {
        System.out.println("Hotel5 data saved successfully..");
        Hotel5Entity hotel5Entity1 = new Hotel5Entity(1, "Ganapathi Hotel", "Arsikere", "veg", 9685741236L, 2, 3, "12-07-2008");
        Hotel5Entity hotel5Entity2 = new Hotel5Entity(2, "Shiva Hotel", "Araliguppe", "veg", 9685785695L, 3, 2, "19-04-2000");
        Hotel5Entity hotel5Entity3 = new Hotel5Entity(3, "Subbu Hotel", "Laggere", "non-veg", 985214795L, 23, 5, "02-08-2005");
        Hotel5Entity hotel5Entity4 = new Hotel5Entity(4, "Rama Hotel", "Mejastic", "veg", 9363865959L, 5, 4, "12-10-2003");
        Hotel5Entity hotel5Entity5 = new Hotel5Entity(5, "Lakshmi Hotel", "Jaynagar", "non-veg", 7512369484L, 4, 2, "22-01-2009");
        Hotel5Entity hotel5Entity6 = new Hotel5Entity(6, "Parvathi Hotel", "Malleshwaram", "veg", 9874563215L, 5, 3, "12-07-2005");
        Hotel5Entity hotel5Entity7 = new Hotel5Entity(7, "Annaporna  Hotel", "Bidadi", "veg", 9565856585L, 6, 2, "22-02-2010");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hotel");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(hotel5Entity1);
        entityManager.persist(hotel5Entity2);
        entityManager.persist(hotel5Entity3);
        entityManager.persist(hotel5Entity4);
        entityManager.persist(hotel5Entity5);
        entityManager.persist(hotel5Entity6);
        entityManager.persist(hotel5Entity7);

        entityManager.getTransaction().commit();
    }
}
