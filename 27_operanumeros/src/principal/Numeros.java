package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		//realizar un programa que vaya solitando la introducción de números enteros
		//y los irá guardando. Cada vez que que pide un número y lo guarda, preguntará
		//al usuario si desea introducir otro número. Cuando diga que no quiere seguir
		//introduciendo números, se mostrará la suma de todos los números introducidos
		var lista=new ArrayList<Integer>();
		var scNumeros=new Scanner(System.in);
		var scTextos=new Scanner(System.in);
		int num;
		String resp;
		int suma=0;
		do {
			System.out.println("Introduce un número:");
			num=scNumeros.nextInt();
			lista.add(num);//autoboxing de int a Integer
			System.out.println("¿Desea introducir otro número?(si/no)");
			resp=scTextos.nextLine();
		}while(resp.equals("si"));
		for(int n:lista) {
			suma+=n;
		}
		System.out.println("La suma es: "+suma);
	}

}
