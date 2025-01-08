package com.xworkz.hotel.runner;

import com.xworkz.hotel.entity.Hotel4Entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Hotel4Runner {
    public static void main(String[] args) {
        System.out.println("main method is running ..");

        Hotel4Entity Hotel4Entity1 = new Hotel4Entity(1, "Udupi grand", "Yelahanka", "veg", 4.6, 60, 9685741258L, "KrishnaRaj");
        Hotel4Entity Hotel4Entity2 = new Hotel4Entity(2, "Shivali's grand", "Dhobi Ghat", "veg-nonVeg", 3.6, 35, 9587632145L, "ShivaRaj");
        Hotel4Entity Hotel4Entity3 = new Hotel4Entity(3, "Taj Hotel", "Yeswanthpur", "veg", 4.3, 49, 9236541236L, "Yeswanth");
        Hotel4Entity Hotel4Entity4 = new Hotel4Entity(4, "New Shanthi sagar", "Ram Mandir", "veg-nonVeg", 3.9, 53, 9517532584L, "Shanthamma");
        Hotel4Entity Hotel4Entity5 = new Hotel4Entity(5, "Swathi Restaurant", "Dhodaballpaura", "veg", 5.0, 100, 9955112233L, "Swathi");
        Hotel4Entity Hotel4Entity6 = new Hotel4Entity(6, "Manjunath Hotel", "Kengeri", "veg-nonVeg", 3.6, 45, 9895979596L, "Manju");
        Hotel4Entity Hotel4Entity7 = new Hotel4Entity(7, "Varun restaurant ", "Vijaynagar", "veg-nonVeg", 3.7, 55, 9565857545L, "Varuna");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hotel");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(Hotel4Entity1);
        entityManager.persist(Hotel4Entity2);
        entityManager.persist(Hotel4Entity3);
        entityManager.persist(Hotel4Entity4);
        entityManager.persist(Hotel4Entity5);
        entityManager.persist(Hotel4Entity6);
        entityManager.persist(Hotel4Entity7);

        entityManager.getTransaction().commit();
    }
}
