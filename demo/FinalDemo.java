/************
 * 
 * final class cannot be inherited.
 * means final class cannot be sub classed
 * 
 * final methods cannot be overridden
 * final int A=10;  // means it it a constant
 * @author sarbanandab
 *
 */

class Samosa
{
	public void prepareMasalaStuff()
	{
		
	}
	public void makeSamosaChat()
	{
		
	}
	public  final void fry()
	{
		
	}
}

class OninoSamosa extends Samosa
{
	
	public void prepareMasalaStuff()
	{
		
	}
	public void fry() // compilation error
	{// final method cannot be overridden
		
	}
	
	
}

public class FinalDemo {
public static void main(String[] args) {
	final String MY_NAME="sarba";
	MY_NAME="nanda";
}
}
