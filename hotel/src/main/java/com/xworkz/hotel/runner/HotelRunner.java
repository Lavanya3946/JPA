package com.xworkz.hotel.runner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HotelRunner {
    public static void main(String[] args) {
        System.out.println("main method is running ..");
        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("hotel");
    }
}
