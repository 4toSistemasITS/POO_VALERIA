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
public class Recursivo {
    public int recursivo(int numero, int limite){
        int valor;
        if (numero<limite){
            System.out.println("Entro al mètodo");
            numero=numero+2;
            valor = recursivo(numero,limite);
        }else{
           valor= numero; 
        }
        return valor;
    }

    public static void main(String[] args) {
        int numero=2;
        int limite=10;
        Recursivo re= new Recursivo();
        System.out.println(re.recursivo(numero, limite));
    }
}
