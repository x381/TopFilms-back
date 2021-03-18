package com.example.topfilmsback.repo;

import com.example.topfilmsback.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Long> {
    void deleteFilmById(Long id);
}
