package dev.samuelrubio.modelo.almacenamiento;

import dev.samuelrubio.modelo.DispositivoAlmacenamiento;

/**
 * Clase que representa un disco de vinilo herederando de DispositivoAlmacenamiento
 * Tiene los comportamientos basicos de DispositivoAlmacenamiento y sus propios atributos y comportamientos
 */
public class DiscoVinilo extends DispositivoAlmacenamiento {

    public enum Tipo {
        SIMPLE, EP, LP
    }

    public enum Genero {
        ROCK, POP, CLASICA
    }

    private Tipo tipo;
    private Genero genero;

    /**
     * Constructor de la clase DiscoVinilo
     * @param marca Marca del Vinilo
     * @param nombre Nombre del Vinilo
     * @param velocidadGiro Velocidad de giro del Vinilo
     * @param capacidad Capacidad del Vinilo
     * @param tipoDisco Tipo de disco del Vinilo (usando DispositivoAlmacenamiento.TipoDisco)
     * @param soloLectura Si es solo lectura
     * @param tipo Tipo del Vinilo (usando DiscoVinilo.Tipo)
     * @param genero Genero del Vinilo (usando DiscoVinilo.Genero)
     */
    public DiscoVinilo(String marca, String nombre, double velocidadGiro, int capacidad, TipoDisco tipoDisco, boolean soloLectura, Tipo tipo, Genero genero) {
        super(marca, nombre, velocidadGiro, capacidad, tipoDisco,soloLectura);
        this.tipo = tipo;
        this.genero = genero;
    }

    @Override
    public void girarDisco() {
        System.out.println("Disco de vinilo girando..");
    }

    @Override
    public void escribir(String dato) {
        System.out.println("Accion no permitida en un disco de vinilo.");
    }

    @Override
    public void leer() {
        System.out.println("Leyendo datos del disco de vinilo mediante el uso de la aguja.");
    }

    @Override
    public void limpiarContenido() {
        super.getContenido().clear();
        System.out.println("Limpiando el disco de vinilo.");
    }

    public void reproducirMusica() {
        System.out.println("Reproduciendo disco de vinilo...");
    }

    public void detenerReproduccionMusica() {
        System.out.println("Deteniendo reproducción de disco de vinilo...");
    }

    @Override
    public String toString() {
        return super.toString() +
                "Tipo: " + tipo +
                "Genero: " + genero;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}