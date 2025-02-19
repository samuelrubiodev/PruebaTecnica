package dev.samuelrubio.modelo.giratorio;

import dev.samuelrubio.modelo.ObjetoGiratorio;

public class Frisbee extends ObjetoGiratorio {

    public enum TipoVuelo {
        LARGO, CORTO, MEDIO
    }

    private boolean esCompeticion;  // Si es para competición oficial
    private double altura;        // Altura máxima de vuelo
    private TipoVuelo tipoVuelo;
    private boolean luminoso;     // Si luce en la oscuridad

    public Frisbee(String marca, String nombre, double velocidadGiro,boolean esCompeticion, double altura, TipoVuelo tipoVuelo, boolean luminoso) {
        super(marca, nombre, velocidadGiro);
        this.esCompeticion = esCompeticion;
        this.altura = altura;
        this.tipoVuelo = tipoVuelo;
        this.luminoso = luminoso;
    }

    @Override
    public void girar() {
        System.out.println("Frisbee girando..");
    }

    public void lanzar() {
        System.out.println("Frisbee lanzado!");
    }

    public void aterrizar() {
        System.out.println("Frisbee aterrizado!");
    }


    @Override
    public String toString() {
        return super.toString() +
            "\nEs de competición?: " + (esCompeticion ? "Sí" : "No") +
            "\nAltura máxima de vuelo: " + altura +
            "\nTipo de vuelo: " + tipoVuelo +
            "\nEs luminoso?: " + (luminoso ? "Sí" : "No") + "\n";
    }

    public boolean isEsCompeticion() {
        return esCompeticion;
    }

    public void setEsCompeticion(boolean esCompeticion) {
        this.esCompeticion = esCompeticion;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public TipoVuelo getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(TipoVuelo tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }

    public boolean isLuminoso() {
        return luminoso;
    }

    public void setLuminoso(boolean luminoso) {
        this.luminoso = luminoso;
    }
}
