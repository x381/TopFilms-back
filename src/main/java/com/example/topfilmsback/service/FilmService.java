package com.example.topfilmsback.service;

import com.example.topfilmsback.exception.FilmNotFoundException;
import com.example.topfilmsback.model.Film;
import com.example.topfilmsback.repo.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FilmService {

    private final FilmRepository filmRepository;

    public FilmService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    public Film findFilmById(Long id) {
        return filmRepository.findById(id).orElseThrow(() -> new FilmNotFoundException("film id " + id + " not found"));
    }

    public List<Film> findAllFilms() {
        return filmRepository.findAll();
    }

    public Film addFilm(Film film) {
        return filmRepository.save(film);
    }

    public List<Film> addFilms(List<Film> films) {
        return films.stream().map(x -> filmRepository.save(x)).collect(Collectors.toList());
    }

    public Film updateFilm(Long id, Film film) {
        Film updateFilm = findFilmById(id);
        return filmRepository.save(updateFilm.merge(film));
    }

    public void deleteFilm(Long id) {
        filmRepository.deleteById(id);
    }

}
