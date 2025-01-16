package com.xworkz.metrostation.repositary;

import com.xworkz.metrostation.entity.MetroEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MetroRepoImpl implements MetroRepo {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("metro");


    @Override
    public Boolean save(MetroEntity metroEntity) {
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(metroEntity);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public Integer updateById(String stationName, Integer id) {
        EntityManager entityManager = emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            Query query = entityManager.createNamedQuery("updateById");
            query.setParameter("stationName", stationName);
            query.setParameter("id", id);
            int row = query.executeUpdate();
            entityManager.getTransaction().commit();
            return row;

        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            System.out.println(e.getMessage());
        } finally {
            entityManager.close();
        }
        return 0;
    }

    @Override
    public Integer updateByName(String startJourney, String stationName) {
        EntityManager entityManager = emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            Query query = entityManager.createNamedQuery("updateByName");
            query.setParameter("startJourney", startJourney);
            query.setParameter("stationName", stationName);
            int row = query.executeUpdate();
            entityManager.getTransaction().commit();
            return row;

        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            System.out.println(e.getMessage());
        } finally {
            entityManager.close();
        }
        return 0;
    }

    @Override
    public Integer updateByDestination(String destination, Integer ticketPrice) {
        EntityManager entityManager = emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            Query query = entityManager.createNamedQuery("updateByDestination");
            query.setParameter("destination", destination);
            query.setParameter("ticketPrice", ticketPrice);
            int row = query.executeUpdate();
            entityManager.getTransaction().commit();
            return row;

        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            System.out.println(e.getMessage());
        } finally {
            entityManager.close();
        }

        return 0;
    }
}
