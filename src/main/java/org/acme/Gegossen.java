package org.acme;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Gegossen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(insertable = false, updatable = false)
    public Date datum;

    public Gegossen(){}
}

