package principal;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class TestExcrituraAppend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos=null;
				PrintStream out=null;	
				try {
			//objeto para configuerar la forma de escritura 
			fos=new FileOutputStream("c:\\temp\\dias.txt", true);
			//apartir del objeto anterior , creamos el PrintStream
			out=new PrintStream(fos);
			out.println("jueves");
			out.println("viernes");
		}
			catch(FileNotFoundException ex) {
				ex.printStackTrace();
			}
				finally {
					if(out!=null) {
						out.close();
					}
					if(fos!=null) {
						try {
							fos.close();
						} catch(IOException e) {
							e.printStackTrace();
						}
					}
				}
		
	}

}
