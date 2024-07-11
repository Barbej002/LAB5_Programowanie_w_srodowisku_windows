package com.example.szkolenia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Powiadomienie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String temat;
    private String tresc;

    @ManyToOne
    private Zajecia zajecia;

    // getters and setters
}
