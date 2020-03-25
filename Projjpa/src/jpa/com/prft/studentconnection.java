package jpa.com.prft;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class studentconnection { 
    public static void main(String args[])  
    {  
          
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("Projjpa");  
        EntityManager em=emf.createEntityManager();  
          
em.getTransaction().begin();  
          
        Studentjpa s1=new Studentjpa();  
        s1.setS_id(101);  
        s1.setS_name("Gaurav");  
        s1.setS_age(24);  
          
        Studentjpa s2=new Studentjpa();  
        s2.setS_id(102);  
        s2.setS_name("Ronit");  
        s2.setS_age(22);  
          
        Studentjpa s3=new Studentjpa();  
        s3.setS_id(103);  
        s3.setS_name("Rahul");  
        s3.setS_age(26);  
          
        em.persist(s1);  
        em.persist(s2);  
        em.persist(s3);       
  
em.getTransaction().commit();  
        em.close();
        emf.close();  
          
          
    }  
}  
