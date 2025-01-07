package com.xworkz.fan.runner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FanRunner {
    public static void main(String[] args) {
        System.out.println("main method is running..");
        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("fan");

    }
}
