package ExceptionPkg;


import java.util.*;


public class StackOverFlowErrorExample {
	
	public static void methodOne()
	{
		methodTwo();
	}
	
	
	
	public static void methodTwo()
	{
		methodOne();
	}
	
	
	
	
	public static void main(String[] args)
	{
		try
		{
			methodOne();
		} catch (StackOverflowError so)
		{
			so.printStackTrace();
		}
		
	}

}
