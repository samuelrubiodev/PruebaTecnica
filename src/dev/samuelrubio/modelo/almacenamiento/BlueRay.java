package dev.samuelrubio.modelo.almacenamiento;

import dev.samuelrubio.modelo.DispositivoAlmacenamiento;

public class BlueRay extends DispositivoAlmacenamiento {

    public enum TipoLaser {
        AZUL, ROJO, VERDE
    }

    private TipoLaser tipoLaser;
    private int logintudOnda;

    public BlueRay(String marca, String nombre, double velocidadGiro, int capacidad, TipoDisco tipoDisco, boolean soloLectura, TipoLaser tipoLaser, int logintudOnda) {
        super(marca, nombre, velocidadGiro, capacidad, tipoDisco, soloLectura);
        this.tipoLaser = tipoLaser;
        this.logintudOnda = logintudOnda;
    }

    @Override
    public void girarDisco() {
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

    public void reproducirVideo() {
        System.out.println("Reproduciendo video del Blue Ray...");
    }

    public void detenerReproduccionVideo() {
        System.out.println("Deteniendo reproducción de video del Blue Ray...");
    }

    @Override
    public void limpiarContenido() {
        super.getContenido().clear();
        System.out.println("Limpiando contenido del Blue Ray");
    }

    public TipoLaser getTipoLaser() {
        return tipoLaser;
    }

    public void setTipoLaser(TipoLaser tipoLaser) {
        this.tipoLaser = tipoLaser;
    }

    public int getLogintudOnda() {
        return logintudOnda;
    }

    public void setLogintudOnda(int logintudOnda) {
        this.logintudOnda = logintudOnda;
    }
}
