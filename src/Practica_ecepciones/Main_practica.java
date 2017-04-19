/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_ecepciones;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Valeria
 */
public class Main_practica {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        try {
            Exepcion_practica.validar_numero(a, b);
            System.out.println(a+b);
        } catch (Exepcion_practica ex) {
            //Logger.getLogger(Main_practica.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
        
    }
}
