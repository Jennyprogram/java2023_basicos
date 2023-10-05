package principal;

public class CalculosNotas {

	public static void main(String[] args) {
		String notas="4.5,2.7,8.9,5.1,3.4,9.0,6.7,7.2";
		//calcule:
		//nota media
		//nota más alta
		//nota más baja
		//total de aprobados
		String[] valores=notas.split(",");
		double media=0;
		int aprobados=0;
		double mayor=Double.parseDouble(valores[0]);
		double menor=Double.parseDouble(valores[0]);;
		for(String s:valores) {
			//convertimos la nota leida en double
			double nota=Double.parseDouble(s);
			media+=nota;
			if(nota>=5) {
				aprobados++;
			}
			if(nota>mayor) {
				mayor=nota;
			}
			if(nota<menor) {
				menor=nota;
			}
		}
		System.out.println("La media es: "+String.format("%.2f", media/valores.length));
		System.out.println("total de aprobados: "+aprobados);
		System.out.println("Nota mayor: "+mayor);
		System.out.println("Nota menor: "+menor);
	}

}
