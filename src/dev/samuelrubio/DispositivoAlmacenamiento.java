package dev.samuelrubio;

import java.util.ArrayList;
import java.util.List;

public abstract class DispositivoAlmacenamiento {

    private String nombre;
    private int capacidad; // GB
    private List<String> contenido;
    private String tipoDisco;

    public DispositivoAlmacenamiento(String nombre, int capacidad, String tipoDisco) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tipoDisco = tipoDisco;
        this.contenido = new ArrayList<>();
    }

    public abstract void girar();
    public abstract void escribir(String dato);
    public abstract void leer();

    public void almacenarDato(String dato) {
        contenido.add(dato);
        System.out.println("Dato almacenado....");
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
}
