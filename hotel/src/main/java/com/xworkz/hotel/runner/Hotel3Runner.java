package com.xworkz.hotel.runner;

import com.xworkz.hotel.entity.Hotel3Entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Hotel3Runner {
    public static void main(String[] args) {
        System.out.println("running main method.." );

        Hotel3Entity hotel3Entity1=new Hotel3Entity(1,"Seeta Hotel","Bangalore",562362L,"Seetamma","8AM-10PM",4,9632587415L);
        Hotel3Entity hotel3Entity2=new Hotel3Entity(2,"Megha Tiifen center ","Tiptur",562364L,"Meghana","7AM-11PM",4,9632587415L);
        Hotel3Entity hotel3Entity3=new Hotel3Entity(3,"Meena Hotel","Rajajianagar",562345L,"Meena","6AM-10PM",5,9569856962L);
        Hotel3Entity hotel3Entity4=new Hotel3Entity(4,"Udupi Hotel","Yelahanka",562352L,"Krishappa","5AM-8PM",2,921789654L);
        Hotel3Entity hotel3Entity5=new Hotel3Entity(5,"Shanti Hotel","Jaynagar",565252L,"Shantamma","6AM-12PM",5,9632587412L);
        Hotel3Entity hotel3Entity6=new Hotel3Entity(6,"Samudra Hotel","Kengeri",560033L,"Shivanna","5AM-11PM",4,9658742312L);
        Hotel3Entity hotel3Entity7=new Hotel3Entity(7,"Annapornaeshwari Hotel","Gubbi",567895L,"Saraswathi","8AM-10PM",4,9874563215L);


        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("hotel");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(hotel3Entity1);
        entityManager.persist(hotel3Entity2);
        entityManager.persist(hotel3Entity3);
        entityManager.persist(hotel3Entity4);
        entityManager.persist(hotel3Entity5);
        entityManager.persist(hotel3Entity6);
        entityManager.persist(hotel3Entity7);


        entityManager.getTransaction().commit();
    }
}
