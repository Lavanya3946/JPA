package com.xworkz.fan.runner;

import com.xworkz.fan.entity.ShoppingEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class ShoppingRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactor=Persistence.createEntityManagerFactory("fan");
       EntityManager entityManager= entityManagerFactor.createEntityManager();
        List<ShoppingEntity>shoppingEntities=new ArrayList<>();
        shoppingEntities.add(new ShoppingEntity(null,"dress",450,"meesho"));
        shoppingEntities.add(new ShoppingEntity(null,"watch",4500,"flipcart"));
        shoppingEntities.add(new ShoppingEntity(null,"bag",550,"meesho"));
        shoppingEntities.add(new ShoppingEntity(null,"sweater",500,"ajio"));
        shoppingEntities.add(new ShoppingEntity(null,"buds",1550,"meesho"));

       entityManager.getTransaction().begin();
       shoppingEntities.forEach(e->entityManager.persist(e));
       entityManager.getTransaction().commit();
    }
}
