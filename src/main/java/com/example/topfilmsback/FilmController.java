package com.example.topfilmsback;

import com.example.topfilmsback.model.Film;
import com.example.topfilmsback.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/films")
public class FilmController {
    private final FilmService filmService;

    @Autowired
    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping
    public ResponseEntity<List<Film>> getAllFilms() {
        List<Film> films = filmService.findAllFilms();
        return new ResponseEntity<>(films, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Film> getFilm(@PathVariable("id") Long id) {
        Film film = filmService.findFilmById(id);
        return new ResponseEntity<>(film, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Film> addFilm(@RequestBody Film film) {
        Film createdFilm = filmService.addFilm(film);
        return new ResponseEntity<>(createdFilm, HttpStatus.CREATED);
    }

    @PostMapping("/generate")
    public ResponseEntity<List<Film>> addFilms(@RequestBody List<Film> films) {
        List<Film> createdFilms = filmService.addFilms(films);
        return new ResponseEntity<>(createdFilms, HttpStatus.OK);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Film> updateFilm(@PathVariable("id") Long id, @RequestBody Film film) {
        Film updatedFilm = filmService.updateFilm(id, film);
        return new ResponseEntity<>(updatedFilm, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Film> deleteFilm(@PathVariable("id") Long id) {
        filmService.deleteFilm(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
