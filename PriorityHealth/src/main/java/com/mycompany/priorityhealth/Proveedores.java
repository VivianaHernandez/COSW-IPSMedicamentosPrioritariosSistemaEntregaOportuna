package com.mycompany.priorityhealth;
// Generated 6/09/2015 06:12:41 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Proveedores generated by hbm2java
 */
@Entity
@Table(name="Proveedores"
    ,catalog="cosw2"
)
public class Proveedores  implements java.io.Serializable {


     private int idProveedores;
     private String nombre;
     private String telefono;
     private String direccion;
     private String pais;
     private Set medicamentosPorProveedors = new HashSet(0);

    public Proveedores() {
    }

	
    public Proveedores(int idProveedores) {
        this.idProveedores = idProveedores;
    }  
    public Proveedores(int idProveedores, String nombre, String telefono, String direccion, String pais, Set medicamentosPorProveedors) {
       this.idProveedores = idProveedores;
       this.nombre = nombre;
       this.telefono = telefono;
       this.direccion = direccion;
       this.pais = pais;
       this.medicamentosPorProveedors = medicamentosPorProveedors;
    }
   
     @Id 

    
    @Column(name="idProveedores", unique=true, nullable=false)
    public int getIdProveedores() {
        return this.idProveedores;
    }
    
    public void setIdProveedores(int idProveedores) {
        this.idProveedores = idProveedores;
    }

    
    @Column(name="nombre", length=45)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="telefono", length=45)
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    @Column(name="direccion", length=45)
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    @Column(name="pais", length=45)
    public String getPais() {
        return this.pais;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="proveedores")
    public Set getMedicamentosPorProveedors() {
        return this.medicamentosPorProveedors;
    }
    
    public void setMedicamentosPorProveedors(Set medicamentosPorProveedors) {
        this.medicamentosPorProveedors = medicamentosPorProveedors;
    }




}


