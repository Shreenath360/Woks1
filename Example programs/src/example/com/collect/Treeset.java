package example.com.collect;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
TreeSet<String> tre=new TreeSet();		
tre.add("one");
tre.add("two");
tre.add("three");
tre.add("four");
Iterator<String>itr=tre.descendingIterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
	}

}
