package com.klimov.dao;

import com.klimov.domain.Address;
import org.hibernate.SessionFactory;

public class AddressDAO extends GenericDAO<Address> {

    public AddressDAO( SessionFactory sessionFactory) {
        super(Address.class, sessionFactory);
    }
}
