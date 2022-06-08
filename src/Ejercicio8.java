import java.util.Scanner;

public class Ejercicio8 {
	/*Ingrese 10 nombres de personas en un vector, luego ingrese un
	 * nombre cualquiera y busquelo en el vector mostrar "nombre encontrado
	 * en caso contrario "nombre no encontrado"*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombres[]=new String[10];
		 Scanner s = new Scanner(System.in);
		 String nomBuscado;
		 
		 for(int i=0;i<10;i++) {
	       System.out.println("ingresa un nombre");
	       nombres[i]=s.nextLine();
		 }
		 
		 System.out.println("ingresa el nombre a buscar");
	       nomBuscado=s.nextLine();
		    
			/*for(int j=0;j<10;j++) {
			 System.out.println(nombres[j]);	
			}*/
			
			System.out.print(busquedaSecuencial(nombres, 10, nomBuscado));
	        
       }


public static String busquedaSecuencial(String[] nombres,int tam,String nomBuscado) {
	
	int i=0;
	
	while(  i<tam && nombres[i]!=nomBuscado  ) {
	
		i++;
	}
	
	if(i<tam) {
		return "Nombre no encontrado";
	}
	else return "Nombre encontrado";
	
  }

}

