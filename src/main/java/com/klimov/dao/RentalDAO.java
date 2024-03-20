package com.klimov.dao;

import com.klimov.domain.Country;
import com.klimov.domain.Rental;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class RentalDAO extends GenericDAO<Rental> {
    public RentalDAO(SessionFactory sessionFactory) {
        super(Rental.class,sessionFactory);
    }

    public Rental getAnyUnreternalRental() {
        Query <Rental> query = getCurrentSession().createQuery(
                "select r from Rental r where r.returnDate is null  "
                  , Rental.class);
        query.setMaxResults(1);
        return query.uniqueResult();
    }
}
