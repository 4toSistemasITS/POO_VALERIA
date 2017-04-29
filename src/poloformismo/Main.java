/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poloformismo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Valeria
 */
public class Main {
    public static void main(String[] args) {
        int opciones;
        int dimension;
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese  una opción:\n"+"1 Terreno\n"+ "2 Departamento\n"+"3 casa");
        opciones=sc.nextInt();
        switch(opciones){
            case 1:
                double T=0;
                System.out.println("Ingrese una dimensión");
                Scanner st= new Scanner(System.in);
                dimension=st.nextInt();
                TERRENO_HERENCIA terreno= new TERRENO_HERENCIA();
                terreno.setDimension(dimension);
                T=terreno.avaluar();
                System.out.println(terreno.avaluar());
                System.out.println(terreno.comisionar_venta(T));
                break;
            case 2:
                double de;
                double metros;
                String con;
                boolean amueblado;
                // PROCESO PARA INGRESAR  LA DIMENSION DESDE CONSOLA
                System.out.println("Ingrese una dimensión");
                Scanner sd= new Scanner(System.in);
                dimension=sd.nextInt();
                // PROCESO PARA INGRESAR DESDE CONSOLA LOS METROS DE CONSTRUCCION
                System.out.println("Ingrese  los metros de construcción: \n");
                metros= sd.nextInt();
                // PROCESO PARA LEER DESDE CONSOLA SI ES AMUEBLADO
                System.out.println("EN EL CASO DE SER AMUEBLADO INGRESE true(verdader) o false(falso): \n");
                amueblado=sd.nextBoolean();
                // SE INSTANCIA LA CLASE DEPARTAMENTO HERENCIA 
                DEPARTAMENTO_HERENCIA depar= new DEPARTAMENTO_HERENCIA();
                depar.setDimension(dimension);
                depar.setMetros_construccion(metros);
                depar.setAmueblado(amueblado);
                de=depar.avaluar();
                System.out.println(depar.avaluar());
                System.out.println(depar.comisionar_venta(de));
                break;
            case 3:
                int n_pisos;
                double ca;
                // PROCESO PARA INGRESAR  LA DIMENSION DESDE CONSOLA
                System.out.println("Ingrese una dimensión");
                Scanner sca= new Scanner(System.in);
                dimension=sca.nextInt();
                //RPOCESO PARA QUE LEER DESDE CONSOLA EL NÚMERO DE CUARTOS
                System.out.println("Ingrese el número de cuartos");
                n_pisos=sca.nextInt();
                // SE INSTANCIA LA CLASE DEPARTAMENTO HERENCIA 
                CASA_HERENCIA  casa= new CASA_HERENCIA();
                // SE ESTABLECEN LOS VALORES EN LA CLASE
                casa.setDimension(dimension);
                casa.setNumero_pisos(n_pisos);
                ca=casa.avaluar();
                System.out.println(casa.avaluar());
                System.out.println(casa.comisionar_venta(ca));
        }

    }
}
