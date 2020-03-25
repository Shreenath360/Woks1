package com.concepts.perf;

import java.util.ArrayList;
import java.util.Iterator;

public class Retainall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList<String> al=new ArrayList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("jyo");  
		  ArrayList<String> al2=new ArrayList<String>();  
		  al2.add("jyo");  
		  al2.add("Hanumat");  
		  al.retainAll(al2);  
		  System.out.println("iterating the elements after retaining the elements of al2");  
		  Iterator itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
	}

}
