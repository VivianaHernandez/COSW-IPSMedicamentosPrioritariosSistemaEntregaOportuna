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
 * Pedidos generated by hbm2java
 */
@Entity
@Table(name="Pedidos"
    ,catalog="cosw2"
)
public class Pedidos  implements java.io.Serializable {


     private int idPedidos;
     private Pacientes pacientes;
     private Date fechaLlegada;
     private String direccion;
     private Set despachoses = new HashSet(0);
     private Set detallesPedidos = new HashSet(0);

    public Pedidos() {
    }

	
    public Pedidos(int idPedidos, Pacientes pacientes) {
        this.idPedidos = idPedidos;
        this.pacientes = pacientes;
    }
    public Pedidos(int idPedidos, Pacientes pacientes, Date fechaLlegada, String direccion, Set despachoses, Set detallesPedidos) {
       this.idPedidos = idPedidos;
       this.pacientes = pacientes;
       this.fechaLlegada = fechaLlegada;
       this.direccion = direccion;
       this.despachoses = despachoses;
       this.detallesPedidos = detallesPedidos;
    }
   
     @Id 

    
    @Column(name="idPedidos", unique=true, nullable=false)
    public int getIdPedidos() {
        return this.idPedidos;
    }
    
    public void setIdPedidos(int idPedidos) {
        this.idPedidos = idPedidos;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Pacientes_idPacientes", nullable=false)
    public Pacientes getPacientes() {
        return this.pacientes;
    }
    
    public void setPacientes(Pacientes pacientes) {
        this.pacientes = pacientes;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="fechaLlegada", length=10)
    public Date getFechaLlegada() {
        return this.fechaLlegada;
    }
    
    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    
    @Column(name="direccion", length=45)
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="pedidos")
    public Set getDespachoses() {
        return this.despachoses;
    }
    
    public void setDespachoses(Set despachoses) {
        this.despachoses = despachoses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="pedidos")
    public Set getDetallesPedidos() {
        return this.detallesPedidos;
    }
    
    public void setDetallesPedidos(Set detallesPedidos) {
        this.detallesPedidos = detallesPedidos;
    }




}


