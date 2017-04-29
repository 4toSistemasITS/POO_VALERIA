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
public class Practica_ArraysList_Valeria {
    public static void main(String[] args) {
        ArrayList<String>lista=new ArrayList<>();
        ArrayList<String>lista2=new ArrayList<>();
        
        lista.add("Cálculo");
        lista.add("Programación IV");
        lista.add("Análisis de sistemas II");
        lista.add("Base de datos II");
        lista.add("Hardware");
        lista.add("Ingles");
        imprimirPortamanio(lista2);
    }
    public static void imprimirPortamanio(ArrayList<String> lista){
        ArrayList<String>lista2=new ArrayList<>();
        String cad,cad2;
        int cont=0;       
        int dimension_pe=0;
        for (int i = lista.size()-1; i >=0; i--) {
            cad=lista.get(i);
            if(dimension_pe>cad.length() ){
                cont=cont+1;
                lista2.add(cont,cad);
            }else{
                cont=cont-1;
            }
            dimension_pe=cad.length();
            System.out.println(lista2.get(i));
        }
    }

}
