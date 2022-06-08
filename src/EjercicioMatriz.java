
public class EjercicioMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int[][] tateti;
		  tateti=new int[3][3];
		  
		  for(int i=0;i<3;i++) {
			  
			  for(int j=0;j<3;j++) {
				 
			      tateti[i][j]=-1;
			      
			  }
			  
		  }
              for(int i=0;i<3;i++) {
			  
			      for(int j=0;j<3;j++) {
				 
				  System.out.println("["+i+"]"+"["+j+"]"+tateti[i][j]);

	           }
           }
	 }
}
