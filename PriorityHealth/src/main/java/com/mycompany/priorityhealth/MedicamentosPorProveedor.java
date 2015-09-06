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
 * MedicamentosPorProveedor generated by hbm2java
 */
@Entity
@Table(name="MedicamentosPorProveedor"
    ,catalog="cosw2"
)
public class MedicamentosPorProveedor  implements java.io.Serializable {


     private int idDetalleCompra;
     private Medicamentos medicamentos;
     private Proveedores proveedores;
     private Integer idProveedores;
     private Integer idMedicamentos;
     private String precio;
     private Set detallesPedidos = new HashSet(0);
     private Set inventarios = new HashSet(0);

    public MedicamentosPorProveedor() {
    }

	
    public MedicamentosPorProveedor(int idDetalleCompra, Medicamentos medicamentos, Proveedores proveedores) {
        this.idDetalleCompra = idDetalleCompra;
        this.medicamentos = medicamentos;
        this.proveedores = proveedores;
    }
    public MedicamentosPorProveedor(int idDetalleCompra, Medicamentos medicamentos, Proveedores proveedores, Integer idProveedores, Integer idMedicamentos, String precio, Set detallesPedidos, Set inventarios) {
       this.idDetalleCompra = idDetalleCompra;
       this.medicamentos = medicamentos;
       this.proveedores = proveedores;
       this.idProveedores = idProveedores;
       this.idMedicamentos = idMedicamentos;
       this.precio = precio;
       this.detallesPedidos = detallesPedidos;
       this.inventarios = inventarios;
    }
   
     @Id 

    
    @Column(name="idDetalleCompra", unique=true, nullable=false)
    public int getIdDetalleCompra() {
        return this.idDetalleCompra;
    }
    
    public void setIdDetalleCompra(int idDetalleCompra) {
        this.idDetalleCompra = idDetalleCompra;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Medicamentos_idMedicamentos", nullable=false)
    public Medicamentos getMedicamentos() {
        return this.medicamentos;
    }
    
    public void setMedicamentos(Medicamentos medicamentos) {
        this.medicamentos = medicamentos;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Proveedores_idProveedores", nullable=false)
    public Proveedores getProveedores() {
        return this.proveedores;
    }
    
    public void setProveedores(Proveedores proveedores) {
        this.proveedores = proveedores;
    }

    
    @Column(name="idProveedores")
    public Integer getIdProveedores() {
        return this.idProveedores;
    }
    
    public void setIdProveedores(Integer idProveedores) {
        this.idProveedores = idProveedores;
    }

    
    @Column(name="idMedicamentos")
    public Integer getIdMedicamentos() {
        return this.idMedicamentos;
    }
    
    public void setIdMedicamentos(Integer idMedicamentos) {
        this.idMedicamentos = idMedicamentos;
    }

    
    @Column(name="Precio", length=45)
    public String getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(String precio) {
        this.precio = precio;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="medicamentosPorProveedor")
    public Set getDetallesPedidos() {
        return this.detallesPedidos;
    }
    
    public void setDetallesPedidos(Set detallesPedidos) {
        this.detallesPedidos = detallesPedidos;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="medicamentosPorProveedor")
    public Set getInventarios() {
        return this.inventarios;
    }
    
    public void setInventarios(Set inventarios) {
        this.inventarios = inventarios;
    }




}


