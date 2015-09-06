package com.mycompany.priorityhealth;
// Generated 6/09/2015 06:12:41 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ContratosId generated by hbm2java
 */
@Embeddable
public class ContratosId  implements java.io.Serializable {


     private int idContratos;
     private int epsafilidasIdEps;

    public ContratosId() {
    }

    public ContratosId(int idContratos, int epsafilidasIdEps) {
       this.idContratos = idContratos;
       this.epsafilidasIdEps = epsafilidasIdEps;
    }
   


    @Column(name="idContratos", nullable=false)
    public int getIdContratos() {
        return this.idContratos;
    }
    
    public void setIdContratos(int idContratos) {
        this.idContratos = idContratos;
    }


    @Column(name="EPSAfilidas_idEPS", nullable=false)
    public int getEpsafilidasIdEps() {
        return this.epsafilidasIdEps;
    }
    
    public void setEpsafilidasIdEps(int epsafilidasIdEps) {
        this.epsafilidasIdEps = epsafilidasIdEps;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ContratosId) ) return false;
		 ContratosId castOther = ( ContratosId ) other; 
         
		 return (this.getIdContratos()==castOther.getIdContratos())
 && (this.getEpsafilidasIdEps()==castOther.getEpsafilidasIdEps());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdContratos();
         result = 37 * result + this.getEpsafilidasIdEps();
         return result;
   }   


}


