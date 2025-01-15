package com.xworkz.fan.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "pg_table")
@NamedQuery(name="getDataByName",query="select pg_table from PgEntity pg_table where  pg_table.name=:name")
@NamedQuery(name="getDataByRent",query="select pg_table from PgEntity pg_table where  pg_table.rent=:rent")
@NamedQuery(name="getDataBySharing",query="select pg_table from PgEntity pg_table where  pg_table.sharing=:sharing")




public class PgEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private  String name;
    private  Integer rent;
    private  Integer sharing;
}
