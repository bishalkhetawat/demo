import java.io.*;

class Trainee implements Serializable
{
	int roll;
	String name;
	double marks;
}

public class ObjectOutputStreamDemo {

	public static void main(String[] args) throws Exception {
		
		Trainee st=new Trainee();
		st.roll=101;
		st.name="Vishal";
		st.marks=99.3;
		String path="D:/temp/myobject";
		FileOutputStream fos=new FileOutputStream(path);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(st);
		oos.close();
		System.out.println("Object is persisted");
		
		
	}
}
