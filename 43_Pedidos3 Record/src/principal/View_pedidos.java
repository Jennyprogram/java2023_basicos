package principal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import serviciopedidos.Service_Pedidos;




public class View_pedidos {
	

	static Service_Pedidos service_pedidos= new Service_Pedidos();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int Salir = 1;
		String opcion;
		
		while(Salir == 1) {
			mostrarMenu();
			opcion=sc.nextLine();//lee la opción elegid
			
			switch(opcion) { //evaluamos
			case "1":
				AnadirPedido();
				break;
			case "2":
	
				break;
			case "3":
				
				break;
			case "4":
	
				break;			
			case "5":
				Salir = 0;
				System.out.println("---Adios---");
				break;
			default: 
				break;
		}
			
		}
		
	}
	
	
		static void mostrarMenu() {
			System.out.println("1.- Alta pedido");
			System.out.println("2.- Pedido mas reciente");
			System.out.println("3.- Pedido por precio inferior");
			System.out.println("4.- Pedidos anteriores segun meses requeridos");
			System.out.println("5.- Salir");
			
		}
		
		
		static void AnadirPedido() {
			Scanner sc=new Scanner(System.in);
			String producto;
			LocalDate fechapedido = null;
			Double precio;

			System.out.println("Introduce producto");
			producto=sc.nextLine();
			System.out.println("Introduce fecha pedido");

			String f1= sc.nextLine();

			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");

			try {

				fechapedido = LocalDate.parse(f1, dtf);
			}catch(DateTimeParseException ex){
				System.out.println("Error introducir fecha");
			}
				System.out.println("Introduce precio:");
				precio=Double.parseDouble(sc.nextLine());
			
			
			service_pedidos.AddPedido(producto, fechapedido, precio);
			service_pedidos.Imppedidos();
			}
		}

	
	

