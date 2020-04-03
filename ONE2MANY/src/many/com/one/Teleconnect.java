package many.com.one;

import java.util.ArrayList;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;

public class Teleconnect {


	public static void main(String[]args)

	{

	EntityManagerFactory emf= Persistence.createEntityManagerFactory("ONE2MANY");	

	EntityManager em=emf.createEntityManager();

	 em.getTransaction().begin();

	 

	 Channel c=new Channel();

	 c.setC_id_(755);

	 c.setC_name("sun tv");

	 em.persist(c);

	 Channel c1=new Channel();

	 c1.setC_id_(757);

	 c1.setC_name("KTv");

	 em.persist(c1);

	 ArrayList<Channel> list=new ArrayList<Channel>();

     list.add(c);

     list.add(c1);

       

	 

	 Televission t=new Televission();

	 t.setId(111);

	 t.setChan(list);

	 em.persist(t);

	 em.getTransaction().commit();

	 em.close();

	 emf.close();

	 

	}



}