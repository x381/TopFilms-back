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

    @Column(name = "synopsis")
    private String synopsis;

    @Column(name = "date_sortie")
    private LocalDate dateSortie;

    @Column(name = "realisateur")
    private String realisateur;

    @Column(name = "duree")
    private Long duree;

    @Column(name = "bande_annonce")
    private String bandeAnnonce;

    public Film() {

    }

    public Film(Long id, String titre, String imageUrl, String genre, String synopsis, LocalDate dateSortie, String realisateur, Long duree, String bandeAnnonce) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.titre = titre;
        this.genre = genre;
        this.synopsis = synopsis;
        this.dateSortie = dateSortie;
        this.realisateur = realisateur;
        this.duree = duree;
        this.bandeAnnonce = bandeAnnonce;
    }

    public Film merge(Film film) {
        String titre = this.titre;
        String imageUrl = this.imageUrl;
        String genre = this.genre;
        String synopsis = this.synopsis;
        LocalDate dateSortie = this.dateSortie;
        String realisateur = this.realisateur;
        Long duree = this.duree;
        String bandeAnnonce = this.bandeAnnonce;

        if(film.titre != null && !film.titre.isEmpty())
            titre = film.titre;
        if(film.imageUrl != null && !film.imageUrl.isEmpty())
            imageUrl = film.imageUrl;
        if(film.genre != null && !film.genre.isEmpty())
            genre = film.genre;
        if(film.synopsis != null && !film.synopsis.isEmpty())
            synopsis = film.synopsis;
        if(film.dateSortie != null && !film.dateSortie.toString().isEmpty())
            dateSortie = film.dateSortie;
        if(film.realisateur != null && !film.realisateur.isEmpty())
            realisateur = film.realisateur;
        if(film.duree != null)
            duree = film.duree;
        if(film.bandeAnnonce != null && !film.bandeAnnonce.isEmpty())
            bandeAnnonce = film.bandeAnnonce;

        return new Film(this.id, titre, imageUrl, genre, synopsis, dateSortie, realisateur, duree, bandeAnnonce);
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

    public void setSynopsis(String description) {
        this.synopsis = description;
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

    public void setBandeAnnonce(String bandeAnnonce) {
        this.bandeAnnonce = bandeAnnonce;
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

    public String getSynopsis() {
        return synopsis;
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

    public String getBandeAnnonce() {
        return bandeAnnonce;
    }
}
