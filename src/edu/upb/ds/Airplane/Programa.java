package edu.upb.ds.Airplane;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class Programa {
    /*
    public LocalDateTime convertToLocalDateTimeViaInstant(Date dateToConvert) {
        return dateToConvert.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

     */

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
        int idAvion=0;
        int idRegistro=0;
        Avion a=new Avion();
        a.setId(idAvion);
        a.setPuesto(139);
        a.setOrigen("Bucaramanga");
        a.setDestino("Cúcuta");
        Date hora_salida= new Date();
        hora_salida.setHours(6);
        hora_salida.setMinutes(30);
        hora_salida.setSeconds(0);
        a.setHora_salida(hora_salida);
        listaAviones.addEnd(a);
        idAvion++;

        Avion b=new Avion();
        b.setId(idAvion);
        b.setPuesto(139);
        b.setOrigen("Cúcuta");
        b.setDestino("Bucaramanga");
        Date hora_salida2= new Date();
        hora_salida2.setHours(18);
        hora_salida2.setMinutes(50);
        hora_salida2.setSeconds(0);
        b.setHora_salida(hora_salida2);
        listaAviones.addEnd(b);
        /*
        System.out.println("\n############################");
        System.out.println("\nOriginal");
        listaAviones.rec(listaAviones.head);
        System.out.println("\nSize");
        System.out.println(listaAviones.size);
        System.out.println("\n############################");
        Object avionTemporal=listaAviones.get(1);
        Avion prueba= Avion.class.cast(avionTemporal);
        System.out.println("\n############################");
        System.out.println("\nObjecto encontrado");
        System.out.println(prueba);
        System.out.println("\nSize");
        System.out.println(listaAviones.size);
        System.out.println("\n############################");
        prueba.setId(250);
        listaAviones.remove(1);
        System.out.println("\n############################");
        System.out.println("\nObjeto extraido");
        listaAviones.rec(listaAviones.head);
        System.out.println("\nSize");
        System.out.println(listaAviones.size);
        System.out.println("\nNuevo objeto");
        System.out.println(prueba);
        System.out.println("\nSize");
        System.out.println(listaAviones.size);
        System.out.println("\n############################");
        listaAviones.addEnd(prueba);
        System.out.println("\n############################");
        System.out.println("\nLista final");
        listaAviones.rec(listaAviones.head);
        System.out.println("\nSize");
        System.out.println(listaAviones.size);
        System.out.println("\n############################");

         */


        int contador_asiento1=0;
        int contador_asiento2=0;
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
                LocalDateTime horaLocal = LocalDateTime.now();
                //Date horaLocal_date=Date.from(horaLocal.atZone(ZoneId.systemDefault()).toInstant());
                int hours  = horaLocal.getHour();
                int minutes = horaLocal.getMinute();
                int seconds = horaLocal.getSecond();
                System.out.println("Hora actual : " + hours  + ":"+ minutes +":"+seconds);
                Date horaVuelo= avionEscogido.getHora_salida();
                LocalDateTime horaVuelo_dt = horaVuelo.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
                int minutosComparar = (int) ChronoUnit.MINUTES.between(horaLocal, horaVuelo_dt);
                //System.out.println(minutosComparar);
                /*
                System.out.println(horaLocal);
                System.out.println(horaVuelo_dt);
                System.out.println(minutosComparar);

                 */
                if (minutosComparar<=-30){
                    System.out.println("\n############################");
                    System.out.println("\nLo siento pero ya paso la media hora de modificacion ");
                    System.out.println("\nGracias por visitar la Aerolinea AV-UPB");
                    System.out.println("\n############################");
                    break;
                }else {
                    int asientosTemporal = avionEscogido.getPuesto();
                    if (asientosTemporal == 0) {
                        System.out.println("\n############################");
                        System.out.println("\nLo siento pero ya el vuelo esta lleno ");
                        System.out.println("\nGracias por visitar la Aerolinea AV-UPB");
                        System.out.println("\n############################");
                    } else {
                        Registro registroTemporal = new Registro();
                        System.out.println("\n############################");
                        System.out.println("\nNuevo Registro - Pasajero");
                        System.out.println("\n############################");
                        registroTemporal.setId_registro(idRegistro);
                        registroTemporal.setFecha_compra(horaLocal);
                        registroTemporal.setAvion(avionEscogido);
                        System.out.println("\nPor favor ingrese tu nombre:");
                        String nombreTemporal = sc.next().toString();
                        registroTemporal.setNombre_pasajero(nombreTemporal);
                        System.out.println("\nPor favor ingrese tu apellido:");
                        String apellidoTemporal = sc.next().toString();
                        registroTemporal.setApellido_pasajero(apellidoTemporal);
                        System.out.println("\nQue tipo de identificacion posee?:");
                        System.out.println("\n1:Tarjeta de identidad");
                        System.out.println("\n2:Cédula de Ciudadania");
                        System.out.println("\n3:Pasaporte");
                        int opcionTipo = sc.nextInt();
                        String tipoidentificacionTemporal = "";
                        if (opcionTipo == 1) {
                            tipoidentificacionTemporal = "T.I";
                        } else if (opcionTipo == 2) {
                            tipoidentificacionTemporal = "C.C";
                        } else if (opcionTipo == 3) {
                            tipoidentificacionTemporal = "PASSPORT";
                        }
                        System.out.println("\nIngrese su identificacion:");
                        String identificacionTemporal = sc.next().toString();
                        registroTemporal.setTipo_identificacion(tipoidentificacionTemporal);
                        registroTemporal.setIdentificacion(identificacionTemporal);
                        System.out.println("\nIngrese su celular:");
                        long celularTemporal = sc.nextLong();
                        registroTemporal.setCelular(celularTemporal);
                        System.out.println("\nIngrese su direccion:");
                        String direcciontemporal=sc.next().toString();
                        registroTemporal.setDireccion(direcciontemporal);
                        System.out.println("\nQue tipo de categoria le gustaria comprar?:");
                        System.out.println("\n1:Premium ($7.000.000)");
                        System.out.println("\n2:Ejecutivo ($300.000)");
                        System.out.println("\n3:Económico ($120.000)");
                        int opcionCategoria=0;
                        int valorcategoriaTemporal=0;
                        String tipoCategoriaTemporal="";
                        opcionCategoria=sc.nextInt();
                        if (opcionCategoria==1){
                            valorcategoriaTemporal=7000000;
                            tipoCategoriaTemporal="Premium";
                        }else if(opcionCategoria==2){
                            valorcategoriaTemporal=300000;
                            tipoCategoriaTemporal="Ejecutivo";
                        }else if(opcionCategoria==3){
                            valorcategoriaTemporal=120000;
                            tipoCategoriaTemporal="Económico";
                        }
                        registroTemporal.setCategoria(tipoCategoriaTemporal);
                        registroTemporal.setPrecio(valorcategoriaTemporal);
                        registroTemporal.setAsiento(contador_asiento1);
                        contador_asiento1++;
                        registroTemporal.setAvion(avionEscogido);
                        boolean boolPeso=false;
                        while(!boolPeso) {
                            System.out.println("\nPor favor ingresar el peso de equipaje en KG:");
                            int pesoTemporal = sc.nextInt();
                            if (pesoTemporal > 52) {
                                System.out.println("\n############################");
                                System.out.println("\nLo siento pero no esta permitido llevar ");
                                System.out.println("\nmás de 52 KG ");
                                System.out.println("\nVuelva a intentar");
                                System.out.println("\n############################");

                            }else{
                                boolPeso=true;
                            }
                        }
                        listaRegistro.add(registroTemporal);
                        System.out.println("\n############################");
                        System.out.println("\nRegistro Grabado Correctamente - Pasajero");
                        System.out.println("\n############################");
                        System.out.println(registroTemporal);

                    }
                }
                break;
            }else if (option==2){

            }else if (option==3){
                System.out.println("\n############################");
                System.out.println("\nGracias por visitar la Aerolinea AV-UPB");
                System.out.println("\n############################");
                programExit=true;
            }
        }
    }
}
