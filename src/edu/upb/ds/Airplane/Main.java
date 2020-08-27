package edu.upb.ds.Airplane;

import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;

public class Main {

    public static void main(String[] args) {

        List list1=new List();
        Avion a=new Avion();
        a.setId(123456789);
        a.setPuesto(144);
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

        /*
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
    }
}
