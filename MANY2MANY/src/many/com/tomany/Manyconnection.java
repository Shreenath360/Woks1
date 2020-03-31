package many.com.tomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Manyconnection {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("MANY2MANY");

		EntityManager em=emf.createEntityManager();

		em.getTransaction( ).begin( );  


		Customer c= new Customer();

			 c.setId(175); 

		c.setName("Ram");
		

		Customer c1= new Customer();

			 c1.setId(215); 

		c1.setName("ravi");

		em.persist(c);
		em.persist(c1);
		
		   ArrayList<Customer> al1=new ArrayList<Customer>();  
		    ArrayList<Customer> al2=new ArrayList<Customer>();  
		          
		        al1.add(c);  
		        al1.add(c1);  
		          
		        al2.add(c);  
		        al2.add(c1);  
		          
		        Cars ca=new Cars(); 
		        ca.setBMW(123);
		        ca.setBenz(456);
		        ca.setAudi(789);
		        ca.setCustomer(al1);
		       
		       
		        Cars ca1=new Cars();  
		        ca1.setBMW(147);
		        ca1.setBenz(258);
		        ca1.setAudi(369);
		        ca1.setCustomer(al2);
		        
		        em.persist(ca);  
		        em.persist(ca1);  
		          
		        em.getTransaction().commit();  
		        em.close();  
		        emf.close();  
		 

	
	}

}
