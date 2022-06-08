import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner s = new Scanner(System.in);
	       String palabra;
	       System.out.println("ingresa la palabra");
	       palabra=s.nextLine();
	       int contadorVocal=0, contadorConsonante=0 ;
	       int longitud=palabra.length();
	       
	       for (int i=0; i<longitud; i++) {
	    	   if (palabra.charAt(i)=='a' || palabra.charAt(i)=='e' 
	    	   || palabra.charAt(i)=='i' || palabra.charAt(i)=='o'
	    	   ||palabra.charAt(i)=='u') {
	    		    contadorVocal++;
	    	   }else {
	    		   contadorConsonante++;
	    	   }
	       }
	       System.out.println("La palabra tiene "+contadorVocal+" vocales");

	       System.out.println("");
	       
	       System.out.println("La palabra tiene "+contadorConsonante+" consonantes");
	}

}
