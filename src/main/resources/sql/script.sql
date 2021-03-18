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

insert into film values (1, 'test', '2020-02-02', 'simon', 192);
insert into film values (2, 'test', '2020-02-02', 'arthur', 180);
insert into film values (3, 'test', '2020-02-02', 'remy', 122);