package example.com.collect;

import java.util.ArrayList;
import java.util.List;

public class Listintface {
 
public static void main(String[] args) {
	List<String>li=new ArrayList<String>();
		li.add("bad");
		li.add("masd");
		li.add("jka");
		li.add(1,"jshs");
		System.out.println("2nd position:"+li.get(2));
		for(String s:li)
		{
			System.out.println(s);
		}
}
}