package dev.samuelrubio.modelo.almacenamiento;

import dev.samuelrubio.modelo.DispositivoAlmacenamiento;

/**
 * Clase que representa un disco Blue Ray herederando de DispositivoAlmacenamiento
 * Tiene los comportamientos basicos de DispositivoAlmacenamiento y sus propios atributos y comportamientos
 */
public class BlueRay extends DispositivoAlmacenamiento {

    public enum TipoLaser {
        AZUL, ROJO, VERDE
    }

    private TipoLaser tipoLaser;
    private int logintudOnda; // nm

    /**
     * Constructor de la clase BlueRay
     * @param marca Marca del Blue Ray
     * @param nombre Nombre del Blue Ray
     * @param velocidadGiro Velocidad de giro del Blue Ray
     * @param capacidad Capacidad del Blue Ray
     * @param tipoDisco Tipo de disco del Blue Ray (usando DispositivoAlmacenamiento.TipoDisco)
     * @param soloLectura Si el Blue Ray es solo lectura
     * @param tipoLaser Tipo de láser del Blue Ray (usando BlueRay.TipoLaser)
     * @param logintudOnda Longitud de onda del láser del Blue Ray
     */
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

    @Override
    public String toString() {
        return super.toString() +
                "Tipo de láser: " + tipoLaser + "\n" +
                "Longitud de onda: " + logintudOnda + "\n";
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
