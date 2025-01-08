package com.xworkz.hotel.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="hotel1")

public class Hotel1Entity {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "hotel1_name")
    private  String name;

    @Column(name = "hotel1_location")
    private String location;

    @Column(name = "hotel1_type")
    private String type;

    @Column(name = "ratings")
    private Double ratings;

    @Column(name = "no_OfServers")
    private int noOfServers;

    @Column(name = "contact_number")
    private  Long contactNumber;

    @Column(name = "hotel1_ownerName")
    private String ownerName;
}
