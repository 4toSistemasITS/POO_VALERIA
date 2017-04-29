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
public class Ejercicio_HashMap {
    public static void main(String[] args) {
        HashMap<String,String> datos= new HashMap();
        datos.put("usuario", "Lady");
        datos.put("Nombres", "Lady Valeria");
        datos.put("Password", "123");
        datos.put("Apellidos", "Calva Merizalde");
        datos.put("Curso","Cuarto");
        datos.put("Especialidad","Sistemas");
        for (Map.Entry<String, String> entry : datos.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue(); 
            String usuario;
            String password;
            System.out.println("Ingrese sus Usuario: ");
            Scanner sc= new Scanner(System.in);
            usuario=sc.nextLine();
            System.out.println("Ingrese su contraseña");
            password=sc.nextLine();
            if(datos.get("usuario").equals(usuario)&& datos.get("Password").equals(password)){
                System.out.println("Nombre: "+ datos.get("Nombres"));
                System.out.println("Apellidos: "+datos.get("Apellidos"));
                System.out.println("Curso:  "+datos.get("Curso"));
                System.out.println("Especialidad: "+datos.get("Especialidad"));
                break;
            }else{
                System.out.println("Los Datos no coinciden");
                break;
            }
        }
        
    }
 
        
}
