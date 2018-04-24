
/*****
 * 
 * Wrapper Class used to wrap primitive values in object
 * Object representation of primitive values
 * @author sarbanandab
 *
 */
public class WrapperDemo {

	public static void main(String[] args) {
		
		int a=10; // variable of int type
		Integer b=new Integer(20); // integer object
		
		System.out.println(a);
		System.out.println(b);
		
		
		// Autoboxing
		int d=40; // primitive variable
		Integer c=new Integer(d);
		Integer e=d; // autoboxing
		
		// autounboxing
		
		int k=b; // automatically unbox value of b(object)
		// and stores in k(primitive varaible)
		
		// Numeric Wrapper Classes
		
		Integer num1=new Integer(33);
		byte bb=43;
		Byte num2=new Byte(bb);
		
		Float num23=new Float(434.3f);
		Double num3=new Double(433434.43434);
		Long num4=new Long(434343L);
		//Short num5=new Short(43434s);
		
		// Non numeric Wrapper classes
		
		Character ch=new Character('j');
		Boolean bol=new Boolean(true);
		
		boolean b5=true;
		
		
		
		
		 Number num8=new Integer(33);
	//	 Number num9=new Boolean(false); // Number is not a base class of Boolean
		 
		// Number num10=new Number(); Number is abstract
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
