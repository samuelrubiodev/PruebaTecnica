package dev.samuelrubio;

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

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Nombre: " + nombre);
        System.out.println("Velocidad de giro: " + velocidadGiro + " RPM");
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
