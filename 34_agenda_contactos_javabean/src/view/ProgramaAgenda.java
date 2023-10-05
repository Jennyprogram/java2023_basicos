package view;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.Contacto;
import service.AgendaService;

public class ProgramaAgenda {

	static AgendaService agendaService=new AgendaService();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int opcion;
		do {
			mostrarMenu();
			try {
				opcion=Integer.parseInt(sc.nextLine());//lee la opción elegida
				switch(opcion) { //evaluamos
					case 1:
						pedirContacto();
						break;
					case 2:
						buscarContacto();
						break;
					case 3:
						eliminarContacto();
						break;
					case 4:
						mostrarNombres();
						break;
					
					case 5:
						System.out.println("---Adios---");
				}
			}
			catch(NumberFormatException ex) {
				System.out.println("Debes introducir un número!!");
				opcion=0;
			}
		}while(opcion!=5);
	}
	static void mostrarMenu() {
		System.out.println("1.- Nuevo contacto");
		System.out.println("2.- Buscar contacto");
		System.out.println("3.- Eliminar contacto");
		System.out.println("4.- Mostrar nombres");
		System.out.println("5.- Salir");
		
	}
	static void pedirContacto() {
		Scanner sc=new Scanner(System.in);
		String email;
		String nombre;
		int edad,telefono;
		System.out.println("Introduce Email");
		email=sc.nextLine();
		System.out.println("Introduce nombre");
		nombre=sc.nextLine();
		System.out.println("Introduce edad:");
		edad=Integer.parseInt(sc.nextLine());
		System.out.println("Introduce teléfono:");
		telefono=Integer.parseInt(sc.nextLine());
		agendaService.agregar(email, nombre,edad,telefono);
	}
	static void buscarContacto() {
		Scanner sc=new Scanner(System.in);
		String email;
		Contacto contacto;
		System.out.println("Introduce email");
		email=sc.nextLine();
		contacto=agendaService.buscar(email);
		if(contacto!=null) {
			System.out.println(contacto.getNombre()+"-"+contacto.getEdad());
		}
		else {
			System.out.println("No se ha encontrado el contcto");
		}
	}
	static void eliminarContacto() {
		Scanner sc=new Scanner(System.in);
		String email;
		System.out.println("Introduce email");
		email=sc.nextLine();
		agendaService.eliminar(email);
		
	}
	static void mostrarNombres() {
		Contacto[] contactos=agendaService.contactos();
		for(Contacto c:contactos) {
			System.out.println(c.getNombre()+"-"+c.getEdad());
		}
	}

}
