package src;
import java.util.Scanner;
public class Noticia
{
	public String Titulo,FechaPublicada,Categoria;
	
	String Equipo1,Equipo2;
	int GolesEquipo1,GolesEquipo2;
	String JugadorDestacado;
	String EquiGanador;
				
	String opinion,nombre,opinion1,opinion2;
				
	String Resumen,Detalles,Impacto;
	
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
				System.out.println("********Noticia de Deporte************");
				System.out.println("Ingrese el titulo");
				Titulo=leer.nextLine();
				Titulo=leer.nextLine();
				System.out.println("Ingrese la fecha de publicacion");
				FechaPublicada=leer.nextLine();
				System.out.println("Ingrese los equipos que se enfrentaron");
				System.out.println("Equipo 1");
				Equipo1=leer.nextLine();
				System.out.println("Equipo 2");
				Equipo2=leer.nextLine();
				System.out.println("Cantidad de goles de el : "+Equipo1 );
				GolesEquipo1=leer.nextInt();
				System.out.println("Cantidad de goles de el:  "+Equipo2 );
				GolesEquipo2=leer.nextInt();
				System.out.println ("Jugador que destacado");
				JugadorDestacado=leer.next();
				System.out.println ("Ingrese el equipo ganador ");
				EquiGanador=leer.nextLine();
				EquiGanador=leer.nextLine();
				break;
				case 2:
				//entrada de datos 
				System.out.println("********Noticia de Politica***********");
				System.out.println("Ingrese el titulo");
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
				

				break;
				case 3:
				//Entrada de datos
				System.out.println("********Noticia de Economia************");
				System.out.println("Ingrese el titulo ");
				Titulo=leer.nextLine();
				Titulo=leer.nextLine();
				System.out.println("Ingrese la fecha de publicacion ");
				FechaPublicada=leer.nextLine();
				System.out.println("Ingrese un resumen del tema tratado ");
				Resumen=leer.nextLine();
				System.out.println("Detalles del tema ");
				Detalles=leer.nextLine();
				System.out.println("Que impacto tiene en nuestro pais ");
				Impacto=leer.nextLine();
				
				break;
			
			default:
			{
			System.out.println("error eliga una opcion disponible");
			}
			
			}		
	}

	
	public void Modificar()
	{
		String respuesta
		String respuestaDeporte
		
		System.out.println("====================================");
		System.out.println(" ");
		System.out.println("== ¿Desea editar alguna noticia? ==");
		System.out.println("** ¿Que noticia desea editar? ** ");
		System.out.println("1 = Deportiva ");
		System.out.println("2 = Politica ");
		System.out.println("3 = Economia ");
		System.out.println(" ");
		System.out.println("====================================== ");
		respuesta=leer.nextLine();
		
		if(respuesta == 1)
		(
		System.out.println("<<<<< **************** >>>>");
		System.out.println("¿Que parte desea editar?");
		System.out.println("1 = Titulo");
		System.out.println("2 = Fecha publicada");
		System.out.println("3 = los equipos que se enfrentaron ");
		respuestaDeporte=leer.nextLine();
			while(respuestaDeporte )
		)
		
		
	}
	
		
		
		
	public void Consultar()
	{			
				System.out.println("*****************:");
				System.out.println("Que noticia desea consultar");
				System.out.println("1.Deportiva");
				System.out.println("2.Politica");
				System.out.println("3.Economia");
				System.out.println("*****************:");
				int Consulta;
				Consulta=leer.nextInt();
				
				switch(Consulta){
				
				case 1:
				System.out.println("********Consulta Noticia de Deporte************");
				System.out.println("Titulo: "+Titulo);
				System.out.println("Fecha: "+FechaPublicada);
				System.out.println("Enfrentamiento entre:  "+ Equipo1 + " Vs " + Equipo2);
				System.out.println("El Equipo ganador es: "+EquiGanador);
				System.out.println("Goles del "+Equipo1+ " son: "+GolesEquipo1+ " En total " );
				System.out.println("Goles del " +Equipo2+ " son: "+GolesEquipo2+ " En total" );
				System.out.println("El jugador que mas destaco es: "+JugadorDestacado);
				System.out.println("**********************");
				break;
				
				case 2:
				System.out.println("********Consulta Noticia de Politica************");
				System.out.println("El titulo es: "+Titulo);
				System.out.println("La fecha en que fue publicado es: "+FechaPublicada);
				System.out.println("Su opinion acerca de la politica es: "+opinion);
				System.out.println("El nombre del presidente de su pais es: "+nombre);
				System.out.println("Su opinion acerca del trabajo de su presidente es: "+opinion1);
				System.out.println("Su opinion acerca del trabajo de los 3 organos del estado es: "+opinion2);
				break;
				
				case 3:
				System.out.println("********Consulta Noticia de Politica************");
				System.out.println("**********************");
				System.out.println("El Titulo es: "+Titulo);
				System.out.println("La fecha es: "+FechaPublicada);
				System.out.println("Resumen del tema: "+Resumen);
				System.out.println("los detalles son: "+Detalles);
				System.out.println("El impacto en el pais: "+Impacto);
				System.out.println("**********************");
				
				break;
				default:
				{
				System.out.println("error eliga una Categoria disponible");
				}
	}
	
	
}
}