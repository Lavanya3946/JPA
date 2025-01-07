package com.xworkz.charger.runner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ChargerRunner {
    public static void main(String[] args) {
        System.out.println("running main method..");
        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("charger");
    }
}
