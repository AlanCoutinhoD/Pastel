package com.upchiapas;
import java.util.Scanner;
public class Participante {
    static  Participante objetoParticipante; //Definir el objeto del arreglo
    static Participante[] participantes; //Definir el nombre del arreglo
    String nombre; //Variable para poder guardar el nombre
    int folio=0; //Variable de folio para saber el numero del participante
    static int pos=0; //Variable para poder saber la posicion de donde se guardara en la clase postre
    static String nombrePostre; //Variable que servira para mandar el valor a la clase Postre donde se guardara en el arrgelo
    public static int getPos() {
        return pos;
    }
    public String getNombre(){return nombre;} //Retorno de valores
    public int getFolio(){return folio;}
    public Participante (int folio , String nombre){ //Parametros para poder almacenar en el
        this.nombre=nombre;
        this.folio=folio;
    }
    public static String getNombrePostre() {
        return nombrePostre;
    }

    public static void registrarParticipante(){

        int cantidad=5;
        int cantidadE=1;
        int h=0;
        Postre.generarArreglo();
        String nombre = null;
        System.out.println("Numero de Participantes: 5  ");
        Scanner entrada= new Scanner(System.in);
        participantes= new Participante[cantidad];
        for (int i=1;i<=cantidad;i++) {
            pos += cantidadE;
            System.out.println("Nombre: ");
           // System.out.println(folio);
            nombre = entrada.next();
           // folio = entrada.nextInt();
            System.out.println("Nombre del postre: ");
            nombrePostre = entrada.next();
            objetoParticipante = new Participante(pos, nombre);
            participantes [i-1]= objetoParticipante;
            Postre.RegistrarPostres();
        }


        }
    public static void visualizarRegistros(){
        if (participantes == null || participantes.length== 0) {
            System.out.printf("Este Array Esta Vacio!!");
        }
        else
           for (int i=1 ; i<=5; i++){
               System.out.println("Folio: "+participantes[i-1].getFolio());
               System.out.println("Nombre: "+participantes[i-1].getNombre());
    }
}
    public static void BuscarParticipante(){
        Scanner Buscar= new Scanner(System.in);
        boolean Encontrado = true;
        int numeroBuscado=0;
        System.out.println("Digite el folio del participante");
        numeroBuscado= Buscar.nextInt();
        for (int i=0 ; i<5; i++){
            if (participantes[i].getFolio()==(numeroBuscado)){
                System.out.println("folio: "+ participantes[i].getFolio()+ " Nombre del participante: "+ participantes[i].getNombre());
                i=5;
                Encontrado=false;
            }
        }
        if (Encontrado==true){
        }
        else {
            System.out.println("Datos no encontrados....");
        }
    }
}
