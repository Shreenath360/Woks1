package fun.org.in;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try {  
	            FileWriter w = new FileWriter("output.txt");  
	            String content = "I love my country";  
	            w.write(content);  
	            w.close();  
	            System.out.println("Done");  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
	}

}
