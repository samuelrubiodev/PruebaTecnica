package dev.samuelrubio.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase abstracta que representa un dispositivo de almacenamiento.
 * Tiene comportamientos basicos como girar, almacenar datos, leer y escribir.
 */
public abstract class DispositivoAlmacenamiento extends ObjetoGiratorio {

    public enum TipoDisco {
        HDD, SSD, CD, DVD, VINILO, BLUERAY, CD_R
    }

    private final String marca; // Marca del dispositivo
    private String nombre; // Nombre del dispositivo
    private int capacidad; // Capacidad en GB
    private List<String> contenido; // Contenido almacenado
    private TipoDisco tipoDisco;
    private final boolean soloLectura; // Si es solo lectura

    /**
     * Constructor de la clase DispositivoAlmacenamiento
     * @param marca Marca del dispositivo
     * @param nombre Nombre del dispositivo
     * @param velocidadGiro Velocidad de giro del dispositivo
     * @param capacidad Capacidad en GB
     * @param tipoDisco Tipo de disco (usando DispositivoAlmacenamiento.TipoDisco)
     * @param soloLectura Si es solo lectura
     */
    public DispositivoAlmacenamiento(String marca, String nombre, double velocidadGiro, int capacidad, TipoDisco tipoDisco, boolean soloLectura) {
        super(marca, nombre, velocidadGiro);
        this.marca = marca;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tipoDisco = tipoDisco;
        this.contenido = new ArrayList<>();
        this.soloLectura = soloLectura;
    }

    /**
     * Metodo para girar el dispositivo
     * Sobreescribiendo el metodo girar de la clase ObjetoGiratorio
     */
    @Override
    public void girar() {
        girarDisco();
    }

    public abstract void girarDisco();
    public abstract void escribir(String dato);
    public abstract void leer();
    public abstract void limpiarContenido();

    /**
     * Metodo para almacenar un dato en el dispositivo
     *
     * Añade el dato a la lista de la variable 'contenido'
     *
     * @param dato Dato a almacenar
     */
    public void almacenarDato(String dato) {
        contenido.add(dato);
        System.out.println("Dato almacenado....");
    }

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
