package com.xworkz.fan.runner;

import com.xworkz.fan.entity.MovieEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class MovieRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("fan");
        EntityManager entityManager= emf.createEntityManager();
        List<MovieEntity>movieEntities=new ArrayList<>();
        movieEntities.add(new MovieEntity(null,"max","sudeep","kannada"));
        movieEntities.add(new MovieEntity(null,"UI","Upendra","kannada"));
        movieEntities.add(new MovieEntity(null,"Kirataka","Yash","kannada"));
        movieEntities.add(new MovieEntity(null,"Ramachari","Vishnuvardhan","kannada"));
        movieEntities.add(new MovieEntity(null,"Navagraha","Darshan","kannada"));

        entityManager.getTransaction().begin();
        movieEntities.forEach(e->entityManager.persist(e));
        entityManager.getTransaction().commit();
    }
}
