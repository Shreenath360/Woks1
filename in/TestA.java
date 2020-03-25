package fun.org.in;

import java.io.FileOutputStream;

public class TestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
FileOutputStream fout=new FileOutputStream("D:\\ABD.txt");
fout.write(67);
fout.close();
}
catch(Exception e)
{System.out.println(e);
}



	}

}
