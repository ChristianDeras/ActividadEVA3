package src;


public class Obras {
		private String titulo;
		private String autor;
		private int anioedicion;
	
		//Metodo setter: Establecemos el titulo
		public void setTitulo(String titulo){
		this.titulo = titulo;
		}
	 
		//Metodo Getter: Mostramos el titulo
		public String getTitulo(){
		 return titulo; 
		}
	 
	 
	 

	
		//Metodo Setter: Establecemos el nombre del autor
		public void setAutor(String autor){
		 this.autor = autor;
		}
	 
		//Metodo Getter: Mostramos el nombre del autor
		public String getAutor(){
		 return autor;
		 
		}
	 
	 
	 
	 
	 
		//Metodo setter: Establecemos el anio de edicion
		public void setAnioedicion(int anioedicion){
		 this.anioedicion = anioedicion; 
		}
	 
		//Metodo Getter: Mostramos el anio de edicion
		public int getAnioedicion(){
		 return anioedicion;
		}
	 
	 

}