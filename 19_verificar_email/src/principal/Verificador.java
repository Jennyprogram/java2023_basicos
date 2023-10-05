package principal;

import java.util.Scanner;

public class Verificador {

	public static void main(String[] args) {
		//reqlizar un programa que solicite la introducción
		//de una dirección de email y nos indique si es o no válida
		//dirección válida: contiene al menos un punto y una @
		Scanner sc=new Scanner(System.in);
		String email;
		System.out.println("Introduce un email");
		email=sc.nextLine();
		sc.close();//cierra scanner
		/*int posarroba=email.indexOf("@");
		int pospunto=email.indexOf(".");
		if(posarroba!=-1&&pospunto!=-1) {
			System.out.println("Dirección válida!");
		}else {
			System.out.println("Dirección no válida!");
		}*/
		if(email.indexOf("@")!=-1&&email.indexOf(".")!=-1) {
			System.out.println("Dirección válida!");
		}else {
			System.out.println("Dirección no válida!");
		}
		
		//solución alternativa
		if(email.contains("@")&&email.contains(".")) {
			System.out.println("Dirección válida!");
		}else {
			System.out.println("Dirección no válida!");
		}
	}

}
