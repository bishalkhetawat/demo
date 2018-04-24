//Binary IO demo

// muse use try , catch and finally
import java.io.*;
public class FileInputStream_FileOutputStream {
public static void main(String[] args) throws Exception{
	// Program to copy data from one file to another
	
	String sourceFile="D:/temp/myfile.txt";
	String destFile="D:/temp/myfile_copy.txt";
	
	// read from source file
	
	FileInputStream fis=new FileInputStream(sourceFile);
	BufferedInputStream bis=new BufferedInputStream(fis);
	
	//write to destination file
	
	FileOutputStream fos=new FileOutputStream(destFile);
	BufferedOutputStream bos=new BufferedOutputStream(fos);
	
	int ch;
	while((ch=bis.read())!=-1)
	{
		bos.write((char)ch);
	}
	
	bis.close();
	bos.close();
	System.out.println(" File copied ");
	
	
	
}
}
