package com.dataopi.dao;

public final class FactoryDAO {

    
    private FactoryDAO(){}
    
    public static Dao crear(int tipo){
        if(tipo==Dao.PERSONA){
            return new PersonaDAO();
        }else{
            return null;
        }
    }
    
}
