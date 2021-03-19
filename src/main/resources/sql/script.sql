drop table if exists film CASCADE;

CREATE TABLE film
(
    id serial,
    titre varchar(255),
    image_url varchar(255),
    genre varchar(255),
    description varchar(255),
    date_sortie date,
    realisateur varchar(255),
    duree int,
    primary key (id)
);