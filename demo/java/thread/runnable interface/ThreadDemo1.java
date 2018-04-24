class Beverages
{
	
}
class Drinks extends Beverages implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)			
		{
			System.out.println("Don't drink and drive");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}	
}
class MyChildThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(" Sunday is a paradise");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
		
	}
	
}

public class ThreadDemo1 {
public static void main(String[] args) {
	
	MyChildThread t=new MyChildThread(); //new state
	t.start(); // runnable
	
	
	Drinks d=new Drinks(); // Runnable object
	Thread t2=new Thread(d); // pass the runnable object as parameter to a new thread object
	t2.start();
	
	System.out.println(" Starting of Main thread");
	for(int i=0;i<10;i++)
	{
		
		System.out.println("Saturday is Sleepy");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
	System.out.println("====End of main thread====");
}
}
