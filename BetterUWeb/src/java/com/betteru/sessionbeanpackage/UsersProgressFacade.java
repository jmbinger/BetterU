/*
 * Created by Ojas Mhetar on 2016.04.03  * 
 * Copyright © 2016 Ojas Mhetar. All rights reserved. * 
 */
package com.betteru.sessionbeanpackage;

import com.betteru.sourcepackage.UsersProgress;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ojmhetar
 */
@Stateless
public class UsersProgressFacade extends AbstractFacade<UsersProgress> {

    @PersistenceContext(unitName = "BetterUWebPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsersProgressFacade() {
        super(UsersProgress.class);
    }
    
}
