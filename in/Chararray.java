package fun.org.in;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Chararray {

	public static void main(String[] args) throws IOException {
CharArrayWriter out =new CharArrayWriter();
	out.write("welcome to javatpoint");
	FileWriter f1=new FileWriter("D:\\ABD.txt");
	FileWriter f2=new FileWriter("D:\\ABD.txt");
	FileWriter f3=new FileWriter("D:\\ABD.txt");
	FileWriter f4=new FileWriter("D:\\ABD.txt");
	out.writeTo(f1);
	out.writeTo(f2);
	out.writeTo(f3);
	out.writeTo(f4);
	f1.close();
	f2.close();
	f3.close();
	f4.close();
System.out.println("sucess");
	}
	

}
