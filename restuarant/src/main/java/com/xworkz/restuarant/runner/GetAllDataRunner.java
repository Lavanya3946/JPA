package com.xworkz.restuarant.runner;

import com.xworkz.restuarant.entity.HotelEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class GetAllDataRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("lavanya");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createNamedQuery("getAllData");
        List<HotelEntity> resultList = (List<HotelEntity>) query.getResultList();
        for (HotelEntity hotelEntity : resultList) {
            System.out.println(hotelEntity.getName());
        }
    }
}
