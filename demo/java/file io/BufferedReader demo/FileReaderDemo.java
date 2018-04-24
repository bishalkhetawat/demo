// Reading text data from a file
import java.io.*;

public class FileReaderDemo {
public static void main(String[] args)throws Exception 
{

	String filePath="D:/temp/myfile.txt";
	FileReader fr=new FileReader(filePath);
	
	BufferedReader br=
			new BufferedReader(fr);
	
	System.out.println(br.readLine());
	System.out.println(br.readLine());
	System.out.println(br.readLine());
	System.out.println(br.readLine());
	
	
	
	
}
}
