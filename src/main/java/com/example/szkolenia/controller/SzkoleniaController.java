package com.example.szkolenia.controller;

import com.example.szkolenia.model.*;
import com.example.szkolenia.service.SzkoleniaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SzkoleniaController {
    @Autowired
    private SzkoleniaService szkoleniaService;

    @GetMapping("/uzytkownicy")
    public List<Uzytkownik> getAllUzytkownicy() {
        return szkoleniaService.findAllUzytkownicy();
    }

    @PostMapping("/uzytkownicy")
    public Uzytkownik createUzytkownik(@RequestBody Uzytkownik uzytkownik) {
        return szkoleniaService.saveUzytkownik(uzytkownik);
    }

    // Dodaj więcej endpointów dla innych operacji
}
