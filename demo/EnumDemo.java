
// used to define a number of Constants
enum WeekDay
{
	SUNDAY,
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY
	
}
public class EnumDemo {
public static void main(String[] args) {
	
	WeekDay w=WeekDay.SUNDAY;
	System.out.println(w);
	
	switch(w)
	{
	case MONDAY :
	 System.out.println("Don't feel like waking up.");
	 break;
	case TUESDAY :
	 System.out.println(" Counting no. of days left till saturday");
	break;
	case WEDNESDAY:
		System.out.println("Waiting for friday..");
		break;
	case THURSDAY:
		System.out.println("Ironing casual dress");
		break;
	case FRIDAY:
		System.out.println("feeling casual and energetic");
		break;
	case SATURDAY:
		System.out.println(" No more energy left..");
		break;
	case SUNDAY:
		System.out.println("SLEEPING.");
		
	}
	
}
}
