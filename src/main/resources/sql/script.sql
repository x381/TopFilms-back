drop table if exists film CASCADE;

create table film
(
    id serial,
    titre varchar(255),
    image_url varchar(255),
    genre varchar(255),
    synopsis text,
    date_sortie date,
    realisateur varchar(255),
    duree int,
    somme_notes int,
    nbr_notes int,
    primary key (id)
);