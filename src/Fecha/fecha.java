/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fecha;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Valeria
 */
public class fecha {
    public static void main(String[] args) {
        Date fechaactual=new Date();
//        SimpleDateFormat formato= new SimpleDateFormat("yyyy-MM-dd");
//        String fecha=formato.format(fechaactual);
//        //SimpleDateFormat formato= new SimpleDateFormat("hh:mm:ss");
//        //PARA TRANSFORMAR UN STRING A UNA FECHA
//        String fechacambiar="2017-05-29";
//        try {
//            Date fechacambiada= formato.parse(fechacambiar);
//            System.out.println("La fecha cambiada es: "+fechacambiada);
//        } catch (ParseException ex) {
//            Logger.getLogger(fecha.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        System.out.println("La fecha en String es:" + fecha);
        GregorianCalendar calendar= new GregorianCalendar();
        calendar.setTime(fechaactual);
        int a =calendar.get(GregorianCalendar.DAY_OF_YEAR);
        int b =calendar.get(GregorianCalendar.WEEK_OF_YEAR);
        int horadia =calendar.get(GregorianCalendar.HOUR_OF_DAY);
        //calendar.add(GregorianCalendar.HOUR_OF_DAY, GregorianCalendar.HOUR_OF_DAY+1);
        //calendar.add(GregorianCalendar.HOUR_OF_DAY, GregorianCalendar.HOUR+1);
        calendar.add( GregorianCalendar.HOUR,+1);
        System.out.println("El día del año: "+a);
        System.out.println("El día del año: "+b);
        System.out.println(calendar.getTime());
    }
    
}
