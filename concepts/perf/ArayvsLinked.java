package com.concepts.perf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArayvsLinked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al12=new ArrayList<String>();
al12.add("shree");
al12.add("Sh");
al12.add("shr");
System.out.println("arraylist"+al12);
LinkedList<String>li12=new LinkedList<String>();
li12.add("abc");
li12.add("cbv");
li12.add("sad");
System.out.println("linkedlist"+li12);
Iterator<String> itr=li12.descendingIterator();
while(itr.hasNext())
	{
	System.out.print(itr.next());
	}
	}


	}


