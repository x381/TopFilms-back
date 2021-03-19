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

    @Column(name = "somme_notes")
    private Long sommeNotes;

    @Column(name = "nbr_notes")
    private Long nbrNotes;

    public Film() {

    }

    public Film(Long id, String titre, String imageUrl, String genre, String synopsis, LocalDate dateSortie, String realisateur, Long duree, Long sommeNotes, Long nbrNotes) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.titre = titre;
        this.genre = genre;
        this.synopsis = synopsis;
        this.dateSortie = dateSortie;
        this.realisateur = realisateur;
        this.duree = duree;
        this.sommeNotes = sommeNotes;
        this.nbrNotes = nbrNotes;
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

    public void setSommeNotes(Long sommeNotes) {
        this.sommeNotes = sommeNotes;
    }

    public void setNbrNotes(Long nbrNotes) {
        this.nbrNotes = nbrNotes;
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

    public Long getSommeNotes() {
        return sommeNotes;
    }

    public Long getNbrNotes() {
        return nbrNotes;
    }
}
