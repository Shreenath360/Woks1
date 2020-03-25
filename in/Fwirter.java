package fun.org.in;

import java.io.FileWriter;

public class Fwirter {

	public static void main(String[] args) {
        try{    
            FileWriter fw=new FileWriter("D:\\ABD.txt");    
            fw.write("65");    
            fw.close();    
           }catch(Exception e){System.out.println(e);}    
           System.out.println("Success...");    

	}

}
