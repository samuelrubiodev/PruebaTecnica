package dev.samuelrubio.modelo;

/**
 * Clase abstracta que representa un objeto giratorio.
 * Tiene comportamientos basicos como girar y mostrar informacion.
 */
public abstract class ObjetoGiratorio {

    private final String marca;
    private String nombre;
    private double velocidadGiro; // RPM

    public ObjetoGiratorio(String marca, String nombre, double velocidadGiro) {
        this.marca = marca;
        this.nombre = nombre;
        this.velocidadGiro = velocidadGiro;
    }

    public abstract void girar();

    @Override
    public String toString() {
        return "Marca: " + marca + "\n" +
                "Nombre: " + nombre + "\n" +
                "Velocidad de giro: " + velocidadGiro + " RPM";
    }

    public String getMarca() {
        return marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVelocidadGiro() {
        return velocidadGiro;
    }

    public void setVelocidadGiro(double velocidadGiro) {
        this.velocidadGiro = velocidadGiro;
    }
}
