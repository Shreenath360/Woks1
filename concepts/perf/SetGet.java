	package com.concepts.perf;

import java.util.ArrayList;

public class SetGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al=new ArrayList<String>();
al.add("ram");
al.add("shree");
al.add("sj");
System.out.println("before set"+al.get(1));
al.set(1, "jyo");
System.out.println("after set"+al.get(1));
	}

}
