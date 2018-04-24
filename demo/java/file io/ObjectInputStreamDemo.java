import java.io.*;
// Obejct input Stream demo , reading object
//deserialization
// must handle exception in try catch and close in finally

class Trainee
{
	int roll;
	String name;
	double marks;
}
public class ObjectInputStreamDemo {

	public static void main(String[] args)throws Exception {
		
		String source="d:/temp/myobject";
		FileInputStream fis=new FileInputStream(source);
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Trainee t=(Trainee)ois.readObject();
		System.out.println(t.roll);
		System.out.println(t.name);
		System.out.println(t.marks);
		
		
		
		
	}
}
