import java.io.*;
import java.util.*;

// Write character data to a file
public class FileWriterDemo {
public static void main(String[] args) {
	
	
	FileWriter fw=null;
	
	try
	{
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter text:");
     String text=sc.nextLine();
     
	String fileName="D:/temp/myfile.txt";
	fw=new FileWriter(fileName,true);
	
	fw.write(text);
	System.out.println("written");
	
	
	}
	catch(IOException e)
	{
		System.out.println(e);
	}
	finally
	{
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
}
