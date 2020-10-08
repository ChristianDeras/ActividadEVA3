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
	
	String Categoria1,Categoria2;
	
	Scanner leer = new Scanner(System.in);
	
	public void Insertar()
	{
		int Respuesta;
		System.out.println("*****************:");
		System.out.println("De que trata la noticia que desea publicar");
		System.out.println("Tipos de noticias");
		System.out.println("1.Deportiva");
		System.out.println("2.Economia");
		System.out.println("*****************:");
		Respuesta=leer.nextInt();
		switch(Respuesta){
				case 1:
				//Entrada de datos
				System.out.println("********Noticia de Deporte************");
				System.out.println("Ingrese el titulo");
				Titulo=leer.nextLine();
				Titulo=leer.nextLine();
				System.out.println("Ingrese la fecha de publicacion");
				FechaPublicada=leer.nextLine();
				Categoria1="Deportes";
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
				//Entrada de datos
				System.out.println("********Noticia de Economia************");
				System.out.println("Ingrese el titulo ");
				Titulo=leer.nextLine();
				Titulo=leer.nextLine();
				System.out.println("Ingrese la fecha de publicacion ");
				FechaPublicada=leer.nextLine();
				Categoria2="Economia";
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
		int respuesta;
		String respuestaDeporte;
		String respuestaEconomia;
		String respuestaTitulo;
		String respuestaFechapublicada;
		String respuestaCategoria;
		
		System.out.println("====================================");
		System.out.println(" ");
		System.out.println("== ¿Desea editar alguna noticia? ==");
		System.out.println("** ¿Que noticia desea editar? ** ");
		System.out.println("1 = Deportiva ");
		System.out.println("2 = Economia ");
		System.out.println(" ");
		System.out.println("====================================== ");
		respuesta=leer.nextInt();
		
		if(respuesta == 1){
			System.out.println("<<<<< **************** >>>>");
			System.out.println("¿Que parte desea editar?");
			System.out.println("1 = Titulo"); 
			System.out.println("2 = Fecha publicada");
			System.out.println("3 = Categoria ");
			respuestaDeporte=leer.nextLine();
			switch(respuestaDeporte){
				case 1:
				System.out.println("Usted eligio modificar el TITULO");
				System.out.println("Escriba su siguiente modificacion en el TITULO");
				respuestaTitulo=leer.nextLine();
				break;

				case 2:
				System.out.println("Usted eligio modificar la Fecha de publicacion");
				System.out.println("Escriba su siguiente modificacion en la Fecha publicada");
				respuestaFechapublicada=leer.nextLine();
				break;

				case 3:
				System.out.println("Usted eligio modificar la Categoria");
				System.out.println("Escriba su siguiente modificacion en la categoria");
				respuestaCategoria=leer.nextLine();
				break;
				default:
				{
					System.out.println("Usted eligio un numero incorrecto");
				}
			}
		}else{
			System.out.println("Usted eligio un numero incorrecto");
		}
		
		if(respuesta == 2){
			System.out.println("<<<<< **************** >>>>");
			System.out.println("¿Que parte desea editar?");
			System.out.println("1 = Titulo"); 
			System.out.println("2 = Fecha publicada");
			System.out.println("3 = Categoria ");
			respuestaEconomia=leer.nextLine();
			switch(respuestaEconomia){
				case 1:
				System.out.println("Usted eligio modificar el TITULO");
				System.out.println("Escriba su siguiente modificacion en el TITULO");
				respuestaTitulo=leer.nextLine();
				break;

				case 2:
				System.out.println("Usted eligio modificar la Fecha de publicacion");
				System.out.println("Escriba su siguiente modificacion en la Fecha publicada");
				respuestaFechapublicada=leer.nextLine();
				break;

				case 3:
				System.out.println("Usted eligio modificar la Categoria");
				System.out.println("Escriba su siguiente modificacion en la categoria");
				respuestaCategoria=leer.nextLine();
				break;
				
				default:
				{
					System.out.println("Usted eligio un numero incorrecto");
				}

			}

		} else{
			System.out.println("Usted eligio un numero incorrecto");
		}
		
	}
	
		
		
		
	public void Consultar()
	{			
				System.out.println("*****************:");
				System.out.println("Que noticia desea consultar");
				System.out.println("1.Deportiva");
				System.out.println("2.Economia");
				System.out.println("*****************:");
				int Consulta;
				Consulta=leer.nextInt();
				
				switch(Consulta){
				
				case 1:
				System.out.println("********Consulta Noticia de Deporte************");
				System.out.println("Titulo: "+Titulo);
				System.out.println("Fecha: "+FechaPublicada);
				System.out.println("La categoria es: "+Categoria1);
				System.out.println("Enfrentamiento entre:  "+ Equipo1 + " Vs " + Equipo2);
				System.out.println("El Equipo ganador es: "+EquiGanador);
				System.out.println("Goles del "+Equipo1+ " son: "+GolesEquipo1+ " En total " );
				System.out.println("Goles del " +Equipo2+ " son: "+GolesEquipo2+ " En total" );
				System.out.println("El jugador que mas destaco es: "+JugadorDestacado);
				System.out.println("**********************");
				break;
				
				
				case 2:
				System.out.println("********Consulta Noticia de Politica************");
				System.out.println("**********************");
				System.out.println("El Titulo es: "+Titulo);
				System.out.println("La fecha es: "+FechaPublicada);
				System.out.println("La categoria es: "+Categoria2);
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