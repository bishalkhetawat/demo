class Student
{
	int empId; // separate memory alloocated for each student object
	static String trainer; // all student instance share the same memory for trainer
	// static member belongs to the whole class
	//static variables are also called as Class variables
	// non static attributes belong to object.their values vary from object to object
}

public class UseOfWrapper {

	
	public static void swap(Object a ,Object b)
	{
		
	}
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		s1.empId=5353;
		s2.empId=645645;
		
		// Without creating object static members can be accessible through the class name
		// Static member accessible through class name
		Student.trainer="Sarba";
		
		
		System.out.println(s1.empId);
		System.out.println(s2.empId);
		s1.trainer="Bala";
		System.out.println(s1.trainer);
		System.out.println(s2.trainer);
		
		
		
		
		
		swap(3,5);// error
		swap("world","hello");
		swap(43.43,54356);
		swap(s1,s2);
		
		
		
		
		
		
	}
}
