// Reading text data from a file
import java.io.*;

public class FileReaderDemo {
public static void main(String[] args)throws Exception 
{

	String filePath="D:/temp/myfile.txt";
	FileReader fr=new FileReader(filePath);
	int ch;
	while((ch=fr.read())!=-1)
	{
		System.out.print((char)ch);
	}
	
}
}
