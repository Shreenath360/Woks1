package com.concepts.perf;

import java.util.HashSet;
import java.util.Iterator;

public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet <String> hs = new HashSet<String>(); 
hs.add("raj");
hs.add("henry");
hs.add("ram");
hs.add("void");
Iterator<String> itr=hs.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
	
}
	}

}
