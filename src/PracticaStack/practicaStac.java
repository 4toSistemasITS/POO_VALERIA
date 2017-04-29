package PracticaStack;


import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Valeria
 */
public class practicaStac {
    public static void main(String[] args) {
        Stack<Integer> sta = new Stack<>();
        venderEntrada(sta);
        imprimir(sta);
        salirCine(sta);
        
    }
    public static void venderEntrada(Stack<Integer>sta){  
        int entradas;
        Scanner ne= new Scanner (System.in);
        System.out.println("Ingrese  el número de entradas vendodas: ");
        entradas=ne.nextInt();
        for (int i = 0; i <= entradas; i++) {
            sta.push(i);
        }
            
    }
    public static void salirCine(Stack<Integer> sta){
            System.out.println(sta.pop());
        
    }
    public static void imprimir(Stack<Integer>sta){
        for (int i = 0; i < sta.size(); i++) {
            System.out.println(sta.get(i));
        }
    }
}

