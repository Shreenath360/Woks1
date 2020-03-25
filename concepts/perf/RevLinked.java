package com.concepts.perf;

import java.util.Iterator;
import java.util.LinkedList;

public class RevLinked {

	public static void main(String[] args) {
LinkedList<String> sa=new LinkedList<String>();
sa.add("sam");
sa.add("vijay");
sa.add("suriya");
Iterator itr= sa.descendingIterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
	
	
	}
	}
}
