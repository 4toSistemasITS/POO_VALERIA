/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_ecepciones;

/**
 *
 * @author Valeria
 */
public class Exepcion_practica extends Exception{

    public Exepcion_practica(String message) {
        super(message);
    }
    public static void validar_numero(int a,int b) throws Exepcion_practica{
        if(!(a>0 && b>0)){
            throw new Exepcion_practica("El nùmero es negativo");
        }
    }
}
