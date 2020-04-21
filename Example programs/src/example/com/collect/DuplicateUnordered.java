package example.com.collect;

import java.util.HashSet;
import java.util.Iterator;

public class DuplicateUnordered {
public static void main(String[] args) {
	HashSet<String> set= new HashSet<String>();
	set.add("one");
	set.add("three");
	set.add("three");
	set.add("four");
	Iterator<String>itr=set.iterator();
    while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}

} 