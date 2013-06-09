/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dataopi.servicio;

import com.dataopi.dao.PersonaDAO;
import com.dataopi.dao.Dao;
import com.dataopi.dao.FactoryDAO;
import com.dataopi.entity.Person;
import javax.persistence.EntityManager;

/**
 *
 * @author Usuario1
 */
public class PersonaServicio {

    public Person buscarPorDocumento(int documento, EntityManager em){
        PersonaDAO dao = (PersonaDAO) FactoryDAO.crear(Dao.PERSONA); 
        Person entity = dao.buscarPorDocumento(documento, em);
        if (entity == null) {return null;}
        return entity;
    }   
    
    public void crearPersona(Person vo, EntityManager em) {
        Person persona = vo;
        Dao dao = FactoryDAO.crear(Dao.PERSONA);
        dao.persist(persona, em);
    }
    
}
