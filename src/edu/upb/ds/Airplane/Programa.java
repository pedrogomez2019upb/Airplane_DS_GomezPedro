package edu.upb.ds.Airplane;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
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
        int idAvion=1;
        int idRegistro=1;

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
        idAvion++;

        Avion c=new Avion();
        c.setId(idAvion);
        c.setPuesto(139);
        c.setOrigen("Cúcuta");
        c.setDestino("Bucaramanga");
        Date hora_salida3= new Date();
        hora_salida3.setHours(20);
        hora_salida3.setMinutes(0);
        hora_salida3.setSeconds(0);
        c.setHora_salida(hora_salida3);
        listaAviones.addEnd(c);
        idAvion++;

        Avion d=new Avion();
        d.setId(idAvion);
        d.setPuesto(139);
        d.setOrigen("Bucaramanga");
        d.setDestino("Cúcuta");
        Date hora_salida4= new Date();
        hora_salida4.setHours(8);
        hora_salida4.setMinutes(0);
        hora_salida4.setSeconds(0);
        d.setHora_salida(hora_salida4);
        listaAviones.addEnd(d);
        idAvion++;
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
        ListNode nodoAvion = new ListNode(1);
        listaAviones.remove(nodoAvion);
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
            Object avionTemporal1=listaAviones.get(0);
            Avion avion1= Avion.class.cast(avionTemporal1);
            int cantidadAsientosDisponibles1=avion1.getPuesto();
            Object avionTemporal2=listaAviones.get(1);
            Avion avion2= Avion.class.cast(avionTemporal2);
            int cantidadAsientosDisponibles2=avion2.getPuesto();
            /*
            if(cantidadAsientosDisponibles1<=70){

            }
            */
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
                int posicionAvionEscogido=0;
                for(int i=0;i<tamanoListaAviones;i++)
                {
                    Object temporal = listaAviones.get(i);
                    Avion avionNuevo=Avion.class.cast(temporal);
                    if(avionNuevo.getId()==idtemporal)
                    {
                        avionEscogido=avionNuevo;
                        posicionAvionEscogido=i;
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
                        idRegistro++;
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
                        contador_asiento1++;
                        registroTemporal.setAsiento(contador_asiento1);
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

                            }else
                                {
                                    registroTemporal.setPeso(pesoTemporal);
                                boolPeso=true;
                                }
                        }
                        int asientosDisponibles=avionEscogido.getPuesto();
                        asientosDisponibles--;
                        avionEscogido.setPuesto(asientosDisponibles);
                        ListNode nodoAvionEscogido = new ListNode(posicionAvionEscogido);
                        listaAviones.remove(nodoAvionEscogido);
                        listaAviones.add(avionEscogido);
                        listaRegistro.add(registroTemporal);
                        System.out.println("\n############################");
                        System.out.println("\nRegistro Grabado Correctamente - Pasajero");
                        System.out.println("\n############################");
                        System.out.println(registroTemporal);
                        System.out.println("\n############################");
                        System.out.println("\nDEVOLVIENDO A MENÚ PRINCIPAL");
                        System.out.println("\n############################");
                        continue;
                    }
                }

            }else if (option==2){
                System.out.println("\n############################");
                System.out.println("\nPersonal Administrativo");
                System.out.println("\n############################");
                System.out.println("\n############################");
                System.out.println("\nVUELOS DISPONIBLES - Personal Administrativo");
                System.out.println("\n############################");
                listaAviones.rec(listaAviones.head);
                System.out.println("\n############################");
                System.out.println("\nPASAJEROS REGISTRADOS - Personal Administrativo");
                System.out.println("\n############################");
                listaRegistro.rec(listaRegistro.head);
                System.out.println("\nQuieres editar algun pasajero?");
                System.out.println("\n1:Si");
                System.out.println("\n2:No");
                int opcionPasajero=sc.nextInt();
                if (opcionPasajero==1){
                    System.out.println("\nComo es la identificacion del registro?");
                    int idtemporal=sc.nextInt();
                    int tamanoListaRegistro= listaRegistro.getSize();
                    Registro registroEscogido=new Registro();
                    int posicionRegistroEscogido=0;
                    for(int i=0;i<tamanoListaRegistro;i++)
                    {
                        Object temporal = listaRegistro.get(i);
                        Registro registroNuevo=Registro.class.cast(temporal);
                        if(registroNuevo.getId_registro()==idtemporal)
                        {
                            registroEscogido=registroNuevo;
                            posicionRegistroEscogido=i;
                        }
                    }
                    System.out.println("\n############################");
                    System.out.println("\nRegistro Escogido");
                    System.out.println("\n############################");
                    System.out.println(registroEscogido);
                    boolean booleanoCambioPasajero=false;
                    while(!booleanoCambioPasajero){
                        System.out.println("\nQue te gustaria modificar del pasajero?");
                        System.out.println("\n1:Nombre");
                        System.out.println("\n2:Apellido");
                        System.out.println("\n3:Fecha Compra");
                        System.out.println("\n4:Tipo Identificacion");
                        System.out.println("\n5:Identificacion");
                        System.out.println("\n6:Peso Equipaje");
                        System.out.println("\n7:Direccion");
                        System.out.println("\n8:Celular");
                        System.out.println("\n9:Categoria");
                        System.out.println("\n10:Avion");
                        int opcionDatoModificar=sc.nextInt();
                        if(opcionDatoModificar==1){
                            System.out.println("\nPor favor ingresa el nombre nuevo:");
                            String nombreNuevo=sc.next().toString();
                            registroEscogido.setNombre_pasajero(nombreNuevo);
                        } else if (opcionDatoModificar==2){
                            System.out.println("\nPor favor ingresa el apellido nuevo:");
                            String apellidoNuevo=sc.next().toString();
                            registroEscogido.setApellido_pasajero(apellidoNuevo);
                        }else if (opcionDatoModificar==3){
                            Date nuevoDia = new Date();
                            System.out.println("\nPor favor ingresa la hora (FORMATO 24H):");
                            int horaTemporalRegistro=sc.nextInt();
                            System.out.println("\nPor favor ingresa los minutos:");
                            int minutosTemporalRegistro=sc.nextInt();
                            System.out.println("\nPor favor ingresa los segundos:");
                            int segundosTemporalRegistro=sc.nextInt();
                            nuevoDia.setHours(horaTemporalRegistro);
                            nuevoDia.setMinutes(minutosTemporalRegistro);
                            nuevoDia.setSeconds(segundosTemporalRegistro);
                            LocalDateTime nuevoDiaLocal=nuevoDia.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();;
                            registroEscogido.setFecha_compra(nuevoDiaLocal);
                        }
                        else if (opcionDatoModificar==4){
                            System.out.println("\nPor favor ingresa el tipo de identificacion nuevo:");
                            String tipoIDNuevo=sc.next().toString();
                            registroEscogido.setTipo_identificacion(tipoIDNuevo);
                        }
                        else if (opcionDatoModificar==5){
                            System.out.println("\nPor favor ingresa la identificacion nuevo:");
                            String identificacionNuevo=sc.next().toString();
                            registroEscogido.setIdentificacion(identificacionNuevo);
                        }
                        else if (opcionDatoModificar==6){
                            boolean boolPesoRegistro=false;
                            while(!boolPesoRegistro) {
                                System.out.println("\nPor favor ingresar el nuevo peso de equipaje en KG:");
                                int pesoTemporal = sc.nextInt();
                                if (pesoTemporal > 52) {
                                    System.out.println("\n############################");
                                    System.out.println("\nLo siento pero no esta permitido llevar ");
                                    System.out.println("\nmás de 52 KG ");
                                    System.out.println("\nVuelva a intentar");
                                    System.out.println("\n############################");

                                }else
                                {
                                    registroEscogido.setPeso(pesoTemporal);
                                    boolPesoRegistro=true;
                                }
                            }

                        }
                        else if (opcionDatoModificar==7){
                            System.out.println("\nPor favor ingresa la direccion nueva:");
                            String direcionNuevoRegistro=sc.next().toString();
                            registroEscogido.setDireccion(direcionNuevoRegistro);
                        }
                        else if (opcionDatoModificar==8){
                            System.out.println("\nPor favor ingresa el celular nuevo:");
                            long celularNuevoRegistro=sc.nextLong();
                            registroEscogido.setCelular(celularNuevoRegistro);
                        }
                        else if (opcionDatoModificar==9){
                            System.out.println("\nA que categoria vas a cambiar?:");
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
                            registroEscogido.setCategoria(tipoCategoriaTemporal);
                            registroEscogido.setPrecio(valorcategoriaTemporal);
                        }
                        else if (opcionDatoModificar==10){
                            System.out.println("\n############################");
                            System.out.println("\nVUELOS DISPONIBLES - ADMIN");
                            System.out.println("\n############################");
                            listaAviones.rec(listaAviones.head);
                            System.out.println("\nQue vuelo te gustaria tomar? (Ingresar ID de vuelo)");
                            int idtemporalAvionCambiar=sc.nextInt();
                            int tamanoListaAvionesCambiar= listaAviones.getSize();
                            Avion avionEscogidoCambiar=new Avion();
                            int posicionAvionEscogido=0;
                            for(int i=0;i<tamanoListaAvionesCambiar;i++)
                            {
                                Object temporal = listaAviones.get(i);
                                Avion avionNuevo=Avion.class.cast(temporal);
                                if(avionNuevo.getId()==idtemporalAvionCambiar)
                                {
                                    avionEscogidoCambiar=avionNuevo;
                                    posicionAvionEscogido=i;
                                }
                            }
                            registroEscogido.setAvion(avionEscogidoCambiar);
                        }
                        System.out.println("\n############################");
                        System.out.println("\nREGISTRO NUEVO - ADMIN");
                        System.out.println("\n############################");
                        System.out.println(registroEscogido);
                        System.out.println("\nQuieres cambiar otro dato del registro?");
                        System.out.println("\n1:Si");
                        System.out.println("\n2:No");
                        int opcionBucle = sc.nextInt();
                        if (opcionBucle==1){
                            continue;
                        }
                        else if(opcionBucle==2){
                            ListNode nodoRemoverRegistro= new ListNode(posicionRegistroEscogido);
                            listaRegistro.remove(nodoRemoverRegistro);
                            booleanoCambioPasajero=true;
                            System.out.println("\nCambiado satisfactoriamente!");
                            System.out.println("\n############################");
                            System.out.println("\nNUEVA LISTA REGISTRO");
                            System.out.println("\n############################");
                            listaRegistro.rec(listaRegistro.head);
                        }
                    }

                } else if(opcionPasajero==2){
                    System.out.println("\n############################");
                    System.out.println("\nDEVOLVIENDO A MENÚ PRINCIPAL");
                    System.out.println("\n############################");
                }
            }else if (option==3){
                System.out.println("\n############################");
                System.out.println("\nGracias por visitar la Aerolinea AV-UPB");
                System.out.println("\n############################");
                programExit=true;
            }
            else{
                System.out.println("\n############################");
                System.out.println("\nLo siento , por favor vuelve a escoger");
                System.out.println("\nuna opcion correcta.");
                System.out.println("\n############################");
            }
        }
    }
}
