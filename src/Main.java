import com.upchiapas.Participante;
import com.upchiapas.Postre;
import java.util.Scanner;
public class  Main{
    static boolean bandera;
    static  Participante objetoParticipante;
    static  Postre objetoPostre;
    static Participante[] ListaParticipantes;
    static Postre[] ListaPostres;

    public static void main (String []args){
        ListaPostres= new Postre[5];
        Scanner entrada= new Scanner(System.in);
        int opcion = 0;
        do
        {
            System.out.printf("Escoja entre las opciones 1.Registro de Participante 2.Visualizar Participantes 3.Vizualizar Postres 4.Buscar Postres");
            opcion=entrada.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Registro de Participantes");
                    registrarParticipante();
                    break;
                case 2:
                  VizualizarRegistros();
                    break;
                case 3:
                    VizualizarPostres();
                    break;
                case 4:
                   BuscarPostre();
            break;
                case 5:
              BuscarParticipante();
                    break;
            }

        }
        while(opcion<6);

        }
        public static void registrarParticipante(){
            int folio= (int) (Math.random()*10);
            int posicion=0;
            String nombrePostre;
            String ingrediente;
            String nombre;
            String lugar;
            System.out.println("Numero de Participantes: 5  ");
            Scanner entrada= new Scanner(System.in);
            ListaParticipantes= new Participante[5];
            for (int i=1;i<=5;i++) {
                folio+=1;
                posicion +=1;
                System.out.println("Participante Numero : "+ i);
                System.out.println("Nombre: ");
                nombre = entrada.next();
                System.out.println("Lugar de origen: ");
                lugar = entrada.next();
                System.out.println("Nombre del postre: ");
                nombrePostre = entrada.next();
                System.out.println("Nombre del ingrediente: ");
                ingrediente = entrada.next();
                objetoParticipante = new Participante(folio, nombre,lugar);
                ListaParticipantes [i-1]= objetoParticipante;
                RegistrarPostre(nombrePostre,ingrediente,folio,posicion);
                System.out.println("Participante Registrado:    ");
                    System.out.println("Folio: "+ListaParticipantes[i-1].getFolio());
                    System.out.println("Nombre: "+ListaParticipantes[i-1].getNombre());
                    System.out.println("Lugar de origen: "+ListaParticipantes[i-1].getLugar());
                    System.out.println("POSTRE REGISTRADO DEL PARTICIPANTE");
                    System.out.println("Nombre:  "+ ListaPostres [i-1].getNombrePostre());
                    System.out.println("Ingrediente: " +ListaPostres[i-1].getIngrediente());

                }

            }
            public static void RegistrarPostre(String nombrePostre, String ingrediente, int folio, int posicion){
                objetoPostre = new Postre(folio,nombrePostre,ingrediente);
                ListaPostres[posicion-1] = objetoPostre;
            }
            public static void VizualizarPostres(){
          if (ListaParticipantes== null || ListaParticipantes.length== 0) {
    System.out.printf("Esta Lista Esta Vacia!\n");
    }
          else {


        for(int i=1;i<=5;i++){
           System.out.println("Numero "+ListaPostres [i-1].getFolio() +"\nNombre:  "+ ListaPostres [i-1].getNombrePostre());
        }
            }
            }
            public static void VizualizarRegistros(){
          if (ListaParticipantes == null || ListaParticipantes.length== 0) {
            System.out.printf("Este Array Esta Vacio!!\n");
        }
        else
           for (int i=1 ; i<=5; i++){
               System.out.println("Folio: "+ListaParticipantes[i-1].getFolio());
               System.out.println("Nombre: "+ListaParticipantes[i-1].getNombre());
    }
}
    public static void BuscarParticipante(){
        Scanner Buscar= new Scanner(System.in);
        boolean Encontrado = true;
        int numeroBuscado=0;
        System.out.println("Digite el folio del participante");
        numeroBuscado= Buscar.nextInt();
        for (int i=1 ; i<=5; i++){
            if (ListaParticipantes[i-1].getFolio()==(numeroBuscado)){
                System.out.println("folio: "+ ListaParticipantes[i].getFolio()+ " Nombre del participante: "+ ListaParticipantes[i].getNombre());
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
            public static void BuscarPostre(){
                if (ListaParticipantes== null || ListaParticipantes.length== 0) {
                    System.out.printf("Esta Lista Esta Vacia!\n");
                }
                else {
                Scanner Buscar= new Scanner(System.in);
                bandera=false;
                String PostreBuscado;
                System.out.println("Digite el Nombre del Postre: ");
                PostreBuscado= Buscar.nextLine();
                for (int i=0 ; i<=4; i++){
                    if (ListaPostres[i].getNombrePostre().equals(PostreBuscado)){
                        System.out.println("Datos encontrados con el folio: "+ ListaPostres[i].getFolio()+ " Ingrediente: "+ ListaPostres[i].getIngrediente());
                        bandera = true;
                    }

                }
                if (bandera=false){
                    System.out.println("Datos no encontrados....");
                }
            }
            }
    }
