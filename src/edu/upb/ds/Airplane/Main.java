package edu.upb.ds.Airplane;

import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;

public class Main {

    public static void main(String[] args) {
        //ZONA DE PRUEBAS , PARA FUNCIONAMIENTO DE PROGRAMA.
        //POR FAVOR , IR A CLASE "PROGRAMA" PARA VER SU
        //FUNCIONAMIENTO CORRECTO.

/*
        List list1=new List();
        Avion a=new Avion();
        a.setId(123456789);
        a.setPuesto(139);
        a.setOrigen("Bucaramanga");
        a.setDestino("Cúcuta");
        ZoneId defaultZoneId = ZoneId.systemDefault();
        LocalDate temporalDate=LocalDate.now();
        Date newDate = Date.from(temporalDate.atStartOfDay(defaultZoneId).toInstant());
        a.setHora_salida(newDate);
        list1.add(a);
        System.out.println(list1.getHead());
        Object b = list1.getHead();
        String origenTemporal =b.toString();
        Object avionTemporal = list1.getHead();
        System.out.println("##########");
        System.out.println(avionTemporal.toString());
        Avion avionNuevo=Avion.class.cast(avionTemporal);
        avionNuevo.setPuesto(139);
        list1.add(avionNuevo);
        System.out.println("##########");
        System.out.println("##########");
        for(ListNode node=list1.head;node !=null;node=node.next)
        {
            System.out.println(node.toString());
        }
        System.out.println("##########");

        for(int i=0;i<10;i++){
            list1.add(i);
        }

        for(ListNode node=list1.head;node !=null;node=node.next)
        {
            System.out.println(node.toString());
        }
        System.out.println("\n###################");
        System.out.println("\n"+list1.getHead());
        System.out.println("\n###################");

         */

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
    }
}
