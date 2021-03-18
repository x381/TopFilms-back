drop table if exists film CASCADE;

CREATE TABLE film
(
    id int not null,
    titre varchar(255),
    date_sortie date,
    realisateur varchar(255),
    duree int,
    primary key (id)
);