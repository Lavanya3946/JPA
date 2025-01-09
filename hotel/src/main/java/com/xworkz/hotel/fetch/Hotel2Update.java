package com.xworkz.hotel.fetch;

import com.xworkz.hotel.entity.Hotel2Entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Hotel2Update {
    public static void main(String[] args) {
       EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("hotel");
       EntityManager entityManager=entityManagerFactory.createEntityManager();
       EntityTransaction entityTransaction=entityManager.getTransaction();
       try{
           Hotel2Entity hotel2Entity=entityManager.find(Hotel2Entity.class,4);
           if(hotel2Entity!=null){
               hotel2Entity.setName("Yashaswini Hotel");
               hotel2Entity.setLocation("Tumkur");
               hotel2Entity.setContactNumber(7752634585L);
               hotel2Entity.setNoOfBranches(3);
               hotel2Entity.setNoOfFloors(2);
               entityTransaction.begin();
               entityManager.merge(hotel2Entity);
               entityTransaction.commit();
               entityManager.close();
           }
       }catch(Exception e)
       {
           entityTransaction.rollback();
           System.out.println(e.getMessage());
       }
    }
}
