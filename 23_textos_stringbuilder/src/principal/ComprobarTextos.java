package principal;

public class ComprobarTextos {

	public static void main(String[] args) {
		String productos="Detergente,Vino,Pan,Agua,Leche,Harina,Mantequilla,Arroz";
		//Crear una nueva cadena de caracteres que contenga los productos
		//que empiezan por A
		String[] datos=productos.split(",");
		//aquí iremos añadiendo los productos
		//que cumplen la condición
		StringBuilder resultado=new StringBuilder();
		for(String p:datos) {
			if(p.startsWith("A")) {
				resultado.append(p);
				resultado.append(",");
			}
		}
		System.out.println(resultado.delete(resultado.length()-1, resultado.length()));
	}

}
