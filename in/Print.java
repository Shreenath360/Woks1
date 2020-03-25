package fun.org.in;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Print {

	public static void main(String[] args) throws IOException {
		  FileOutputStream fout=new FileOutputStream("D:\\ABD.txt ");    
		   PrintStream pout=new PrintStream(fout);    
		   pout.println(2016);    
		   pout.println("Hello Java");    
		   pout.println("Welcome to Java");    
		   pout.close();    
		   fout.close();    
		  System.out.println("Success?");  
	}

}
