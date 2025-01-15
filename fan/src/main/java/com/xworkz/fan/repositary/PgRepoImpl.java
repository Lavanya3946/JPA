package com.xworkz.fan.repositary;

import com.xworkz.fan.entity.PgEntity;

import javax.persistence.*;

public class PgRepoImpl implements  PgRepo{
    static EntityManagerFactory emf=Persistence.createEntityManagerFactory("fan");
    @Override
    public Boolean save(PgEntity pgEntity) {
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(pgEntity);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public PgEntity getDataById(Integer id) {
        EntityManager entityManager=emf.createEntityManager();
        return entityManager.find(PgEntity.class,id);
    }

    @Override
    public void getDataByPgName(String pgname) {
        EntityManager entityManager = emf.createEntityManager();
        Query query = entityManager.createNamedQuery("getDataByName");
        query.setParameter("name", pgname);
        try {
            PgEntity singleResult = (PgEntity) query.getSingleResult();
            System.out.println(singleResult);

        } catch (NoResultException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void getDataByRent(Integer rent) {
        EntityManager entityManager=emf.createEntityManager();
        Query query= entityManager.createNamedQuery("getDataByRent");
        query.setParameter("rent",rent);
        try{
            PgEntity pgEntity=(PgEntity) query.getSingleResult();
            System.out.println(pgEntity);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void getDataBySharing(Integer sharing) {
       EntityManager entityManager= emf.createEntityManager();
       Query query=entityManager.createNamedQuery("getDataBySharing");
       query.setParameter("sharing",sharing);
       try{
           PgEntity pgEntity=(PgEntity) query.getSingleResult();
           System.out.println(pgEntity);
       }catch(Exception e){
           System.out.println(e.getMessage());
       }
    }
}

