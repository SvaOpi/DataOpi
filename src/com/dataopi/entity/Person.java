package com.dataopi.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;

@Entity
@Table(name = "person")
@Inheritance(strategy= InheritanceType.JOINED)
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cedule;  
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "person")
    private Collection<Pin> pinCollection;

    public long getCedule() {
        return cedule;
    }

    public void setCedule(long cedule) {
        this.cedule = cedule;
    }

    public Collection<Pin> getPinCollection() {
        return pinCollection;
    }

    public void setPinCollection(Collection<Pin> pinCollection) {
        this.pinCollection = pinCollection;
    }
    
}
