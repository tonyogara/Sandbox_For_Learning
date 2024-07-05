package ExceptionPkg;

//Java Program to Illustrate Checked Exceptions
	// Where FileNotFoundException occurred

	// Importing I/O classes
	import java.io.*;

public class CheckExceptionExample {

	

		// Main driver method
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
			} catch (IOException io) {
				io.printStackTrace();
			}
			
		}
	}

	
	
	
	
	
	
	

