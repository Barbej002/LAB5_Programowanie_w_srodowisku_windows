package com.example.szkolenia.service;

import com.example.szkolenia.model.*;
import com.example.szkolenia.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SzkoleniaService {
    @Autowired
    private UzytkownikRepository uzytkownikRepository;
    @Autowired
    private ZgloszenieUczestnikaRepository zgloszenieUczestnikaRepository;
    @Autowired
    private KursRepository kursRepository;
    @Autowired
    private BlokZajecRepository blokZajecRepository;
    @Autowired
    private ZajeciaRepository zajeciaRepository;
    @Autowired
    private PowiadomienieRepository powiadomienieRepository;
    @Autowired
    private PowiadomieniaUzytkownikaRepository powiadomieniaUzytkownikaRepository;

    // Przykładowe metody
    public List<Uzytkownik> findAllUzytkownicy() {
        return uzytkownikRepository.findAll();
    }

    public Uzytkownik saveUzytkownik(Uzytkownik uzytkownik) {
        return uzytkownikRepository.save(uzytkownik);
    }

    // Dodaj więcej metod dla innych operacji na encjach
}
