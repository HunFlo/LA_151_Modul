/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbbaden.la_151_9925_jpa_fish;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alexander Flick
 */
@Stateless
public class ArtikelFacade extends AbstractFacade<Artikel> {

    @PersistenceContext(unitName = "ch.bbbaden_LA_151_9925_JPA_Fish_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ArtikelFacade() {
        super(Artikel.class);
    }
    
}
