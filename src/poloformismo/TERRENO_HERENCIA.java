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
public class TERRENO_HERENCIA extends INMUEBLE{
    private String tipo_suelo;
    private double codigo_catastral;
    private boolean cerramiento;

    public String getTipo_suelo() {
        return tipo_suelo;
    }

    public void setTipo_suelo(String tipo_suelo) {
        this.tipo_suelo = tipo_suelo;
    }

    public double getCodigo_catastral() {
        return codigo_catastral;
    }

    public void setCodigo_catastral(double codigo_catastral) {
        this.codigo_catastral = codigo_catastral;
    }

    public boolean isCerramiento() {
        return cerramiento;
    }

    public void setCerramiento(boolean cerramiento) {
        this.cerramiento = cerramiento;
    }
    public static void main(String[] args) {
        double ava=0;
        TERRENO_HERENCIA terreno= new TERRENO_HERENCIA();
        terreno.setDimension(200);
        ava=terreno.avaluar();
        System.out.println(terreno.avaluar());
        System.out.println(terreno.comisionar_venta(ava));
    }

    public TERRENO_HERENCIA() {
    }

    public TERRENO_HERENCIA(String ubicacion, double dimension, double avaluo, int numero_inmueble, boolean servicios_basicos, double latitud, double longitud) {
        super(ubicacion, dimension, avaluo, numero_inmueble, servicios_basicos, latitud, longitud);
    }
    public double avaluar(){
        double avaluo=0;
        avaluo=this.getDimension()*500;
        return avaluo;
    }
    public double comisionar_venta(double avaluo){
        double comision=0;
        if (avaluo> 50000){
            comision= (avaluo*10)/100;
        }else{
            comision=(avaluo*5)/100;
        }
        return comision;
    }
}
