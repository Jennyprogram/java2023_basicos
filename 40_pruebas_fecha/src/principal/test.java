package principal;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Date d1=new Date();
    		Date d2=new Date(2325666589774l);
    		if(d1.before(d2)) {
    			System.out.println ("fecha mas antigua:" + d1);
    		System.out.println ("fecha mas moderna:" + d2);
    		} else {
    			System.out.println ("fecha mas antigua:" + d2);
        		System.out.println ("fecha mas moderna:" + d1);
    		}
    		
 //formateado de fechas 
	 SimpleDateFormat fr=new  SimpleDateFormat("dd/MM/yyyy"); 
	 
	 System.out.println(fr.format (d1));
	 System.out.println(fr.format (d2));
	
	 //FORMATO CON LOCALIZACION 
	 DateFormat df=DateFormat.getDateInstance(DateFormat.FULL, Locale.getDefault());
	 System.out.println(fr.format (d1));
	 System.out.println(fr.format (d2));
	 
	 //PARSEADO DE FECHAS 
	 String f="30-05-2022";
	  
	 try {
	 DateFormat sdf;
	Date d3=sdf.parse(f);
	 System.out.println(df.format (d3));
	 } catch(ParseException ex) {
		 ex.printStackTrace();
		 System.out.println("cadena de fecha no valida");
	 }
}
}
