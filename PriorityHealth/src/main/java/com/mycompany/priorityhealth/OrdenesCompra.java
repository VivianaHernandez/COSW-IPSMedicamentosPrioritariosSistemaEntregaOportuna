package com.mycompany.priorityhealth;
// Generated 6/09/2015 06:30:10 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * OrdenesCompra generated by hbm2java
 */
@Entity
@Table(name="OrdenesCompra"
    ,catalog="cosw2"
)
public class OrdenesCompra  implements java.io.Serializable {


     private int idOrdenesCompra;
     private Integer cantidad;
     private Set medicamentoses = new HashSet(0);

    public OrdenesCompra() {
    }

	
    public OrdenesCompra(int idOrdenesCompra) {
        this.idOrdenesCompra = idOrdenesCompra;
    }
    public OrdenesCompra(int idOrdenesCompra, Integer cantidad, Set medicamentoses) {
       this.idOrdenesCompra = idOrdenesCompra;
       this.cantidad = cantidad;
       this.medicamentoses = medicamentoses;
    }
   
     @Id 

    
    @Column(name="idOrdenesCompra", unique=true, nullable=false)
    public int getIdOrdenesCompra() {
        return this.idOrdenesCompra;
    }
    
    public void setIdOrdenesCompra(int idOrdenesCompra) {
        this.idOrdenesCompra = idOrdenesCompra;
    }

    
    @Column(name="cantidad")
    public Integer getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="ordenesCompra")
    public Set getMedicamentoses() {
        return this.medicamentoses;
    }
    
    public void setMedicamentoses(Set medicamentoses) {
        this.medicamentoses = medicamentoses;
    }




}


