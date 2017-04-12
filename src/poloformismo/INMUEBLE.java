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
public class INMUEBLE {
    private String ubicacion;
    protected double dimension;
    private double avaluo;
    private int numero_inmueble;
    private boolean servicios_basicos;
    private double latitud;
    private double longitud;

    public INMUEBLE() {
    }

    public INMUEBLE(String ubicacion, double dimension, double avaluo, int numero_inmueble, boolean servicios_basicos, double latitud, double longitud) {
        this.ubicacion = ubicacion;
        this.dimension = dimension;
        this.avaluo = avaluo;
        this.numero_inmueble = numero_inmueble;
        this.servicios_basicos = servicios_basicos;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getDimension() {
        return dimension;
    }

    public void setDimension(double dimension) {
        this.dimension = dimension;
    }

    public double getAvaluo() {
        return avaluo;
    }

    public void setAvaluo(double avaluo) {
        this.avaluo = avaluo;
    }

    public int getNumero_inmueble() {
        return numero_inmueble;
    }

    public void setNumero_inmueble(int numero_inmueble) {
        this.numero_inmueble = numero_inmueble;
    }

    public boolean isServicios_basicos() {
        return servicios_basicos;
    }

    public void setServicios_basicos(boolean servicios_basicos) {
        this.servicios_basicos = servicios_basicos;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    
    public double avaluar(){
      
        return 0;
    }
    public double comisionar_venta(){
        //double comision=0;
        return 0;
    }
}
