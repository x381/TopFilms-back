package com.example.topfilmsback.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Film implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String titre;
    private LocalDate dateSortie;
    private String realisateur;
    private Long duree;

    public Film() {

    }

    public Film(Long id, String titre, LocalDate dateSortie, String realisateur, Long duree) {
        this.id = id;
        this.titre = titre;
        this.dateSortie = dateSortie;
        this.realisateur = realisateur;
        this.duree = duree;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDateSortie(LocalDate dateSortie) {
        this.dateSortie = dateSortie;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public void setDuree(Long duree) {
        this.duree = duree;
    }

    public Long getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public LocalDate getDateSortie() {
        return dateSortie;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public Long getDuree() {
        return duree;
    }
}
