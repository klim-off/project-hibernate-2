package com.klimov.dao;

import com.klimov.domain.Country;
import com.klimov.domain.Film;
import org.hibernate.SessionFactory;

public class FilmDAO extends GenericDAO<Film> {
    public FilmDAO(SessionFactory sessionFactory) {
        super(Film.class,sessionFactory);
    }
}
