package principal;

public class LanzarDado {

	public static void main(String[] args) {
		//Hacer un programa que simule el lanzamiento 
		//de un dado
		/*int dado=(int)(Math.random()*6+1);
		System.out.println(dado);*/
		//lanzar el dado 10000 veces y mostraremos los porcentajes
		//de cada cara
		int[] contadores=new int[6];
		for(int i=1;i<=10000;i++) {
			//lanzamiento de dado
			int dado=(int)(Math.random()*6+1);
			//siempre se incrementa la posición del array
			//cuyo índice es el valor del dado menos 1
			contadores[dado-1]++;
		}
		for(int i=0;i<contadores.length;i++) {
			System.out.println("porcentaje de "+(i+1)+": "+contadores[i]*100.0/10000);
		}
		
	}

}
