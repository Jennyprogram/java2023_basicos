package principal;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class TestEscritura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (PrintStream out=new PrintStream("c:\\temp\\dias.txt")){
		
		out.println("lunes");
		out.println("martes");
		out.println("miercoles");
		
	}
		catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
		
			}
		
	}
	
