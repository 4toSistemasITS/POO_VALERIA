/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_estructura_datos;

import java.util.ArrayList;

/**
 *
 * @author Valeria
 */
public class Estruc_datos {
    public static void main(String[] args) {

        ArrayList<String>lista= new ArrayList<>();
        for (int i=0;i<10;i++){
            lista.add("vacio ");
        }
        imprimirArrayListReverso(lista);
        lista.add(5,"uno");
        lista.add(1,"dos");
        lista.add(2,"tres");
        lista.add(3,"cuatro");
        lista.add(0,"cinco");
        imprimirArrayListReverso(lista);
        //imprimirArrayList(lista);
        //Eliminar un elemento de la lista
        //lista.remove(1);
        lista.set(8, "hola Vale");
        imprimirArrayListReverso(lista);
        
    }
    public static void imprimirArrayList(ArrayList <String>lista){
        for (String valor : lista) {
            System.out.println(valor);
        }  
    }
    public static void imprimirArrayListReverso(ArrayList <String>lista){
        for (int i = lista.size()-1; i >=0; i--) {
            System.out.println(lista.get(i)+"Posicion"+i);
        }
    }
}
