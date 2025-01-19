package com.xworkz.restuarant.repositary;

import com.xworkz.restuarant.entity.HotelEntity;

import javax.persistence.*;

public class HotelRepoImpl implements HotelRepo {

    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("lavanya");

    @Override
    public Boolean save(HotelEntity hotelEntity) {
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(hotelEntity);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public HotelEntity getDataById(Integer id) {
        EntityManager entityManager = emf.createEntityManager();
        return entityManager.find(HotelEntity.class, id);

    }

    @Override
    public void getDataByName(String hotelName) {
        EntityManager entityManager = emf.createEntityManager();
        Query query = entityManager.createNamedQuery("getDataByName");
        query.setParameter("name", hotelName);
        try {
            HotelEntity singleResult = (HotelEntity) query.getSingleResult();
            System.out.println(singleResult);

        } catch (NoResultException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public HotelEntity updateDataByName(String location, String name) {
        EntityManager entityManager = emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            Query query = entityManager.createNamedQuery("updateByName");
            query.setParameter("location", location);
            query.setParameter("name", name);
            query.executeUpdate();
            entityManager.getTransaction().commit();

            Query updatedQuery = entityManager.createNamedQuery("getDataByName");
            updatedQuery.setParameter("name", name);
            HotelEntity hotelEntity = (HotelEntity) updatedQuery.getSingleResult();
            return hotelEntity;


        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            System.out.println(e.getMessage());
            return null;
        } finally {
            entityManager.close();
        }
    }

    @Override
    public int updateByLocation(Boolean taste, String location) {

        EntityManager entityManager = emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            Query query = entityManager.createNamedQuery("updateByLocation");
            query.setParameter("taste", taste);
            query.setParameter("location", location);
            int row = query.executeUpdate();
            entityManager.getTransaction().commit();
            return row;

        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            System.out.println(e.getMessage());
            return 0;
        } finally {
            entityManager.close();
        }
    }

    @Override
    public String getLocationById(Integer id) {
        EntityManager entityManager = emf.createEntityManager();
        try {
            Query query = entityManager.createNamedQuery("LocationById");
            query.setParameter("id", id);
            String location = (String) query.getSingleResult();
            return location;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public HotelEntity getLocationAndStateById(Integer id) {
        EntityManager entityManager = emf.createEntityManager();
        try {
            Query query = entityManager.createNamedQuery("idByLocationAndState");
            query.setParameter("id", id);

            HotelEntity hotelEntity = (HotelEntity) query.getSingleResult();
            return hotelEntity;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            entityManager.close();
        }
    }

    @Override
    public Integer getIdByLocation(String location) {
        EntityManager entityManager = emf.createEntityManager();
        try {
            Query query = entityManager.createNamedQuery("getIdByLocation");
            query.setParameter("location", location);
            int id = (int) query.getSingleResult();
            return id;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    @Override
    public String getLocationByName(String name) {
        EntityManager entityManager = emf.createEntityManager();
        try {
            Query query = entityManager.createNamedQuery("getLocationByName");
            query.setParameter("name", name);
            String location = (String) query.getSingleResult();
            return location;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }

    @Override
    public HotelEntity getLocationAndStateByName(String name) {
        EntityManager entityManager = emf.createEntityManager();
        try {
            Query query = entityManager.createNamedQuery("getLocationAndStateByName");
            query.setParameter("name", name);
            HotelEntity hotelEntity = (HotelEntity) query.getSingleResult();
            return hotelEntity;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public HotelEntity getLocationNameAndStateById(Integer id) {
        EntityManager entityManager = emf.createEntityManager();
        try {
            Query query = entityManager.createNamedQuery("getLLocationNameAndStateById");
            query.setParameter("id", id);
            HotelEntity hotelEntity = (HotelEntity) query.getSingleResult();
            return hotelEntity;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}

