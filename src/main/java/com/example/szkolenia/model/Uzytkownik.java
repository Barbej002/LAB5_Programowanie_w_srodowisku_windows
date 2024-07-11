package com.example.szkolenia.model;

import javax.persistence.*;

@Entity
public class Uzytkownik {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String haslo;
    private String typ;
    private String imie;
    private String nazwisko;
    private Boolean aktywnosc;

    // getters and setters
}
