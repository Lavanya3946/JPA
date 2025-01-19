package com.xworkz.restuarant.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "restuarant")
public class RestaurantEntity {

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "r_name")
    private String rName;
    @Column(name = "location")
    private String location;
    @Column(name = "pincode")
    private Long pinCode;
    @Column(name = "ratings")
    private Double ratings;
    @Column(name = "type")
    private String type;
    @Column(name = "c_no")
    private Long c_no;

}
