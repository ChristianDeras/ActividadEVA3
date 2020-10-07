import src.*;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
		        Scanner leer = new Scanner(System.in);
     // chris
     
     
    //mario
	System.out.println("");
	System.out.println("-----INGRESE LOS DATOS DE LA OBRA-----");
	//Instanciamos la clase Obras
		Obras obs = new Obras();
	//Accedemes al objeto Obras con el nombre obs
	//Plantilla
	System.out.println("Ingrese el titulo de la obra :");
	obs.setTitulo(leer.nextLine());
	System.out.println("Ingrese el nombre del autor :");
	obs.setAutor(leer.nextLine());
	System.out.println("Ingrese el año de la obra :");
	obs.setAnioedicion(leer.nextInt());
	//Imprimimos
		System.out.println("");
	System.out.println("------------------------------");
		System.out.println("El nombre del titulo es :"+obs.getTitulo());
			System.out.println("El nombre del autor es :"+obs.getAutor());
				System.out.println("El año de la obra es :"+obs.getAnioedicion());
					System.out.println("");
				

    //rene

    
    //Kevin
    }
}