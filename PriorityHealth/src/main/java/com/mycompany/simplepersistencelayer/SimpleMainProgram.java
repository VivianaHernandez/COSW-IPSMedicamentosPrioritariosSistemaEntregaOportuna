
package com.mycompany.simplepersistencelayer;

import com.mycompany.priorityhealth.Despacho;
import com.mycompany.priorityhealth.Mensajero;
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
        
        //SimplePersistenceFacade.operacionASerUtilizada(p1,p2);
        
        tx.commit();
        session.close();
    }
    
}
