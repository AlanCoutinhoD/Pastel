package com.upchiapas;

import java.util.Scanner;

public class Postre {
 private int folio; //folio para los pasteles tiene el mismo valor que en el de los participantes
 private String postrename; //variable que me sirve poder guardar el valor del postre en el arreglo de postres
 static String postren; //lo creo estetico para poder recibir los valores de la clase de participante
    static Postre[] postre;   //definicion del arreglo para los postres
    static  Postre objetoPostre;
    public  int getFolio() {
        return folio;
    }  //Retorno de valores
    public String getPostren() {
        return postren;
    }
    public  String getPostrename() {
        return postrename;
    }//Retorno de valores
    public Postre(int folio, String postrename){ //parametros que iran para poder hacer el arreglo
        this.folio=folio;
        this.postrename= postrename;
    }

    public  static void generarArreglo(){
//creo esta funcion para no repetir la creacion del arreglo de pasteles y evitar errores solo se usa una vez al seleccionar registrar participantes
         postre= new Postre[5];
 }
        public static void RegistrarPostres() {
         String postrename="null";  //se inicializa el valor del nombre pastel para evitar errores
         int folio=0;  //inicializar el valor de folio para evitar errores y se obtenga un valor diferente
           int p=1; // variable de la pocision donde se guardara el valor en el arreglo x
            p = Participante.getPos(); //posicion para guardar el valor del folio
           postren = Participante.getNombrePostre(); //se obtiene el valor del postre que se guardo en la clase participante
           postrename = postren; //se pasa el valor del nombre del postre al del arreglo para evitar errores
            folio = Participante.getPos();
           // System.out.println(p);
           // System.out.println(postrename);   FUNCIONES PARA COMPROBAR QUE SE ESTAN PASANDO LOS VALORES
           // System.out.println(folio);
            objetoPostre = new Postre(folio,postrename);
            postre[p-1] = objetoPostre;   //Guardado de datos en el arreglo donde P y la operacion -1 es la pocision
        }
public static void visualizarPost(){
    if (postre == null || postre.length== 0) { //Verificar que el arreglo este vacio para evitar errores null
    System.out.printf("Este Arreglo Esta Vacio!");
    }
        for(int i=1;i<=5;i++){ //En caso contrario se imprime el arreglo de los postres
            System.out.println(postre [i-1].getFolio());
           System.out.println("Numero \n" + postre [i-1].getPostrename());
        }
    }

    public static void BuscarP(){
      Scanner Buscar= new Scanner(System.in);
        int Encontrado = 0;
        int numeroBuscado=0;
        System.out.println("Digite el folio del participante");
        numeroBuscado= Buscar.nextInt();
        for (int i=0 ; i<5; i++){
            if (postre[i].getFolio()==(numeroBuscado)){
                System.out.println("Datos encontrados con el folio: "+ postre[i].getFolio()+ " Nombre del postre: "+ postre[i].getPostrename());
                Encontrado=1;
        }

        }
        if (Encontrado==1){
        }
        else {
            System.out.println("Datos no encontrados....");
        }
        }
}




