package com.mycompany.priorityhealth;
// Generated 6/09/2015 06:30:10 PM by Hibernate Tools 4.3.1


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

/**
 * Pacientes generated by hbm2java
 */
@Entity
@Table(name="Pacientes"
    ,catalog="cosw2"
)
public class Paciente  implements java.io.Serializable {


     private int idPaciente;
     private Epsafilida epsafilida;
     private String nombre;
     private Integer telefono;
     private String direccion;
     private Set<Pedido> pedidos = new HashSet(0);

    public Paciente() {
    }

	
    public Paciente(int idPaciente, Epsafilida epsafilida) {
        this.idPaciente = idPaciente;
        this.epsafilida = epsafilida;
    }
    public Paciente(int idPaciente, Epsafilida epsafilida, String nombre, Integer telefono, String direccion, Set<Pedido> pedidos) {
       this.idPaciente = idPaciente;
       this.epsafilida = epsafilida;
       this.nombre = nombre;
       this.telefono = telefono;
       this.direccion = direccion;
       this.pedidos = pedidos;
    }
   
     @Id 

    
    @Column(name="idPacientes", unique=true, nullable=false)
    public int getIdPaciente() {
        return this.idPaciente;
    }
    
    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="EPSAfilidas_idEPS", nullable=false)
    public Epsafilida getEpsafilida() {
        return this.epsafilida;
    }
    
    public void setEpsafilida(Epsafilida epsafilida) {
        this.epsafilida = epsafilida;
    }

    
    @Column(name="Nombre", length=45)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="Telefono")
    public Integer getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    
    @Column(name="Direccion", length=50)
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="pacientes")
    public Set<Pedido> getPedidos() {
        return this.pedidos;
    }
    
    public void setPedidos(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
    }




}

