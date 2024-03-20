package com.klimov.dao;

import com.klimov.domain.Country;
import com.klimov.domain.FilmText;
import org.hibernate.SessionFactory;

public class FilmTextDAO extends GenericDAO<FilmText> {
    public FilmTextDAO(SessionFactory sessionFactory) {
        super(FilmText.class,sessionFactory);
    }
}
