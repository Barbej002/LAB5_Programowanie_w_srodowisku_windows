package com.example.szkolenia.controller;

import com.example.szkolenia.model.Uzytkownik;
import com.example.szkolenia.service.SzkoleniaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/web")
public class WebController {

    @Autowired
    private SzkoleniaService szkoleniaService;

    @GetMapping("/uzytkownicy")
    public String getAllUzytkownicy(Model model) {
        List<Uzytkownik> uzytkownicy = szkoleniaService.findAllUzytkownicy();
        model.addAttribute("uzytkownicy", uzytkownicy);
        return "uzytkownicy";
    }

    @GetMapping("/uzytkownicy/nowy")
    public String createUzytkownikForm(Model model) {
        model.addAttribute("uzytkownik", new Uzytkownik());
        return "nowy-uzytkownik";
    }

    @PostMapping("/uzytkownicy")
    public String createUzytkownik(@ModelAttribute Uzytkownik uzytkownik) {
        szkoleniaService.saveUzytkownik(uzytkownik);
        return "redirect:/web/uzytkownicy";
    }
}
