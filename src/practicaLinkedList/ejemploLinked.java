/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaLinkedList;

import java.util.LinkedList;

/**
 *
 * @author Valeria
 */
public class ejemploLinked {
    public static void main(String[] args) {
        LinkedList<String> link= new LinkedList<>();
        link.add("hola");
        link.add("Valeria");
        link.add("Diego");
        link.add("Fabian");
        System.out.println(link.peek());
        link.poll();
        link.poll();
        link.poll();
        link.poll();
        System.out.println(link.peek());
        System.out.println(link.element());

        
    }
}
