class A
{
	
	// static attributes are created at the time
	//of class loading before any object is created
	
	static int k=100;
	
	int a; // instance variable
	A (int a) // local variable	
	{
		a++;
	    this.a=a;
		System.out.println(a);
	}
}
public class Test {
public static void main(String[] args) {
	
	int b=2;
	A a =new A(b);
	System.out.println(a.a);
	a.a=7;
  System.out.println(a.a);	
	
  System.out.println(A.k);
	//a.a=3;
	//System.out.println(a);
}
}
