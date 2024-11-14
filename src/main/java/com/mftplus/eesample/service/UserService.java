package com.mftplus.eesample.service;

import com.mftplus.eesample.model.User;
import com.mftplus.eesample.utils.Loggable;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Loggable
@ApplicationScoped
public class UserService {
    @PersistenceContext(unitName = "mft")
    private EntityManager entityManager;

    public void save(User user) {
        entityManager.persist(user);
    }
}

