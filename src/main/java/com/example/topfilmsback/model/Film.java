package com.example.topfilmsback.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Film implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "titre")
    private String titre;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "genre")
    private String genre;

    @Column(name = "description")
    private String description;

    @Column(name = "date_sortie")
    private LocalDate dateSortie;

    @Column(name = "realisateur")
    private String realisateur;

    @Column(name = "duree")
    private Long duree;

    public Film() {

    }

    public Film(Long id, String titre, String imageUrl, String genre, String description, LocalDate dateSortie, String realisateur, Long duree) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.titre = titre;
        this.genre = genre;
        this.description = description;
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

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public String getGenre() {
        return genre;
    }

    public String getDescription() {
        return description;
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
