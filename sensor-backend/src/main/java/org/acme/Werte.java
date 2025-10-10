package org.acme;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Werte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public double co2;
    public double erdfeuchtigkeit;

    @Column(insertable = false, updatable = false)
    public Date datum;

    public Werte(){}

    public Werte(double co2, double erdfeuchtigkeit){
        this.co2 = co2;
        this.erdfeuchtigkeit = erdfeuchtigkeit;
    }

    public Werte(Long id, double co2, double erdfeuchtigkeit, Date datum){
        this.id = id;
        this.co2 = co2;
        this.erdfeuchtigkeit = erdfeuchtigkeit;
        this.datum = datum;
    }
}

