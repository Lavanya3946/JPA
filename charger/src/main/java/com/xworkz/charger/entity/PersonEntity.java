package com.xworkz.charger.entity;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Data
@Table(name = "person")
@NamedQuery(name = "updateById", query = "update PersonEntity person set person.email=:email where person.id=:id")
@NamedQuery(name = "updateByName", query = "update PersonEntity person set person.address=:address where person.name=:name")
@NamedQuery(name = "updateContactNumber", query = "update PersonEntity person set person.contactNumber=:contactNumber where person.name=:name")


public class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String address;
    private Long contactNumber;
}
