package com.klimov.dao;

import com.klimov.domain.Actor;
import org.hibernate.SessionFactory;

public class ActorDAO extends GenericDAO<Actor>{

    public ActorDAO( SessionFactory sessionFactory) {
        super(Actor.class, sessionFactory);
    }
}
