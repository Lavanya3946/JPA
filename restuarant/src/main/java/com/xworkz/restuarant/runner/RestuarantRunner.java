package com.xworkz.restuarant.runner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RestuarantRunner {
    public static void main(String[] args) {
        System.out.println("main method method is running..");
        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("lavanya");
    }
}
