package service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class NotasService {
	ArrayList<Double> notas=new ArrayList<>();
	
	public void guardarNota(double nota) {
		try(FileOutputStream fos =new FileOutputStream("c:\\temp\\notas.txt", true);
				PrintStream out =new PrintStream(fos)){
			
			out.println(nota);
			
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	public void eliminarNota(int pos) {
		//no hacer
	}
	
	public double media() {
		
		int cont = 0;
		String alm00 = " ";
		int salir = 1;
		Double mediaN = 0.0;
		
		try(FileReader f = new FileReader("c:\\temp\\notas.txt");BufferedReader bf = new BufferedReader(f);) {

			while(salir ==1) {
				cont++;
				alm00 = bf.readLine();
				if(alm00 != null) {
				System.out.println("liniea "+cont +"  " +alm00);
				mediaN = mediaN + Double.parseDouble(alm00);
				
				}else {
					salir = 0;
				}
			}
			
		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		
		mediaN = mediaN /(cont -1);
		
		return mediaN ;
		
	}
	
	
	
	public int aprobados() {
		
		int cont = 0;
		String alm00 = " ";
		int salir = 1;
        int aprobados = 0;
		
		try(FileReader f = new FileReader("c:\\temp\\notas.txt");BufferedReader bf = new BufferedReader(f);) {

			while(salir ==1) {
				cont++;
				alm00 = bf.readLine();
				if(alm00 != null) {
				System.out.println("liniea "+cont +"  " +alm00);
				
				if( Double.parseDouble(alm00)>= 5 ) {
					aprobados++;
					}
				
				}else {
					salir = 0;
				}
			}
			
		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		
		System.out.println(aprobados);

		return aprobados;
	}
	
	
	public ArrayList<Double> notas(){
		
		int cont = 0;
		String alm00 = " ";
		int salir = 1;

		
		try(FileReader f = new FileReader("c:\\temp\\notas.txt");BufferedReader bf = new BufferedReader(f);) {

			while(salir ==1) {
				cont++;
				alm00 = bf.readLine();
				if(alm00 != null) {
				System.out.println("liniea "+cont +"  " +alm00);
				notas.add(Double.parseDouble(alm00)) ;
				
				}else {
					salir = 0;
				}
			}
			
		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		
		return notas;
	}
}
