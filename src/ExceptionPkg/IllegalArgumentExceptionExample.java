package ExceptionPkg;

public class IllegalArgumentExceptionExample {
	
	
	public static void main(String[] args)
	{
		try
		{
		Thread t=new Thread();
		
		//t.setPriority(12);
		
		
		t.setPriority(11);
		} 
		
		catch (IllegalArgumentException IA)
		{
			IA.printStackTrace();
		}
	
	}
	
	

}
