package com.example.szkolenia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ZgloszenieUczestnika {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String data;

    @ManyToOne
    private Uzytkownik uczestnik;

    @ManyToOne
    private Kurs kurs;

    // getters and setters
}
