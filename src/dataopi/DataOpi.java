/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataopi;

import com.dataopi.entity.Person;
import com.dataopi.facade.Fachada;
import com.dataopi.facade.PersonFacade;

/**
 *
 * @author Usuario1
 */
public class DataOpi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonFacade fachada = new PersonFacade();
        Person p = new Person();
        p.setCedule(1);
        p.setPinCollection(null);
        System.out.println(fachada.crearPersona(p));
        
        
    }
}
