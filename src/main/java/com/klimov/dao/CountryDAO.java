package com.klimov.dao;

import com.klimov.domain.Country;
import org.hibernate.SessionFactory;

public class CountryDAO extends GenericDAO<Country>{
    public CountryDAO(SessionFactory sessionFactory) {
        super(Country.class,sessionFactory);
    }
}
