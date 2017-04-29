/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_Hash_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class ejercicio_HashMap_2 {
    public static void main(String[] args) {
        HashMap<Integer,String> datos= new HashMap();
        datos.put(1, "Lady");
        datos.put(2, "Lady Valeria");
        datos.put(3,"123");
        datos.put(4, "Calva Merizalde");
        datos.put(5,"Cuarto");
        datos.put(6,"Sistemas");
        for (Map.Entry<Integer, String> entry : datos.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            String usuario;
            String password;
            System.out.println("Ingrese sus Usuario: ");
            Scanner sc= new Scanner(System.in);
            usuario=sc.nextLine();
            System.out.println("Ingrese su contraseña");
            password=sc.nextLine();
            if(datos.get(1).equals(usuario)&& datos.get(3).equals(password)){
                System.out.println("Nombre: "+ datos.get(2));
                System.out.println("Apellidos: "+datos.get(4));
                System.out.println("Curso:  "+datos.get(5));
                System.out.println("Especialidad: "+datos.get(6));
                break;
            }else{
                System.out.println("Los Datos no coinciden");
                break;
            }
        }
    }
}
