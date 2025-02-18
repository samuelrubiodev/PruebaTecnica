package dev.samuelrubio.clases;

import dev.samuelrubio.DispositivoAlmacenamiento;

public class DiscoVinilo extends DispositivoAlmacenamiento {

    private String tipo; // Simple, EP, LP
    private String genero; // Rock, Pop, Clásica, etc.

    public DiscoVinilo(String marca, String nombre, double velocidadGiro, int capacidad, String tipoDisco, boolean soloLectura, String tipo, String genero) {
        super(marca, nombre, velocidadGiro, capacidad, tipoDisco,soloLectura);
        this.tipo = tipo;
        this.genero = genero;
    }

    @Override
    public void girar() {
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
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: " + tipo);
        System.out.println("Genero: " + genero);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}