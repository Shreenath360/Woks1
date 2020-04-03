package jpa.com.test;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;

public class ONEtoone {
	

	public static void main(String[] args) {

	EntityManagerFactory emf=Persistence.createEntityManagerFactory("ONE2ONE");

	EntityManager em=emf.createEntityManager();

	em.getTransaction( ).begin( );  


	User u= new User();

		 u.setId(175); 

	u.setName("Ram");

	

	User u1= new User();

		 u1.setId(215); 

	u1.setName("ravi");

	

	em.persist(u);

	em.persist(u1);

	

	Card c=new Card();

	c.setVoter_id(1234);

	c.setUser(u);


	em.persist(c);

	em.getTransaction().commit();

	em.close();

	emf.close();

	 

	



}

}