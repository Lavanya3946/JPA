package com.xworkz.hotel.runner;

import com.xworkz.hotel.entity.Hotel2Entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Hotel2Runner {
    public static void main(String[] args) {
        System.out.println("Hotel2 data saved successfully..");
        Hotel2Entity hotel2Entity1=new Hotel2Entity(1,"Ganapathi Hotel","Arsikere","veg",9685741236L,2,3,"12-07-2008");
        Hotel2Entity hotel2Entity2=new Hotel2Entity(2,"Shiva Hotel","Araliguppe","veg",9685785695L,3,2,"19-04-2000");
        Hotel2Entity hotel2Entity3=new Hotel2Entity(3,"Subbu Hotel","Laggere","non-veg",985214795L,23,5,"02-08-2005");
        Hotel2Entity hotel2Entity4=new Hotel2Entity(4,"Rama Hotel","Mejastic","veg",9363865959L,5,4,"12-10-2003");
        Hotel2Entity hotel2Entity5=new Hotel2Entity(5,"Lakshmi Hotel","Jaynagar","non-veg",7512369484L,4,2,"22-01-2009");
        Hotel2Entity hotel2Entity6=new Hotel2Entity(6,"Parvathi Hotel","Malleshwaram","veg",9874563215L,5,3,"12-07-2005");
        Hotel2Entity hotel2Entity7=new Hotel2Entity(7,"Annaporna  Hotel","Bidadi","veg",9565856585L,6,2,"22-02-2010");

      EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("hotel");
      EntityManager entityManager=entityManagerFactory.createEntityManager();
      entityManager.getTransaction().begin();
      entityManager.persist(hotel2Entity1);
        entityManager.persist(hotel2Entity2);
        entityManager.persist(hotel2Entity3);
        entityManager.persist(hotel2Entity4);
        entityManager.persist(hotel2Entity5);
        entityManager.persist(hotel2Entity6);
        entityManager.persist(hotel2Entity7);

      entityManager.getTransaction().commit();
    }
}
