package com.mycompany.simplepersistencelayer;

import com.mycompany.priorityhealth.DetallesOrdenComptaId;
import com.mycompany.priorityhealth.DetallesPedido;
import com.mycompany.priorityhealth.Medicamento;
import com.mycompany.priorityhealth.MedicamentosPorProveedor;
import com.mycompany.priorityhealth.OrdenesCompra;
import com.mycompany.priorityhealth.Paciente;
import com.mycompany.priorityhealth.Pedido;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.Query;
import org.hibernate.Session;


public class SimplePersistenceFacade {
    
    /*=)=)=)=)=)=)=)=)=)=)=*No interferir en el codigo de los demas Gracias=)=)=)=)=)=)=)=)=)*/
    
    /*--------------------------------------------------------------------------
    ----------------------------------------------------------------------------
    * Nombre metodo:Registrar Nueva orden De Compra
    * Objetivo Metodo: Registrar una nueva orden de compra y registrar la recepción 
    de dichos medicamentos
    * Parametros:  Conjunto de idmedicamentos, cantidades,fecha e identificacion respectiva
    --------------------------------------------------------------------------*/
    public static void registrarNuevaOrdenDeCompra(Session s, int[] identificadoresmedicamentos, int[] cantidades, Date fecha)
    {  
           /*Registrar una nueva ordenDE Compra*/
           OrdenesCompra ordenCompra=new OrdenesCompra(fecha);
           s.save(ordenCompra);
       
           int idenMedicamento=identificadoresmedicamentos[0];
           int cantidad=cantidades[0];
           Set<DetallesOrdenComptaId> almDetallesPedidos = new HashSet<DetallesOrdenComptaId>();
           DetallesOrdenComptaId dpid;
           
           for(int i=0;i<identificadoresmedicamentos.length;i++)
           {
           idenMedicamento=identificadoresmedicamentos[i];
           cantidad=cantidades[i];
           dpid=new DetallesOrdenComptaId(idenMedicamento,ordenCompra.getIdOrdenesCompra(),cantidad);
           s.save(dpid);
           } 
           ordenCompra.setDetallesOrdenComtaId(almDetallesPedidos);
           s.update(ordenCompra);
           
           /*Registrar REcepcion de dichos Medicamentos*/
           
    
    }
    
    /*--------------------------------------------------------------------------
    ----------------------------------------------------------------------------
    * Nombre metodo:
    * Objetivo Metodo:
    * Parametros:  
    --------------------------------------------------------------------------*/
    public static void registrarSolicitudesMedicamento(Session s, int idPaciente, int idMedicamento)
    {
        /*Query q = s.createQuery("select p from Paciente p where p.idPaciente=:idpaciente");
        q.setInteger("idpaciente", idPaciente);
        List<Paciente> res = q.list();
        Pedido p = new Pedido(1533899,res.get(0));
        p.setDireccion("cll 53 B # 55A- 42");
        p.setFechaLlegada(new Date(2015-05-02));
        Pedido p1 = new Pedido(1533799,res.get(0));
        p1.setDireccion("cll 50 B # 55- 32");
        p1.setFechaLlegada(new Date(2015-05-02));
        Pedido p2 = new Pedido(1543899,res.get(0));
        p2.setDireccion("cll 56 B # 65- 94");
        p2.setFechaLlegada(new Date(2015-05-02));
        s.save(p);
        s.save(p1);
        s.save(p2);
        q=s.createQuery("select m from MedicamentosPorProveedor m where m.idMedicamento=:idmedicamento");
        q.setInteger("idmedicamento", idMedicamento);
        List<MedicamentosPorProveedor> mpp=q.list();
        DetallesPedido dp=new DetallesPedido(123, mpp.get(0), p,5);
         s.save(dp);
         DetallesPedido dp1=new DetallesPedido(456, mpp.get(0), p1,5);
         s.save(dp1);
         DetallesPedido dp2=new DetallesPedido(789, mpp.get(0), p2,5);
         s.save(dp2);
         DetallesPedido dp3=new DetallesPedido(70, mpp.get(0), p2,5);
         s.save(dp3);
        q=s.createQuery("select pe from Paciente p inner join p.pedidos as pe  where p.idPaciente=:idpaciente");
        q.setInteger("idpaciente", idPaciente);
        List<Pedido> res1 = q.list();
        List<DetallesPedido> res2 ;List<Pedido> res3 ;List<Pedido> pedidos = new ArrayList<Pedido>();
        int suma=0;
        for (int i = 0; i < res1.size(); i++) {
            q=s.createQuery("select dp from Pedido p inner join p.detallesPedidos as dp where dp.cantidad>0 and p.idPedido=:idpedido ");
            q.setInteger("idpedido", res1.get(i).getIdPedido());
            res2= q.list();
            q=s.createQuery("select p from Pedido p inner join p.detallesPedidos as dp where dp.cantidad>0 and p.idPedido=:idpedido ");
            q.setInteger("idpedido", res1.get(i).getIdPedido());
            res3= q.list();
            if(res2.size()>0){
                suma++;
                res2.get(0).setCantidad((res2.get(0).getCantidad())-1);
            }
        }suma--;*/
    /*Tatiana*/
    }
    
    /*--------------------------------------------------------------------------
    ----------------------------------------------------------------------------
    * Nombre metodo: registrarEntregaMedicamento
    * Objetivo Metodo: 
    * Parametros:    
    --------------------------------------------------------------------------*/
    public static void  registrarEntregaMedicamento()
    {
         
    /*Leidy*/
    }
    
    /*--------------------------------------------------------------------------
    ----------------------------------------------------------------------------
    * Nombre metodo:
    * Objetivo Metodo:
    * Parametros:  
    --------------------------------------------------------------------------*/
     public static void asignarMedicamento()
    {
      /*Marcos*/   
    
    }
        
	
}
