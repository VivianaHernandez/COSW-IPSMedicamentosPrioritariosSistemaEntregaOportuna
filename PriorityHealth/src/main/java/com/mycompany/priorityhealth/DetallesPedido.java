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
 * DetallesPedido generated by hbm2java
 */
@Entity
@Table(name="DetallesPedido"
    ,catalog="cosw2"
)
public class DetallesPedido  implements java.io.Serializable {


     private int idMedicamentos;
     private MedicamentosPorProveedor medicamentosPorProveedor;
     private Pedidos pedidos;
     private String cantidad;

    public DetallesPedido() {
    }

	
    public DetallesPedido(int idMedicamentos, MedicamentosPorProveedor medicamentosPorProveedor, Pedidos pedidos) {
        this.idMedicamentos = idMedicamentos;
        this.medicamentosPorProveedor = medicamentosPorProveedor;
        this.pedidos = pedidos;
    }
    public DetallesPedido(int idMedicamentos, MedicamentosPorProveedor medicamentosPorProveedor, Pedidos pedidos, String cantidad) {
       this.idMedicamentos = idMedicamentos;
       this.medicamentosPorProveedor = medicamentosPorProveedor;
       this.pedidos = pedidos;
       this.cantidad = cantidad;
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
    @JoinColumn(name="MedicamentosPorProveedor_idDetalleCompra", nullable=false)
    public MedicamentosPorProveedor getMedicamentosPorProveedor() {
        return this.medicamentosPorProveedor;
    }
    
    public void setMedicamentosPorProveedor(MedicamentosPorProveedor medicamentosPorProveedor) {
        this.medicamentosPorProveedor = medicamentosPorProveedor;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Pedidos_idPedidos", nullable=false)
    public Pedidos getPedidos() {
        return this.pedidos;
    }
    
    public void setPedidos(Pedidos pedidos) {
        this.pedidos = pedidos;
    }

    
    @Column(name="cantidad", length=45)
    public String getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }




}

