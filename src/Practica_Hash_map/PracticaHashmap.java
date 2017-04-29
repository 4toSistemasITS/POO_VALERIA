
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Valeria
 */
public class PracticaHashmap {
    public static void main(String[] args) {
        HashMap<String,String> ejemplo= new HashMap();
        ejemplo.put("Lady", "Valeria");
        ejemplo.put("Calva","Merizalde");
        for (Map.Entry<String, String> entry : ejemplo.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Clave "+key+" Valor: "+ value);
        }
        ejemplo.replace("Lady", "bbbbb");
        System.out.println(ejemplo.containsValue("Merizalde"));
        System.out.println(ejemplo.get("Lady"));
        
    }
    
}
