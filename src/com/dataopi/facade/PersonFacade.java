package com.dataopi.facade;

import com.dataopi.servicio.PersonaServicio;
import com.dataopi.entity.Person;

public class PersonFacade extends Fachada{
     
    private PersonaServicio personaServicio;
    
    public PersonFacade(){
        personaServicio = new PersonaServicio();
    }
    
    public String crearPersona(Person vo){
        String resultado = "";
        try{
            abrirConexion();
            if(false){//personaServicio.buscarPorDocumento((int) vo.getCedule(), em)!= null){
                resultado = "Usuario ya registrado";
            }else{
                personaServicio.crearPersona(vo, em);
                resultado = "Creado";
                et.commit();
            }
        }catch(Exception e){
            e.printStackTrace();
            hacerRollback();
            resultado = "Error";
        }finally{
            cerrarConexion();
            return resultado;
        }
    }
    
}