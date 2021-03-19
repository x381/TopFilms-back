drop table if exists film CASCADE;
drop table if exists account CASCADE;

create table account
(
    id serial,
    username varchar(32),
    password varchar(255),
    email varchar(255),
    photo varchar(255),
    primary key (id)
);

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
    bande_annonce varchar(255),
    primary key (id)
);