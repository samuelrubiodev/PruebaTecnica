package dev.samuelrubio;

import java.util.ArrayList;
import java.util.List;

public abstract class DispositivoAlmacenamiento extends ObjetoGiratorio {

    private final String marca;
    private String nombre;
    private int capacidad; // GB
    private List<String> contenido;
    private String tipoDisco;
    private final boolean soloLectura;

    public DispositivoAlmacenamiento(String marca, String nombre, double velocidadGiro, int capacidad, String tipoDisco, boolean soloLectura) {
        super(marca, nombre, velocidadGiro);
        this.marca = marca;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tipoDisco = tipoDisco;
        this.contenido = new ArrayList<>();
        this.soloLectura = soloLectura;
    }

    @Override
    public abstract void girar();
    public abstract void escribir(String dato);
    public abstract void leer();

    public void almacenarDato(String dato) {
        contenido.add(dato);
        System.out.println("Dato almacenado....");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Es solo Lectura? : " + (soloLectura ? "Sí" : "No"));
        System.out.println("Capacidad: " + capacidad + " GB");
        System.out.println("Tipo de disco: " + tipoDisco);
        System.out.println("Contenido: " + contenido);
    }

    public boolean isSoloLectura() {
        return soloLectura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public List<String> getContenido() {
        return contenido;
    }

    public void setContenido(List<String> contenido) {
        this.contenido = contenido;
    }

    public String getTipoDisco() {
        return tipoDisco;
    }

    public void setTipoDisco(String tipoDisco) {
        this.tipoDisco = tipoDisco;
    }

    public String getMarca() {
        return marca;
    }
}
