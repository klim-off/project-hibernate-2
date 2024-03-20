package com.klimov.dao;

import com.klimov.domain.Address;
import com.klimov.domain.Category;
import org.hibernate.SessionFactory;

public class CategoryDAO extends GenericDAO<Category> {

    public CategoryDAO( SessionFactory sessionFactory) {
        super(Category.class, sessionFactory);
    }
}
