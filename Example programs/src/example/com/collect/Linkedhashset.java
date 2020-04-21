package example.com.collect;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashset {

	public static void main(String[] args) {
LinkedHashSet<String>lset=new LinkedHashSet<String>();
lset.add("one");
lset.add("two");
lset.add("three");
lset.add("four");
lset.add("five");							
Iterator<String>litr=lset.iterator();
while(litr.hasNext())
{
	System.out.println(litr.next());
}

	}

}
