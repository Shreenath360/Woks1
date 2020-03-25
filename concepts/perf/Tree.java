package com.concepts.perf;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree {

	public static void main(String[] args) {
	
TreeSet<String> tre =new TreeSet<String>();
tre.add("rag");
tre.add("ram");
tre.add("kam");
Iterator<String> itr= tre.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
	}

}
}