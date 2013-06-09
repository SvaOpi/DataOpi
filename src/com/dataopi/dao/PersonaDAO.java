/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dataopi.dao;

import com.dataopi.entity.Person;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author Usuario1
 */
public class PersonaDAO extends Dao{
    public Person buscarPorDocumento(int documento,EntityManager em){
        try{
            Query q = (Query) em.createQuery("select p from Person p where p.cedule = :documento");
            q.setParameter("documento", documento);
            return (Person) q.getSingleResult();
        }catch(NoResultException e){
            return null;
        }
    }
}
