package com.example.szkolenia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PowiadomieniaUzytkownika {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Boolean przeczytane;

    @ManyToOne
    private Uzytkownik uzytkownik;

    @ManyToOne
    private Powiadomienie powiadomienie;

    // getters and setters
}
