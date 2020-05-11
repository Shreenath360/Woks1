package streams.co.prog;

import java.util.*;  
class ProductDet{  
    int id;  
    String name;  
    float price;  
    public ProductDet(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class WithoutStreams {  
    public static void main(String[] args) {  
        List<ProductDet> productsList = new ArrayList<ProductDet>();  
        //Adding Products  
        productsList.add(new ProductDet(1,"HP Laptop",25000f));  
        productsList.add(new ProductDet(2,"Dell Laptop",30000f));  
        productsList.add(new ProductDet(3,"Lenevo Laptop",28000f));  
        productsList.add(new ProductDet(4,"Sony Laptop",28000f));  
        productsList.add(new ProductDet(5,"Apple Laptop",90000f));  
        List<Float> productPriceList = new ArrayList<Float>();  
        for(ProductDet product: productsList){  
              
            // filtering data of list  
            if(product.price>28000){  
                productPriceList.add(product.price);    // adding price to a productPriceList  
            }  
            
        }  
        System.out.println(productPriceList);   // displaying data  
    }  
}  