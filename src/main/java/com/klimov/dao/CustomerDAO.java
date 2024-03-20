package com.klimov.dao;

import com.klimov.domain.Country;
import com.klimov.domain.Customer;
import org.hibernate.SessionFactory;

public class CustomerDAO extends GenericDAO<Customer> {
    public CustomerDAO(SessionFactory sessionFactory) {
        super(Customer.class,sessionFactory);
    }
}
