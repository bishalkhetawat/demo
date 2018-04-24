//reading primitive data
// must handle exception and close in finally
import java.io.*;
public class DataInputStreamDemo {
public static void main(String[] args)throws Exception {
	
	String path="D:/temp/mydata";
	FileInputStream fis=new FileInputStream(path);
	DataInputStream dis=
			new DataInputStream(fis);
	
	
	System.out.println(dis.readInt());
	System.out.println(dis.readUTF());
	System.out.println(dis.readDouble());
	
}
}
