package com.concepts.perf;

import java.util.LinkedList;

public class LinkListAddElemnts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ad=new LinkedList<String>();
		System.out.println("before list of elements");
		ad.add("shree");
		ad.add("henry");
		ad.add("jj");
		ad.add("sj");
		System.out.println("after add elements"+ad);
		ad.add(1, "chris");
		System.out.println("after adding one more element"+ad);
		LinkedList<String> adl=new LinkedList<String>();
		adl.add("abraham");
		adl.add("benjamin");
		System.out.println("after two more elements"+adl);
		ad.addAll(adl);	
		System.out.println("net elements"+ad);
		LinkedList<String> adl1=new LinkedList<String>();
		adl1.add("devillers");
		adl1.add("daniel");
		ad.addAll(1,adl1);
	}

}
