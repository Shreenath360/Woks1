package example.com.collect;

import java.util.HashSet;

public class Removing {

	public static void main(String[] args) {
HashSet<String> list=new HashSet(); 
list.add("one");
list.add("two");
list.add("three");
list.add("four");
System.out.println("initial list of names:"+list);
list.remove("two");
System.out.println("after the invoking remove:"+list);
HashSet<String>list1=new HashSet<String>();
list1.add("five");
list1.add("six");
list.addAll(list1);
System.out.println("update the list"+list);
	}

}
