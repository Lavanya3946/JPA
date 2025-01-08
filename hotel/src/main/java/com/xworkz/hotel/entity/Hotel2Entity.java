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
@Table(name = "hotel2")

public class Hotel2Entity {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "hotel2_name")
    private String name;

    @Column(name = "hotel2_location")
    private String location;

    @Column(name = "hotel2_type")
    private String type;

    @Column(name = "contact_Number")
    private Long contactNumber;

    @Column(name = "no_OfBranches")
    private int noOfBranches;

    @Column(name = "no_ofFloors")
    private  int noOfFloors;

    @Column(name = "started_Date")
    private String startDate;
}
