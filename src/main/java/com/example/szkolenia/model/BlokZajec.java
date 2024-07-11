package com.example.szkolenia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class BlokZajec {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nazwa;

    @ManyToOne
    private Kurs kurs;

    @OneToMany(mappedBy = "blokZajec")
    private List<Zajecia> listaZajec;

    // getters and setters
}
