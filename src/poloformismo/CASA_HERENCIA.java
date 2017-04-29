/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poloformismo;

/**
 *
 * @author Valeria
 */
public class CASA_HERENCIA extends INMUEBLE{
    private int numero_pisos;
    private String material;
    private boolean zona_verde;
    private String tipo_techo;

    public int getNumero_pisos() {
        return numero_pisos;
    }

    public void setNumero_pisos(int numero_pisos) {
        this.numero_pisos = numero_pisos;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isZona_verde() {
        return zona_verde;
    }

    public void setZona_verde(boolean zona_verde) {
        this.zona_verde = zona_verde;
    }

    public String getTipo_techo() {
        return tipo_techo;
    }

    public void setTipo_techo(String tipo_techo) {
        this.tipo_techo = tipo_techo;
    }
    
    public static void main(String[] args) {
        CASA_HERENCIA  casa= new CASA_HERENCIA();
        double cas=0;
        casa.setDimension(200);
        casa.setNumero_pisos(4);
        cas= casa.avaluar();
        System.out.println(casa.avaluar());
        System.out.println(casa.comisionar_venta(cas));
    }

    public CASA_HERENCIA() {
    }

    public CASA_HERENCIA(String ubicacion, double dimension, double avaluo, int numero_inmueble, boolean servicios_basicos, double latitud, double longitud) {
        super(ubicacion, dimension, avaluo, numero_inmueble, servicios_basicos, latitud, longitud);
    }
    public double avaluar(){
        double avaluo=0;
        avaluo=(this.getDimension()*500)* this.getNumero_pisos();
        return avaluo;
    }
    public double comisionar_venta(double avaluo){
        double comision=0;
        if (avaluo> 100000){
            comision= (avaluo*13)/100;
        }else{
            comision=(avaluo*7)/100;
        }
        return comision;
    }

  
}
