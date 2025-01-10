package com.xworkz.fan.runner;

import com.xworkz.fan.entity.CollegeEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class CollegeRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("fan");
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        List<CollegeEntity>collegeEntities=new ArrayList<>();
        collegeEntities.add(new CollegeEntity(null,"kalpataru","private",89));
        collegeEntities.add(new CollegeEntity(null,"RT university","private",100));
        collegeEntities.add(new CollegeEntity(null,"sridevi","VTU",70));
        collegeEntities.add(new CollegeEntity(null,"Jss college","Govt",89));
        collegeEntities.add(new CollegeEntity(null,"Presidency","private",800));

        entityManager.getTransaction().begin();
        collegeEntities.forEach(e->entityManager.persist(e));
        entityManager.getTransaction().commit();
    }
}
