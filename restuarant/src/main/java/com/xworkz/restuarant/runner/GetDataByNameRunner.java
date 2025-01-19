package com.xworkz.restuarant.runner;

import com.xworkz.restuarant.entity.HotelEntity;

import javax.persistence.*;

public class GetDataByNameRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("lavanya");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createNamedQuery("getDataByName");
        query.setParameter("name", "Manya Hotel");
        try {
            HotelEntity singleResult = (HotelEntity) query.getSingleResult();
            System.out.println(singleResult);

        } catch (NoResultException e) {
            System.out.println(e.getMessage());
        }
    }
}
