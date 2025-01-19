package com.xworkz.restuarant.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Table(name = "hotel")
@NamedQuery(name = "getAllData", query = "select hotel from HotelEntity hotel")
@NamedQuery(name = "getDataByName", query = "select hotel from HotelEntity hotel where  hotel.name=:name")
@NamedQuery(name = "count", query = "select count(hotel) from HotelEntity hotel where  hotel.state=:state")
@NamedQuery(name = "updateByName", query = "update HotelEntity hotel set hotel.location=:location where hotel.name=:name")
@NamedQuery(name = "updateByLocation", query = "update HotelEntity hotel set hotel.taste=:taste where hotel.location=:location")
@NamedQuery(name = "LocationById", query = "select hotel.location from HotelEntity  hotel where hotel.id=:id")
@NamedQuery(name = "idByLocationAndState", query = "select new  HotelEntity(hotel.location,hotel.state)from HotelEntity hotel where hotel.id=:id")
@NamedQuery(name = "getIdByLocation", query = "select hotel.id from HotelEntity hotel where hotel.location=:location")
@NamedQuery(name = "getLocationByName", query = "select hotel.location from HotelEntity hotel where hotel.name=:name")
@NamedQuery(name = "getLocationAndStateByName", query = "select new HotelEntity(hotel.location,hotel.state)from HotelEntity hotel where hotel.name=:name")
@NamedQuery(name = "getLLocationNameAndStateById", query = "select new HotelEntity(hotel.location,hotel.name,hotel.state)from HotelEntity hotel where hotel.id=:id")


public class HotelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String name;
    private String location;
    private Boolean taste;
    private String state;

    public HotelEntity(String location, String state) {
        this.location = location;
        this.state = state;
    }

    public HotelEntity(String location, String name, String state) {
        this.location = location;
        this.name = name;
        this.state = state;
    }

}
