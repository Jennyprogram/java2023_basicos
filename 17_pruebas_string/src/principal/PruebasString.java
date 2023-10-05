package principal;

public class PruebasString {

	public static void main(String[] args) {
		String cad1="hola";
		String cad2=" adios";
		//concatenación
		cad1=cad1+cad2; //"hola adios"
		System.out.println(cad1.length()); //10
		System.out.println(cad1.toUpperCase());
		System.out.println(cad1.charAt(5));
	}

}
