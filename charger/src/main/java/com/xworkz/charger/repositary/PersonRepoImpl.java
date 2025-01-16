package com.xworkz.charger.repositary;

import com.xworkz.charger.entity.PersonEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class PersonRepoImpl implements PersonRepo {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("charger");

    @Override
    public Boolean save(PersonEntity personEntity) {
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(personEntity);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public Integer updateById(String email, Integer id) {
        EntityManager entityManager = emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            Query query = entityManager.createNamedQuery("updateById");
            query.setParameter("email", email);
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
    public void updateByName(String address, String name) {
        EntityManager entityManager = emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            Query query = entityManager.createNamedQuery("updateByName");
            query.setParameter("address", address);
            query.setParameter("name", name);
            int updated = query.executeUpdate();
            entityManager.getTransaction().commit();
            System.out.println(updated);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            entityManager.close();
        }


    }

    @Override
    public PersonEntity updateContactNumber(Long contactNumber, String name) {
        EntityManager entityManager = emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            Query query = entityManager.createNamedQuery("updateContactNumber");
            query.setParameter("contactNumber", contactNumber);
            query.setParameter("name", name);
            int updated = query.executeUpdate();
            entityManager.getTransaction().commit();
            System.out.println(updated);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            entityManager.close();
        }


        return null;
    }
}
