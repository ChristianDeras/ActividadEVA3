package src;
import java.util.Scanner;
public class Noticia
{
	public String Titulo,FechaPublicada,Categoria;
	Scanner leer = new Scanner(System.in);
	
	public void Insertar()
	{
		int Categoria;
		System.out.println("*****************:");
		System.out.println("De que trata la noticia que desea publicar");
		System.out.println("Tipos de noticias");
		System.out.println("1.Deportiva");
		System.out.println("2.Politica");
		System.out.println("3.Economia");
		System.out.println("*****************:");
		Categoria=leer.nextInt();
		switch(Categoria){
				case 1:
				//Entrada de datos
				String Equipo1,Equipo2;
				int GolesEquipo1,GolesEquipo2;
				String JugadorDestacado;
				String EquiGanador;
				System.out.println("Ingrese el titulo");
				Titulo=leer.nextLine();
				System.out.println("Ingrese la fecha de publicacion");
				FechaPublicada=leer.nextLine();
				System.out.println("Ingrese los equipos que se enfrentaron");
				Equipo1=leer.nextLine();
				Equipo2=leer.nextLine();
				System.out.println ("Cantidad de goles de el "+Equipo1);
				GolesEquipo1=leer.nextInt();
				System.out.println ("Cantidad de goles de el "+Equipo2);
				GolesEquipo2=leer.nextInt();
				System.out.println ("Jugador que destacado");
				JugadorDestacado=leer.next();
				System.out.println ("Ingrese el equipoganador ");
				EquiGanador=leer.nextLine();
				//Salida
				System.out.println("**********************");
				System.out.println(Titulo);
				System.out.println(FechaPublicada);
				System.out.println("Enfrentamiento entre"+Equipo1+"Vs"+Equipo2);
				System.out.println("Ganador");
				System.out.println("El Equipo ganador es"+EquiGanador);
				System.out.println("Goles del"+Equipo1+ "son"+GolesEquipo1+ "En total" );
				System.out.println("Goles del"+Equipo2+ "son"+GolesEquipo2+ "En total" );
				System.out.println("El jugador que mas destaco es "+JugadorDestacado);
				break;
				case 2:
				//entrada de datos 
				String opinion;
				String nombre;
				String opinion1;
				String opinion2;
				System.out.println("Ingrese el titulo");
				Titulo=leer.nextLine();
				Titulo=leer.nextLine();
				System.out.println("ingrese la fecha de publicacion");
				FechaPublicada=leer.nextLine();
				System.out.println("Ingrese su opinion de como es la politica en su pais");
				opinion=leer.nextLine();
				System.out.println("Ingrese el nombre de su presidente");
				nombre=leer.nextLine();
				System.out.println("Ingrese su opinion acerca del trabajo de su presidente");
				opinion1=leer.nextLine();
				System.out.println("Ingrese su opinion acerca del trabajo de los 3 organos del gobierno");
				opinion2=leer.nextLine();
				//Salida
				System.out.println("<<==============================================================>>");
				System.out.println("El titulo es: "+Titulo);
				System.out.println("La fecha en que fue publicado es: "+FechaPublicada);
				System.out.println("Su opinion acerca de la politica es: "+opinion);
				System.out.println("El nombre del presidente de su pais es: "+nombre);
				System.out.println("Su opinion acerca del trabajo de su presidente es: "+opinion1);
				System.out.println("Su opinion acerca del trabajo de los 3 organos del estado es: "+opinion2);
				break;
				case 3:
				//Entrada de datos
				String Resumen,Detalles,Impacto;
				System.out.println("Ingrese el titulo");
				Titulo=leer.nextLine();
				System.out.println("Ingrese la fecha de publicacion");
				FechaPublicada=leer.nextLine();
				System.out.println("Ingrese un resumen del tema tratado");
				Resumen=leer.nextLine();
				System.out.println("Detalles del tema");
				Detalles=leer.nextLine();
				System.out.println("Que impacto tiene en nuestro pais");
				Impacto=leer.nextLine();
				//Salida
				System.out.println("El Titulo es: "+Titulo);
				System.out.println("La fecha es: "+FechaPublicada);
				System.out.println("Resumen del tema"+Resumen);
				System.out.println("los detalles son"+Detalles);
				System.out.println("El impacto en el pais:+Impacto");
				break;
			
			default:
			{
			System.out.println("error eliga una opcion disponible");
			}
			
			}
			
	}
}