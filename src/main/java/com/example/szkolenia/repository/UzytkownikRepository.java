package com.example.szkolenia.repository;

import com.example.szkolenia.model.Uzytkownik;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UzytkownikRepository extends JpaRepository<Uzytkownik, Long> {}
