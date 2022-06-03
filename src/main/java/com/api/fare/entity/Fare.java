package com.api.fare.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Fare {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String flightNumber;
    @Column
    private String flightDate;
    @Column
    private String fare;

    public Fare(String flightNumber, String flightDate, String fare) {
    }
}
