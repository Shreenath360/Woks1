package many.com.toone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Smconnection {
	  public static void main(String[] args) {  
          
	        EntityManagerFactory emf=Persistence.createEntityManagerFactory("MANY2ONE");  
	          
	        EntityManager em=emf.createEntityManager();  
	          
	        em.getTransaction().begin();  
	          
	        Supermarket sup=new Supermarket();  
	        sup.setS_int(147);  
	        sup.setS_name("chocolate");  
	          
	        em.persist(sup);  
	          
	        Mcustomer cust=new Mcustomer();  
	        cust.setM_id(36);  
	        cust.setM_name("shree");  
	        cust.setMarket(sup);
	          
	        Mcustomer cust1=new Mcustomer();  
	        cust1.setM_id(45);  
	        cust1.setM_name("henry");  
	        cust1.setMarket(sup);
	        em.persist(cust);;  
	        em.persist(cust1);  
	          
	          
	        em.getTransaction().commit();  
	        em.close();  
	        emf.close();  
	          
	    }  
	      
	
}
