package com.klimov.dao;

import com.klimov.domain.Country;
import com.klimov.domain.Staff;
import org.hibernate.SessionFactory;

public class StaffDAO extends GenericDAO<Staff>{
    public StaffDAO(SessionFactory sessionFactory) {
        super(Staff.class,sessionFactory);
    }
}
