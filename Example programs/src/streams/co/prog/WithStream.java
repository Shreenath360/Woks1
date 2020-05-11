package streams.co.prog;
import java.util.*;  
import java.util.stream.Collectors;  
public class WithStream {
int id;
String name;
float price;
public WithStream(int id, String name, float price)
{
	this.id= id;
	this.name= name;
	this.price= price;
	
}
	public static void main(String[] args) {
List<WithStream> product=new ArrayList<WithStream>();
product.add(new WithStream(1,"HP Laptop",25000));  
product.add(new WithStream(2,"Dell Laptop",30000));  
product.add(new WithStream(3,"Lenevo Laptop",28000));  
product.add(new WithStream(4,"Sony Laptop",28000));  
product.add(new WithStream(5,"Apple Laptop",90000));  
List<Float> productPriceList =  product.stream() 
.filter(p->p.price>30000)
.map(p->p.price)
.collect(Collectors.toList());
System.out.println(productPriceList);

	}

}
