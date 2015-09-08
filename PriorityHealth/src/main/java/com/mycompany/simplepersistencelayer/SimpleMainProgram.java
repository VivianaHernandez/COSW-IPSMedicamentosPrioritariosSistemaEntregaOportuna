
package com.mycompany.simplepersistencelayer;

import com.mycompany.priorityhealth.Despacho;
import com.mycompany.priorityhealth.Medicamento;
import com.mycompany.priorityhealth.Mensajero;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class SimpleMainProgram {
    
    public static void main(String a[]){
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(
        configuration.getProperties()).buildServiceRegistry();
        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        
        
        Session session=sessionFactory.openSession();        
        Transaction tx=session.beginTransaction();
        //SimplePersistenceFacade.registrarSolicitudesMedicamento(session,79571373, 1922);
        
       //registrarOrdenCompraPrueba(session);
        
        tx.commit();
        session.close();
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////
    
    public static void registrarOrdenCompraPrueba(Session session)
    {
      Query q1=session.createQuery("Select m from Medicamento m");
      List<Medicamento> lista1=q1.list();
      /*  
      int identificadoresmedicamentos[]= new int[2];
      identificadoresmedicamentos[0]=lista1.get(0).getIdMedicamento();
      identificadoresmedicamentos[1]=lista1.get(1).getIdMedicamento();
      
      //System.out.println("prueba..............."+identificadoresmedicamentos[1]);
      
      int cantidades[]=new int[2];
      cantidades[0]=3;
      cantidades[1]=5;
      
      Date fecha=new Date(2015-05-15);
        
     //SimplePersistenceFacade.registrarNuevaOrdenDeCompra(session, identificadoresmedicamentos, cantidades, fecha);
    */
    }
}   
