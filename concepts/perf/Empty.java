package com.concepts.perf;

import java.util.ArrayList;

public class Empty {

	public static void main(String[] args) {
ArrayList<String> sj =new ArrayList<String> ();

System.out.println("is array lis empty:"+sj.isEmpty());
sj.add("ram");
sj.add("janu");
sj.add("jyo");
System.out.println("after insertion");
System.out.println("is array is emppty "+sj.isEmpty());
	}

}
