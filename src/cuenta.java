package src;
import java.util.*;
public class cuenta{
	public int seleccion(int operacion, Double balance){
		int cantidad=0, prestar=0;
		Scanner sc = new Scanner(System.in);
		cuenta c1 = new cuenta();
		switch(operacion){
			case 1:
			System.out.println("Ingrese la cantida a retirar en multiplos de 5");
			cantidad = sc.nextInt();
			if (cantidad % 5 == 0) {
				if (balance > cantidad) {
					System.out.println("Procesando su retiro");
					System.out.println("cuente su efectivo");
					//return cantidad;
				}
				else{
					System.out.println("El monto deseado supera su balance actual");
				}				
			}
			else{
				System.out.println("Ha ingresado una cantidad invalida");
			}
			break;
			case 2:
			System.out.println("Su balance actual es de: $"+balance);
			break;
			case 3:
			System.out.println("Ingrese el monto que desea prestar");
			prestar = sc.nextInt();
			c1.prestamo(balance, prestar);
			
			break;
			case 4:
			System.out.println("Gracias por utilizar nuestros servicios");
			break;			
    	}
    	return cantidad;
	}
	public int prestamo(Double balance, int prestar){
	if ((balance/5) > prestar) {
		System.out.println("felicidades su prestamo ha sido aprobado");
	}
	else{
		System.out.println("Acerquese a una de nuestras agencias para mas informacion");
	}
	return prestar;
	}
}