import src.*;
import java.util.*;
class principal {
    //Kevin
	public static void cajero() {
    	Scanner sc = new Scanner(System.in);
    	cuenta cuenta1 = new cuenta();
    	int retiro, cajero, cuenta, contrasena, operacion, prestar=0, desicion = 1;
    	Double nuevobalance, balance;
    	//String fecha, hora;
    	System.out.println("Ingrese su numero de cuenta, tome en cuenta el numero debe ser de al menos 6 digitos");
    	cuenta = sc.nextInt();
    	if (cuenta > 99999) {
    	System.out.println("---BIENVENIDO---");
    	balance = Math.random()*(1000)+1;
    	System.out.println("Seleccione la operacion a realizar");
    	System.out.println("para retiro seleccione 1");
    	System.out.println("para consulta de saldo seleccione 2");
    	System.out.println("para solicitar un prestamo seleccione 3");
    	System.out.println("para salir presione 4");
    	operacion = sc.nextInt();
    	if (operacion > 0 && operacion <= 4) {

    		do{
    			cuenta1.seleccion(operacion, balance);
    			balance = balance - cuenta1.seleccion(operacion, balance);
    			balance = balance + cuenta1.prestamo(balance, prestar);
    			System.out.println("operacion finalizada, para realizar otra operacion ingrese 1, para salir ingrese cualquier otro");
    			desicion = sc.nextInt();
    			java.util.Date fecha = new java.util.Date();
    			System.out.println(fecha+"  ");

    		}
    		while (desicion == 1)
    		
    	}
    	else{
    		System.out.println("operacion invalida");
    		System.out.println("intente nuevamente");
    	}    		
    	}
    	else{
    		System.out.println("cuenta incorrecta");
    	}
    }
}