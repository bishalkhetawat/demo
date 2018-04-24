
import java.util.*;
public class DateDemo {
public static void main(String[] args) {
	
	Date d=new Date();
	d.setDate(4);
	d.setMonth(12);
	d.setYear(1989);
	
	d.setHours(12);
	d.setMinutes(30);  // depricated
	
	System.out.println(d);
	
	// creates a Gregorian Calendar implementation
	Calendar c=new GregorianCalendar();	
	System.out.println(c);
	
	
	
	
	// Creates a simple calendar instance	
	Calendar cal=Calendar.getInstance();
	cal.setTime(new Date());
	System.out.println("Calendar date "+cal.getTime());
	
	  
	cal.add(Calendar.YEAR, 5);
	
	System.out.println("Calendar date "+cal.getTime());
}
}
