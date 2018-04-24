
public class StringDemo1 {
public static void main(String[] args) {
	
	System.out.println("1"+"2");
	System.out.println("1"+2);
	System.out.println("1"+2+3+"4");
	System.out.println(1+2+"3");
	System.out.println("1"+(2+3)+"4");
	
	String str="Hello and Welcome to CGI";
	System.out.println(str.concat(" Company"));
	System.out.println(str.charAt(0));
	System.out.println(str.charAt(1));
	System.out.println(str.charAt(6));
	int value=str.charAt(5);
	System.out.println(value);
	
	String str2="CGI"; // 67-99
	System.out.println(str2.compareTo("Cpi"));
	
	System.out.println(str2.indexOf("G"));
	System.out.println(str2.contains("IJ"));
	System.out.println(str2.length());
	
	StringBuffer sb=new StringBuffer("CGI is GREAT");
	System.out.println(sb.reverse());
	
	StringBuilder sb2=new StringBuilder("CGI is GREAT");
	System.out.println(sb2.reverse());

	
	// write a program to display individual 
	//characters of a string
	
	for(int i=0;i<str.length();i++)
	{
	
		System.out.println(str.charAt(i));
	}
	
	// print all the words of the string
	
	String arr[]=str.split(" ");
	for(String s:arr)
	{
		System.out.println(s);
	}
	
}
}


/*

ashokthegreat
mohandas
karamchand
gandhi

*/