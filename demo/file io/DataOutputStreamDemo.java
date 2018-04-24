//To write Primitive type like int, char,float
// Must use try, catch,finally block rather than throwing from main
import java.io.*;
public class DataOutputStreamDemo {
	public static void main(String[] args) throws Exception{
		
		int roll=101;
		String name="Rabish";
		double marks=99.9;
		
		FileOutputStream fos=new FileOutputStream("d:/temp/mydata");
		DataOutputStream dos=new
				DataOutputStream(fos);
		
		dos.writeInt(roll);
		dos.writeUTF(name);
		dos.writeDouble(marks);
		
		System.out.println(" data written");
		dos.close();
		
		
	}
}
