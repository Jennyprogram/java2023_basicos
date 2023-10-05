package principal;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class TestExcrituraAppend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
					
				try (FileOutputStream fos=new FileOutputStream("c:\\temp\\dias.txt", true);
						PrintStream out=new PrintStream(fos);) {
		
			out.println("jueves");
			out.println("viernes");
		}
			catch(IOException ex) {
				ex.printStackTrace();
			}
				
	}
	}