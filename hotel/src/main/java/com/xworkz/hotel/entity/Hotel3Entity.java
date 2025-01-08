package com.xworkz.hotel.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="hotel3")

public class Hotel3Entity {

    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="name")
    private  String name;

    @Column(name="location")
    private  String location;

    @Column(name="pincode")
    private  Long pinCode;

    @Column(name="owner_name")
    private  String ownerName;

    @Column(name="timing")
    private  String timing;

    @Column(name="rating")
    private  Integer rating;

    @Column(name="contact_number")
    private Long contactNumber;

}
