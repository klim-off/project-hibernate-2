package com.klimov.dao;

import com.klimov.domain.Country;
import com.klimov.domain.Inventory;
import org.hibernate.SessionFactory;

public class InventoryDAO extends GenericDAO<Inventory>{
    public InventoryDAO(SessionFactory sessionFactory) {
        super(Inventory.class,sessionFactory);
    }
}
