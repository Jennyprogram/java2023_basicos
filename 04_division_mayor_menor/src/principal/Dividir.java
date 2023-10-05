package principal;

public class Dividir {

	public static void main(String[] args) {
		int a=30,b=10;
		//mostrar el resultado de dividir el mayor
		//entre el menor
		/*if(a>b) {
			System.out.println("La división es: "+a/b);
		}else {
			System.out.println("La división es: "+b/a);
		}*/
		int r=a>b?a/b:b/a;
		System.out.println("La división es: "+r);
	}

}
