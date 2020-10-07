package src;
import java.util.*;
public class Artista {
     String nombre,habilidades,estudios;
     int nacimiento,exp;
    //instanciando la lectura de datos
    Scanner lc = new Scanner(System.in);
    public void Examen_Artista() {
        int res1=0,res2=0,rf=0;
        
        System.out.println("-------QUEREMOS DETERMINAR SU POTENCIAL PARA ARTISTA------");
        System.out.println("POR FAVOR RESPONDA CORRECTAMENTE LAS SIGUIENTES PREGUNTAS");
        System.out.println("Para que se debe ser artista?");
        System.out.println("1.Para ganar dinero  2.Por amor al arte  3.Por plante");
        res1 = lc.nextInt();
        System.out.println("Que edad debe tener un artista?");
        System.out.println("1.Mayor que 12 anios  2.No hay edad  3.Desde que la persona descubra sus talentos");
        res2 = lc.nextInt();
        //sumo los resultados
        rf = res1+res2;
        if(rf==5){
            System.out.println("FELICIDADES PIENSAS COMO TODO UN ARTISTA, POR FAVOR LLENA TUS DATOS");
            System.out.println("Ingrese su nombre");
            lc.nextLine();
            nombre = lc.nextLine();
            System.out.println("Ingrese su anio de nacimiento");
            nacimiento = lc.nextInt();
            System.out.println("Ingrese una habilidad");
            lc.nextLine();
            habilidades = lc.nextLine();
            System.out.println("Ingrese sus anios de experiencia");
            exp = lc.nextInt();
            lc.nextLine(); //corrigiendo bug
            System.out.println("Ingrese Sus estudios");
            estudios = lc.nextLine();
            //mostrando
            System.out.println("-------------------------------------------------------------------------------------------");
            Informacion_Artista(nombre,nacimiento);
            Habilidades(habilidades);
            Experiencia(exp);
            Estudios(estudios);

        }else {
            System.out.println("Piensa mas claro, quisa algo falte");
            
        }

    }
    public void Informacion_Artista(String nombre, int nacimiento) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        System.out.println("Su nombre es: "+nombre);
        System.out.println("Su Anio de nacimiento es: "+nacimiento);
    }

    public void Habilidades(String habilidades) {
        this.habilidades = habilidades;
        System.out.println("Su habilidad es: "+habilidades);
    }
    
    public void Experiencia(int exp) {
        this.exp = exp;
        System.out.println("Su tiempo de experiencia en anios  es: "+exp);
    }
    public void Estudios(String estudios) {
        this.estudios = estudios;
        System.out.println("Sus Estudios fueron realizados en : "+estudios);
    }

}