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
public class ROMBO implements FIGURA_GEOMETRICA{

    @Override
    public double perimetro(int valor) {
        valor= valor+valor+valor+valor;
        return valor;
    }

    @Override
    public double area() {
        return 10;
    }
}
