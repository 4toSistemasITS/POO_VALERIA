/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTERFAZ;

/**
 *
 * @author Valeria
 */
public class PENTAGONO implements FIGURA_GEOMETRICA{

    @Override
    public double area() {
        return 4;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double perimetro(int valor) {
        valor = valor*5;
        return valor;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
