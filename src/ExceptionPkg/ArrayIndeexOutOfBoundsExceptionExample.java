package ExceptionPkg;

public class ArrayIndeexOutOfBoundsExceptionExample {
	
	
	
	public static void main (String[] args)
	{
		
		try
		{
			int[] a = new int[10];
			
			for(int i=0; i<10; i++ )
			{	
				a[i] = i;
				System.out.println(a[i]);
			}
			
		
		System.out.println(a[100]);
		} catch (ArrayIndexOutOfBoundsException aiob)
		{
			aiob.printStackTrace();
			
		}
		
		
		
	}

}
