package example.com.collect;

import java.util.Hashtable;
import java.util.Map;

public class Hashexample{

	public static void main(String[] args) {
Hashtable<Integer,String>hm=new Hashtable<Integer,String>();
hm.put(100, "one");
hm.put(101, "two");
hm.put(102, "three");
hm.put(103, "four");

for(Map.Entry m:hm.entrySet()){  
	   System.out.println(m.getKey()+" "+m.getValue());  
	  }  
	}

}
