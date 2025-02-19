package dev.samuelrubio.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase abstracta que representa un dispositivo de almacenamiento.
 * Tiene comportamientos basicos como girar, almacenar datos, leer y escribir.
 */
public abstract class DispositivoAlmacenamiento extends ObjetoGiratorio {

    // Enumeracion que representa el tipo de disco
    public enum TipoDisco {
        HDD, SSD, CD, DVD, VINILO, BLUERAY, CD_R
    }

    private final String marca; // Marca del dispositivo
    private String nombre; // Nombre del dispositivo
    private int capacidad; // Capacidad en GB
    private List<String> contenido; // Contenido almacenado
    private TipoDisco tipoDisco;
    private final boolean soloLectura; // Si es solo lectura

    public DispositivoAlmacenamiento(String marca, String nombre, double velocidadGiro, int capacidad, TipoDisco tipoDisco, boolean soloLectura) {
        super(marca, nombre, velocidadGiro);
        this.marca = marca;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tipoDisco = tipoDisco;
        this.contenido = new ArrayList<>();
        this.soloLectura = soloLectura;
    }

    // Metodo abstracto que representa el comportamiento de girar el disco
    @Override
    public void girar() {
        girarDisco();
    }

    public abstract void girarDisco();
    public abstract void escribir(String dato);
    public abstract void leer();

    public void almacenarDato(String dato) {
        contenido.add(dato);
        System.out.println("Dato almacenado....");
    }

    public abstract void limpiarContenido();

    @Override
    public String toString() {
        return super.toString() +
            "\nEs solo Lectura? : " + (soloLectura ? "Sí" : "No") +
            "\nCapacidad: " + capacidad + " GB" +
            "\nTipo de disco: " + tipoDisco +
            "\nContenido: " + contenido + "\n";
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

    public TipoDisco getTipoDisco() {
        return tipoDisco;
    }

    public void setTipoDisco(TipoDisco tipoDisco) {
        this.tipoDisco = tipoDisco;
    }

    public String getMarca() {
        return marca;
    }
}
