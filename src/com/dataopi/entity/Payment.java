/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dataopi.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Usuario1
 */
@Entity
@Table(name = "payment")
public class Payment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Temporal(TemporalType.DATE)
    private Date pay;    
    @Temporal(TemporalType.DATE)
    private Date extraPay;
    @Column
    private Double totalValue;    
    @OneToOne
    private Pin pin;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getPay() {
        return pay;
    }

    public void setPay(Date pay) {
        this.pay = pay;
    }

    public Date getExtraPay() {
        return extraPay;
    }

    public void setExtraPay(Date extraPay) {
        this.extraPay = extraPay;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public Pin getPin() {
        return pin;
    }

    public void setPin(Pin pin) {
        this.pin = pin;
    }    
    
}
