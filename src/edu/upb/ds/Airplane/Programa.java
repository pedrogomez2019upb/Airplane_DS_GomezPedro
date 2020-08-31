package edu.upb.ds.Airplane;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        //###################################
        //Initial Variables
        //###################################
        //We create the variables needed for start
        //developing the program
        boolean programExit = false;
        List listaAviones = new List();
        List listaRegistro = new List();
        Scanner sc = new Scanner(System.in);

        Avion a=new Avion();
        a.setId(123456789);
        a.setPuesto(144);
        a.setOrigen("Bucaramanga");
        a.setDestino("Cúcuta");
        Date hora_salida= new Date();
        hora_salida.setHours(9);
        hora_salida.setMinutes(30);
        hora_salida.setSeconds(0);
        a.setHora_salida(hora_salida);
        listaAviones.add(a);

        Avion b=new Avion();
        b.setId(574839564);
        b.setPuesto(144);
        b.setOrigen("Cúcuta");
        b.setDestino("Bucaramanga");
        Date hora_salida2= new Date();
        hora_salida2.setHours(9);
        hora_salida2.setMinutes(50);
        hora_salida2.setSeconds(0);
        b.setHora_salida(hora_salida2);
        listaAviones.add(b);


        while (!programExit) {
            int option = 0;
            //###################################
            //Creating main menu
            //###################################
            System.out.println("\n############################");
            System.out.println("\nBienvenido/a a la Aerolinea AV-UPB");
            System.out.println("\n############################");
            System.out.println("\nSeleccione alguna de las siguientes opciones de acuerdo a lo que es:");
            System.out.println("\n1:Pasajero");
            System.out.println("\n2:Personal Administrativo");
            System.out.println("\n3:Salir");
            option = sc.nextInt();
            if(option==1){
                System.out.println("\n############################");
                System.out.println("\nVUELOS DISPONIBLES - Pasajero");
                System.out.println("\n############################");
                listaAviones.rec(listaAviones.head);
                System.out.println("\nQue vuelo te gustaria tomar? (Ingresar ID de vuelo)");
                int idtemporal=sc.nextInt();
                int tamanoListaAviones= listaAviones.getSize();
                Avion avionEscogido=new Avion();
                for(int i=0;i<tamanoListaAviones;i++)
                {
                    Object temporal = listaAviones.get(i);
                    Avion avionNuevo=Avion.class.cast(temporal);
                    if(avionNuevo.getId()==idtemporal){
                        avionEscogido=avionNuevo;
                    }
                }
                System.out.println("\n############################");
                System.out.println("\nVUELOS ESCOGIDO - Pasajero");
                System.out.println("\n############################");
                System.out.println(avionEscogido);
                break;
            }else if (option==2){

            }else if (option==3){
                System.out.println("\n############################");
                System.out.println("\nGracias por visitar la Aerolinea AV-UPB");
                System.out.println("\n############################");
                break;
            }
        }
    }
}
