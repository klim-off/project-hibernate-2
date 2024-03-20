package com.klimov.dao;

import com.klimov.domain.Country;
import com.klimov.domain.Language;
import org.hibernate.SessionFactory;

public class LanguageDAO extends GenericDAO<Language>{
    public LanguageDAO(SessionFactory sessionFactory) {
        super(Language.class,sessionFactory);
    }
}
