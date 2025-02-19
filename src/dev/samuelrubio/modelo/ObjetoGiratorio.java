package dev.samuelrubio.modelo;

/**
 * Clase abstracta que representa un objeto giratorio.
 * Tiene comportamientos basicos
 */
public abstract class ObjetoGiratorio {

    private final String marca; // Marca del objeto
    private String nombre; // Nombre del objeto
    private double velocidadGiro; // RPM

    /**
     * Constructor de la clase ObjetoGiratorio
     * @param marca Marca del objeto
     * @param nombre Nombre del objeto
     * @param velocidadGiro Velocidad de giro en RPM
     */
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
