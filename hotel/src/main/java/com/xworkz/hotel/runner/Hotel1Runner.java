package com.xworkz.hotel.runner;

import com.xworkz.hotel.entity.Hotel1Entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Hotel1Runner {
    public static void main(String[] args) {
        System.out.println("main method is running ..");

        Hotel1Entity hotel1Entity1=new Hotel1Entity(1,"Udupi grand","Yelahanka","veg",4.6,60,9685741258L,"KrishnaRaj");
        Hotel1Entity hotel1Entity2=new Hotel1Entity(2,"Shivali's grand","Dhobi Ghat","veg-nonVeg",3.6,35,9587632145L,"ShivaRaj");
        Hotel1Entity hotel1Entity3=new Hotel1Entity(3,"Taj Hotel" ,"Yeswanthpur","veg",4.3,49,9236541236L,"Yeswanth");
        Hotel1Entity hotel1Entity4=new Hotel1Entity(4,"New Shanthi sagar","Ram Mandir","veg-nonVeg",3.9,53,9517532584L,"Shanthamma");
        Hotel1Entity hotel1Entity5=new Hotel1Entity(5,"Swathi Restaurant","Dhodaballpaura","veg",5.0,100,9955112233L,"Swathi");
        Hotel1Entity hotel1Entity6=new Hotel1Entity(6,"Manjunath Hotel","Kengeri","veg-nonVeg",3.6,45,9895979596L,"Manju");
        Hotel1Entity hotel1Entity7 = new Hotel1Entity(7, "Varun restaurant ", "Vijaynagar", "veg-nonVeg", 3.7, 55, 9565857545L, "Varuna");

        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("hotel");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(hotel1Entity1);
        entityManager.persist(hotel1Entity2);
        entityManager.persist(hotel1Entity3);
        entityManager.persist(hotel1Entity4);
        entityManager.persist(hotel1Entity5);
        entityManager.persist(hotel1Entity6);
        entityManager.persist(hotel1Entity7);

        entityManager.getTransaction().commit();

    }
}
