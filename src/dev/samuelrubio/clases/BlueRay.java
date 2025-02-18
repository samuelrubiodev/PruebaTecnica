package dev.samuelrubio.clases;

import dev.samuelrubio.DispositivoAlmacenamiento;

public class BlueRay extends DispositivoAlmacenamiento {

    private String tipoLaser;
    private int logintudOnda;

    public BlueRay(String marca, String nombre, double velocidadGiro, int capacidad, String tipoDisco, boolean soloLectura, String tipoLaser, int logintudOnda) {
        super(marca, nombre, velocidadGiro, capacidad, tipoDisco, soloLectura);
        this.tipoLaser = tipoLaser;
        this.logintudOnda = logintudOnda;
    }

    @Override
    public void girar() {
        System.out.println("Blue Ray girando ..");
    }

    @Override
    public void escribir(String dato) {
        if (isSoloLectura()) {
            System.out.println("No se puede escribir en un disco de solo lectura.");
        } else {
            System.out.println("Escribiendo datos en el disco Blue Ray mediante el uso del láser.");
            super.almacenarDato(dato);
        }
    }

    @Override
    public void leer() {
        System.out.println("Leyendo datos del disco Blue Ray mediante el uso del láser.");
    }

    public String getTipoLaser() {
        return tipoLaser;
    }

    public void setTipoLaser(String tipoLaser) {
        this.tipoLaser = tipoLaser;
    }

    public int getLogintudOnda() {
        return logintudOnda;
    }

    public void setLogintudOnda(int logintudOnda) {
        this.logintudOnda = logintudOnda;
    }
}
