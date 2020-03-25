package com.concepts.perf;

import java.util.ArrayList;
import java.util.Iterator;

public class Mainc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Userdefarraylist s1=new Userdefarraylist(101,"Sonoo",23);  
		Userdefarraylist s2=new Userdefarraylist(102,"Ravi",21);  
		Userdefarraylist s3=new Userdefarraylist(103,"Hanumat",25);  
		  //creating arraylist  
		  ArrayList<Userdefarraylist> al=new ArrayList<Userdefarraylist>();  
		  al.add(s1);//adding Student class object  
		  al.add(s2);  
		  al.add(s3);  
		  //Getting Iterator  
		  Iterator itr=al.iterator();  
		  //traversing elements of ArrayList object  
		  while(itr.hasNext()){  
			  Userdefarraylist st=(Userdefarraylist)itr.next();  
		    System.out.println(st.rollno+" "+st.name+" "+st.age);  
		  }  
		 }  
		
	

}
