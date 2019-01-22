import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class principal {
	public static void main (String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    int menu, opc = 0;
	    Scanner mostrar = new Scanner(System.in);
	    System.out.println("Elige un numero del menú: ");
	    System.out.println("1. ECO");
	    System.out.println("2. Contador");
	    System.out.println("3. Salir");

	    do{
	      menu = mostrar.nextInt();
	      switch(menu){

	          case 1:  
	        	  ejecutor escribir = new ejecutor();
	              System.out.println("Introduzca Algo: ");
	              String nombre = reader.readLine();
	              escribir.eco(nombre);
	              
	              break;
	          case 2: 
	        	  ejecutor ejecutar = new ejecutor();
	        	  new Thread(ejecutar).start();
	        	  break;
	          default:
	              System.out.print("Hasta pronto!");
	              break;
	      } 
	            
	   }while(opc < 3); 
	}// main
}// class
