package ExceptionPkg;

//Java Program to Illustrate Checked Exceptions
	// Where FileNotFoundException occurred

	// Importing I/O classes
	import java.io.*;

public class CheckExceptionExample {

	
		/**
		 * To sum up, errors are created by the testing environment and difficult to handle. 
		 * Exceptions, on the other hand, are thrown by the application itself and can be handled
		 */
	
		/**
		Main driver method
		Checked exception example - these are checked at compile time. 
		If some code within a method throws a checked exception, 
		then the method must either handle the exception or it must specify the exception using the throws keyword
		In checked exceptions, there are two types: fully checked and partially checked exceptions. 
		A fully checked exception is a checked exception where all its child classes are also checked, like IOException, and InterruptedException. 
		A partially checked exception is a checked exception where some of its child classes are unchecked, like an Exception.
		
		1. Checked exceptions: These are the exceptions that can be detected by the compiler at the time of execution of the program, and warning messages are displayed.
		
		
		2. Unchecked Exceptions: These are the exceptions that are missed out from the compiler check giving birth to abrupt flow.
		No warning messages are displayed as these exceptions are not detected by the compiler.
		
		https://www.geeksforgeeks.org/top-5-exceptions-in-java-with-examples/
		
		**/
		public static void main(String[] args)
		{
			try
			{
			// Reading file from path in local directory
			//FileReader file = new FileReader("C:\\test\\a.txt");
			
			FileReader file = new FileReader("/Users/tony/Documents/Sandbox_For_Learning_Fldr/src/ExceptionPkg/text_doc.rtf");
			
			///Users/tony/Documents/Sandbox_For_Learning_Fldr/src/ExceptionPkg

			// Creating object as one of ways of taking input
			BufferedReader fileInput = new BufferedReader(file);

			// Printing first 3 lines of file "C:\test\a.txt"
			for (int counter = 0; counter < 20; counter++)
				System.out.println(fileInput.readLine());

			// Closing file connections
			// using close() method
			fileInput.close();
			} catch(FileNotFoundException fnf)
			{
				fnf.printStackTrace();	
			} catch (IOException io) 
			{
				io.printStackTrace();
			}
			
		}

		private static void printStackTrace() {
			// TODO Auto-generated method stub
			
		}
	}

	
	
	
	
	
	
	

