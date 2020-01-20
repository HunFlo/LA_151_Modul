/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbbaden.la_151_9925_jpa_fish;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;

/**
 *
 * @author Alexander Flick
 */
@Named(value = "artikelController")
@SessionScoped
public class ArtikelController implements Serializable {
    
    @EJB
    private ArtikelFacade af;
    private Artikel a;

    /**
     * Creates a new instance of ArtikelController
     */
    public ArtikelController() {
    }
    
    public Artikel createA() {
        a = new Artikel();
        return a;
    }
    
    public ArtikelFacade getAf() {
        return af;
    }
    
    public void speichern() {
        af.create(a);
    }
}
