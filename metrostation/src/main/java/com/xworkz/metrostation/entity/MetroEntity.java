package com.xworkz.metrostation.entity;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Data
@Table(name = "metro")
@NamedQuery(name = "updateById", query = "update MetroEntity metro set metro.stationName=:stationName where metro.id=:id")
@NamedQuery(name = "updateByName", query = "update MetroEntity metro set metro.startJourney=:startJourney where metro.stationName=:stationName")
@NamedQuery(name = "updateByDestination", query = "update MetroEntity metro set metro.destination=:destination where metro.ticketPrice=:ticketPrice")


public class MetroEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String stationName;
    private String startJourney;
    private String destination;
    private Integer ticketPrice;
}
