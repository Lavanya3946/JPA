package com.xworkz.light.runner;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class lightRunner {
    public static void main(String[] args) {
        System.out.println("main method is running..");
        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("lavanya");




    }
}
