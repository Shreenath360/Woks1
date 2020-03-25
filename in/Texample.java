package fun.org.in;
import java.io.*;
public class Texample {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
InputStream input = new FileInputStream ("D:\\\\ABD.txt");
DataInputStream inst = new DataInputStream(input);
int count= input.available();
byte[] ary= new byte[count];
inst.read(ary);
	for (byte bt : ary) {  
	char k =(char) bt;
	System.out.println(k+"sucess");


	}

	}
	}
