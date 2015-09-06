package com.mycompany.priorityhealth;
// Generated 6/09/2015 05:42:28 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Despachos generated by hbm2java
 */
@Entity
@Table(name="Despachos"
    ,catalog="cosw2"
)
public class Despachos  implements java.io.Serializable {


     private int idDespacho;
     private Mensajeros mensajeros;
     private Pedidos pedidos;
     private String estado;
     private String numeroPagoCoutaModeradora;

    public Despachos() {
    }

	
    public Despachos(int idDespacho, Mensajeros mensajeros, Pedidos pedidos) {
        this.idDespacho = idDespacho;
        this.mensajeros = mensajeros;
        this.pedidos = pedidos;
    }
    public Despachos(int idDespacho, Mensajeros mensajeros, Pedidos pedidos, String estado, String numeroPagoCoutaModeradora) {
       this.idDespacho = idDespacho;
       this.mensajeros = mensajeros;
       this.pedidos = pedidos;
       this.estado = estado;
       this.numeroPagoCoutaModeradora = numeroPagoCoutaModeradora;
    }
   
     @Id 

    
    @Column(name="idDespacho", unique=true, nullable=false)
    public int getIdDespacho() {
        return this.idDespacho;
    }
    
    public void setIdDespacho(int idDespacho) {
        this.idDespacho = idDespacho;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Mensajeros_idEmpleados", nullable=false)
    public Mensajeros getMensajeros() {
        return this.mensajeros;
    }
    
    public void setMensajeros(Mensajeros mensajeros) {
        this.mensajeros = mensajeros;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Pedidos_idPedidos", nullable=false)
    public Pedidos getPedidos() {
        return this.pedidos;
    }
    
    public void setPedidos(Pedidos pedidos) {
        this.pedidos = pedidos;
    }

    
    @Column(name="estado", length=45)
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    @Column(name="NumeroPagoCoutaModeradora", length=45)
    public String getNumeroPagoCoutaModeradora() {
        return this.numeroPagoCoutaModeradora;
    }
    
    public void setNumeroPagoCoutaModeradora(String numeroPagoCoutaModeradora) {
        this.numeroPagoCoutaModeradora = numeroPagoCoutaModeradora;
    }




}


