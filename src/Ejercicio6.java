import java.util.Scanner;

public class Ejercicio6 {
	
	/* 
	  Escriba un programa que determine si una palabra es palindromo: 
	  Palindromo: palabra o expresion de que igual si se lee de izquierda 
	  a derecha que de deracha a izquierda
	  por ejemplo arenera 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s = new Scanner(System.in);
       String palabra;
       System.out.println("ingresa la palabra");
       palabra=s.nextLine();
       int inc = 0;
       int dec = palabra.length()-1;
       boolean error = false;
       
       while ((inc<dec) && (error==false)){
			
    		if (palabra.charAt(inc)==palabra.charAt(dec)){				
    			inc++;
    			dec--;
    		} else {
    			error = true;
    		}
    		
    		if (error==false)
    			System.out.println(palabra + " es un PALINDROMO");
    		else
    			System.out.println(palabra + " NO es un palindromo");
       }
	}

}
