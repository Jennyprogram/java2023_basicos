package principal;

public class ComprobarProvincia {

	public static void main(String[] args) {
		String localidad="Alcalá de Henares(Madrid)";
		//mostrar provincia a la que pertenece la localidad
		System.out.println(localidad.substring(localidad.indexOf("(")+1, localidad.indexOf(")")));

	}

}
