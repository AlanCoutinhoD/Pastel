import com.upchiapas.Participante;
import com.upchiapas.Postre;

import java.util.Scanner;
public class  Main{
    public static void main (String []args){

        Scanner entrada= new Scanner(System.in);
        int opcion = 0;
        do
        {
            System.out.printf("Escoja entre las opciones 1.Registro de Participante 2.Visualizar Participantes 3.Vizualizar Postres 4.Buscar Postres");
            opcion=entrada.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Registro de Participantes");
                    Participante.registrarParticipante();
                    break;
                case 2:
                    Participante.visualizarRegistros();
                    break;
                case 3:
                    Postre.visualizarPost();
                    break;
                case 4:
                    Postre.BuscarP();
            break;
                case 5:
                    Participante.BuscarParticipante();
                    break;
            }

        }
        while(opcion<6);

        }
    }
