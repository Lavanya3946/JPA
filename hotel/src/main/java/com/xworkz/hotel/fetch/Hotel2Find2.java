package com.xworkz.hotel.fetch;

import com.xworkz.hotel.entity.Hotel2Entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Hotel2Find2 {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("hotel");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        Hotel2Entity hotel2Entity=entityManager.find(Hotel2Entity.class,3);
        System.out.println(hotel2Entity);

    }
}
