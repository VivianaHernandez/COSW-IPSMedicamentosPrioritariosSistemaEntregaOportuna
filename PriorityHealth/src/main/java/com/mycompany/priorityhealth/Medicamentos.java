package com.mycompany.priorityhealth;
// Generated Sep 4, 2015 12:17:33 PM by Hibernate Tools 4.3.1


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
 * Medicamentos generated by hbm2java
 */
@Entity
@Table(name="Medicamentos"
    ,catalog="cosw2"
)
public class Medicamentos  implements java.io.Serializable {


     private int idMedicamentos;
     private Autorizaciones autorizaciones;
     private OrdenesCompra ordenesCompra;
     private String nombre;
     private String descripcion;
     private String presentacion;
     private Date fechaExpedicion;
     private Date fechaVencimiento;
     private Set medicamentosPorProveedors = new HashSet(0);

    public Medicamentos() {
    }

	
    public Medicamentos(int idMedicamentos, Autorizaciones autorizaciones, OrdenesCompra ordenesCompra) {
        this.idMedicamentos = idMedicamentos;
        this.autorizaciones = autorizaciones;
        this.ordenesCompra = ordenesCompra;
    }
    public Medicamentos(int idMedicamentos, Autorizaciones autorizaciones, OrdenesCompra ordenesCompra, String nombre, String descripcion, String presentacion, Date fechaExpedicion, Date fechaVencimiento, Set medicamentosPorProveedors) {
       this.idMedicamentos = idMedicamentos;
       this.autorizaciones = autorizaciones;
       this.ordenesCompra = ordenesCompra;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.presentacion = presentacion;
       this.fechaExpedicion = fechaExpedicion;
       this.fechaVencimiento = fechaVencimiento;
       this.medicamentosPorProveedors = medicamentosPorProveedors;
    }
   
     @Id 

    
    @Column(name="idMedicamentos", unique=true, nullable=false)
    public int getIdMedicamentos() {
        return this.idMedicamentos;
    }
    
    public void setIdMedicamentos(int idMedicamentos) {
        this.idMedicamentos = idMedicamentos;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Autorizaciones_numero", nullable=false)
    public Autorizaciones getAutorizaciones() {
        return this.autorizaciones;
    }
    
    public void setAutorizaciones(Autorizaciones autorizaciones) {
        this.autorizaciones = autorizaciones;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="OrdenesCompra_idOrdenesCompra", nullable=false)
    public OrdenesCompra getOrdenesCompra() {
        return this.ordenesCompra;
    }
    
    public void setOrdenesCompra(OrdenesCompra ordenesCompra) {
        this.ordenesCompra = ordenesCompra;
    }

    
    @Column(name="nombre", length=45)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="descripcion", length=200)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    @Column(name="presentacion", length=45)
    public String getPresentacion() {
        return this.presentacion;
    }
    
    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="medicamentos")
    public Set getMedicamentosPorProveedors() {
        return this.medicamentosPorProveedors;
    }
    
    public void setMedicamentosPorProveedors(Set medicamentosPorProveedors) {
        this.medicamentosPorProveedors = medicamentosPorProveedors;
    }




}


