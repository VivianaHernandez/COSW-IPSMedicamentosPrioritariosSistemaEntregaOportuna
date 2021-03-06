package com.mycompany.priorityhealth;
// Generated 6/09/2015 06:30:10 PM by Hibernate Tools 4.3.1


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
public class Despacho  implements java.io.Serializable {


     private int idDespacho;
     private Mensajero mensajero;
     private Pedido pedido;
     private String estado;
     private String numeroPagoCoutaModeradora;

    public Despacho() {
    }

	
    public Despacho(int idDespacho, Mensajero mensajero, Pedido pedido) {
        this.idDespacho = idDespacho;
        this.mensajero = mensajero;
        this.pedido = pedido;
    }
    public Despacho(int idDespacho, Mensajero mensajero, Pedido pedido, String estado, String numeroPagoCoutaModeradora) {
       this.idDespacho = idDespacho;
       this.mensajero = mensajero;
       this.pedido = pedido;
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
    public Mensajero getMensajero() {
        return this.mensajero;
    }
    
    public void setMensajero(Mensajero mensajero) {
        this.mensajero = mensajero;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Pedidos_idPedidos", nullable=false)
    public Pedido getPedidos() {
        return this.pedido;
    }
    
    public void setPedidos(Pedido pedido) {
        this.pedido = pedido;
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


