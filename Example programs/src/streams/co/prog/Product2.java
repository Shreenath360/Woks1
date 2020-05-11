package streams.co.prog;

import java.util.ArrayList;
import java.util.List;
class Product1{
String name;
int g_id;
float price;
public Product1(int g_id, String name, float price) 
{
	this.name=name;
	this.g_id=g_id;
	this.price=price;
}	
}

public class Product2 {

	public static void main(String[] args) {
		  List<Product2> productsList = new ArrayList<Product2>();  
	        //Adding Products  
	        productsList.add(new Product1(1,"HP Laptop",25000f));  
	        productsList.add(new Product1(2,"Dell Laptop",30000f));  
	        productsList.add(new Product1(3,"Lenevo Laptop",28000f));  
	        productsList.add(new Product1(4,"Sony Laptop",28000f));  
	        productsList.add(new Product1(5,"Apple Laptop",90000f));  
	        productsList.stream()  
	                             .filter(product2 -> product2.price == 30000)  
	                             .forEach(product2 -> System.out.println(product2.name));    
	}

}
