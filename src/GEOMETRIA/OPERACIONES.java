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
public class OPERACIONES implements FIGURAS{

    @Override
    public void triangulo() {
        double base,altura;
        double area, perimetro;
        Scanner t= new Scanner(System.in);
        System.out.println("Ingrese el valor de la base del triangulo: ");
        base=t.nextDouble();
        System.out.println("Ingrese la altura del triangulo: ");
        altura= t.nextDouble();
        area=(base*altura)/2;
        perimetro= base+base+base;
        System.out.println( "El area del triangulo es: "+area+"\n"+"El perimetro del triangulo es: "+ perimetro);
        
    }

    @Override
    public void circulo() {
       double radio;
       double area, perimetro;
        Scanner cir= new Scanner(System.in);
        System.out.println("Ingrese el radio del círculo: ");
        radio= cir.nextDouble();
        area=(radio*radio)* 3.1416 ;
        perimetro=2*(3.1416*radio);
        System.out.println( "El area del círculo: "+area+"\n"+"El perimetro del círculo es: "+ perimetro);
    }

    @Override
    public void cuadrado() {
        int lado;
        double area=0;
        double perimetro=0;
        Scanner c= new Scanner(System.in);
        System.out.println("Ingrese el valor del lado del cuadrado: ");
        lado=c.nextInt();
        area=lado*lado;
        perimetro=lado+lado+lado+lado;
        System.out.println( "El area del cuadrado es: "+area+"\n"+"El perimetro de un cuadrado es: "+ perimetro);
}

    @Override
    public void rectangulo() {
        int base,altura, area, perimetro;
        Scanner rec= new Scanner(System.in);
        System.out.println("Ingrese el valor de la base del rectangulo: ");
        base= rec.nextInt();
        System.out.println("Ingrese el valor de la altura del rectangulo: ");
        altura=rec.nextInt();
        area=base*altura;
        perimetro=base+base+altura+altura;
        System.out.println( "El area del rectangulo es: "+area+"\n"+"El perimetro del rectangulo es: "+ perimetro);
    }
}
