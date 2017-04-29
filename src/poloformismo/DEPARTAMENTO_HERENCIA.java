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
public class DEPARTAMENTO_HERENCIA extends INMUEBLE{
    private double metros_construccion;
    private boolean amueblado;
    private int subdivision;
    private String garaje;
    public static void main(String[] args) {
        double de=0;
        DEPARTAMENTO_HERENCIA depar= new DEPARTAMENTO_HERENCIA();
        depar.setDimension(200);
        depar.setMetros_construccion(100);
        depar.setAmueblado(true);
        de=depar.avaluar();
        System.out.println(depar.avaluar());
        System.out.println(depar.comisionar_venta(de));
        
    }
    public DEPARTAMENTO_HERENCIA() {
    }

    public DEPARTAMENTO_HERENCIA(String ubicacion, double dimension, double avaluo, int numero_inmueble, boolean servicios_basicos, double latitud, double longitud) {
        super(ubicacion, dimension, avaluo, numero_inmueble, servicios_basicos, latitud, longitud);
    }

    public double getMetros_construccion() {
        return metros_construccion;
    }

    public void setMetros_construccion(double metros_construccion) {
        this.metros_construccion = metros_construccion;
    }

    public boolean isAmueblado() {
        return amueblado;
    }

    public void setAmueblado(boolean amueblado) {
        this.amueblado = amueblado;
    }

    public int getSubdivision() {
        return subdivision;
    }

    public void setSubdivision(int subdivision) {
        this.subdivision = subdivision;
    }

    public String getGaraje() {
        return garaje;
    }

    public void setGaraje(String garaje) {
        this.garaje = garaje;
    }
   public double avaluar(){
        double avaluo=0;
        avaluo=(this.getDimension()*100)+ (this.getMetros_construccion()*200);
        if (this.amueblado==true){
            avaluo= avaluo+200;
        
    }
     return avaluo;   
   }
  public double comisionar_venta(double avaluo){
        double comision=0;
        if (avaluo> 80000){
            comision= (avaluo*11)/100;
        }else{
            comision=(avaluo*6)/100;
        }
        return comision;
    }
    
}
