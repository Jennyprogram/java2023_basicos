package principal;

import java.util.Scanner;

public class ContarVocales {

	public static void main(String[] args) {
		//solicita la introducción de un texto
		//y nos dice cuantas vocales contiene
		Scanner sc=new Scanner(System.in);
		String frase;
		System.out.println("Introduce una frase");
		frase=sc.nextLine();
		//convertimos todo a minúscula
		frase=frase.toLowerCase();
		int vocales=0;
		for(int i=0;i<frase.length();i++) {
			switch(frase.charAt(i)) {
				case 'a','e','i','o','u':
					vocales++;
			}
		}
		System.out.println("Total de vocales: "+vocales);
	}

}
