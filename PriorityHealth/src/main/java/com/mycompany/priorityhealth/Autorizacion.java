package com.mycompany.priorityhealth;
// Generated 6/09/2015 06:30:10 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Autorizaciones generated by hbm2java
 */
@Entity
@Table(name="Autorizaciones"
    ,catalog="cosw2"
)
public class Autorizacion  implements java.io.Serializable {


     private int numero;
     private Epsafilida epsafilida;
     private Date fechaExpedicion;
     private Date fechaVencimiento;
     private Set<Medicamento> medicamentos = new HashSet(0);

    public Autorizacion() {
    }

	
    public Autorizacion(int numero, Epsafilida epsafilida) {
        this.numero = numero;
        this.epsafilida = epsafilida;
    }
    public Autorizacion(int numero, Epsafilida epsafilida, Date fechaExpedicion, Date fechaVencimiento, Set<Medicamento> medicamentos) {
       this.numero = numero;
       this.epsafilida = epsafilida;
       this.fechaExpedicion = fechaExpedicion;
       this.fechaVencimiento = fechaVencimiento;
       this.medicamentos = medicamentos;
    }
   
     @Id 

    
    @Column(name="numero", unique=true, nullable=false)
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="EPSAfilidas_idEPS", nullable=false)
    public Epsafilida getEpsafilida() {
        return this.epsafilida;
    }
    
    public void setEpsafilida(Epsafilida epsafilida) {
        this.epsafilida = epsafilida;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="fechaExpedicion", length=10)
    public Date getFechaExpedicion() {
        return this.fechaExpedicion;
    }
    
    public void setFechaExpedicion(Date fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="fechaVencimiento", length=10)
    public Date getFechaVencimiento() {
        return this.fechaVencimiento;
    }
    
    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="autorizacion")
    public Set<Medicamento> getMedicamentos() {
        return this.medicamentos;
    }
    
    public void setMedicamentos(Set<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }




}


