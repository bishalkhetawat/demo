import java.io.*;
public class FileDemo1 {
public static void main(String[] args)throws IOException
{
	
		//only a path object created
	//File f=new File("D:/temp/cgib2.html");
	// auctual file created
	//f.createNewFile();
	
	File f2=new File("D:/temp/CGI_FOLDER");
	f2.mkdir(); // creates a folder
	
	// creates a new file with name myfile in the folder D:/temp/CGI_FOLDER
	File f3=new File("D:/temp/CGI_FOLDER/myfile.html");
	f3.createNewFile();
	
	// creates a new file with name cgifile in the folder D:/temp/CGI_FOLDER
	File f4=new File(f2,"cgifile.html");
	f4.createNewFile();
	
	
	//f2.delete();
	
	System.out.println("folder created");
	//f.renameTo(f2);
	
	
	//System.out.println("File created");
		
	
	
	
	FileWriter fw=new FileWriter(f4);
	fw.write("<html><body bgcolor='yellow'><marquee><h1> I enjoy programming</h1></marquee>"
			+ "<img src=gatesquotes1.jpg height=500 width=500>"
			+"<embed src=D:/movies/worldwar.mp4 height=500 width=500></embed>"
			+ "</body></html>");
	
	fw.flush();
	System.out.println("enjoy opening the html file cgifile");
	
	
	
	

}
}
