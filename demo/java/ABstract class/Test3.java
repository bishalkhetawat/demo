/********** 
 * 
 * Abstract class is a general class
 * Holds general behaviour for child classes
 * Used in inheritance
 * @author sarbanandab
 *Abstract class can have both concrete
 *as well as abstract method
 *abstract methods are those who donot
 *have body , only signature
 *signature: access specifiers ,return type ,method name ,parameters
 * abstract methods can be writtein only
 * inside abstract class or interface
 * interface methods are by default abstract
 * 
 *
 */



 abstract class Bike
{
     //concrete method
	 public void start()
	{
		// logic of start
		 System.out.println("Bike starts");
	}
	public void stop()
	{
		// logic of stops
		System.out.println("Bike Stops");
		
	}
	 
	
	
	
}

 class HondaActiva extends Bike
 {	
	  void burningFuel()
	 {
	System.out.println("Honda Activa is buring fuel");	 
	 }
	
	 public void start()
	 {
		 System.out.println("Honda Activa Starts ");
	 }
	 
	 public void specialTechnology()
	 {
		 System.out.println(" HET");
	 }
	 final int speed=60;
	 
 }
 
public class Test3 {

	public static void main(String[] args) {
		
	
		final int num=20;
		num=25;
		
		final HondaActiva a=new HondaActiva();
		a.speed=40;
		a=new HondaActiva();
		
		
	}
}
