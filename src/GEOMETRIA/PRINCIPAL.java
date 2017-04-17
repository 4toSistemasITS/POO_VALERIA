/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GEOMETRIA;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Valeria
 */
public class PRINCIPAL {
    public static void main(String[] args) {
         int opcion;
         Scanner sc= new Scanner(System.in);
         System.out.println("CÁLCULO DEL AREA Y PERIMETRO \n"+"Ingrese una opción: \n"+"1)CUADRADO \n"+"2)TRIANGULO\n"+"3)CÍRCULO\n"+"4)RECTANGULO");
         opcion=sc.nextInt();
         OPERACIONES o= new OPERACIONES();
        switch(opcion){
            case 1:
                o.cuadrado();
                break;
            case 2:
                o.triangulo();
                break;
            case 3:
                o.circulo();
                break;
            case 4:
                o.rectangulo();
            
        }
                
    }
}
