package dev.samuelrubio.clases;

import dev.samuelrubio.DispositivoAlmacenamiento;

public class Cd extends DispositivoAlmacenamiento {

    public enum TipoLector {
        DVD_ROM,
        CD_ROM,
        DVD_RW,
        CD_RW;
    }

    private TipoLector tipoLector;
    private boolean esRegradable; // Si es CD-R o CD-RW

    public Cd(String marca, String nombre, double velocidadGiro, int capacidad, TipoDisco tipoDisco, TipoLector tipoLector, boolean esRegradable, boolean soloLectura) {
        super(marca,nombre, velocidadGiro, capacidad, tipoDisco, soloLectura);
        this.esRegradable = esRegradable;
        this.tipoLector = tipoLector;
    }

    @Override
    public void girarDisco() {
        System.out.println("CD girando..");
    }

    @Override
    public void escribir(String dato) {
        System.out.println("Escribiendo datos en el CD con uso del laser.");
        super.almacenarDato(dato);
    }

    @Override
    public void leer() {
        System.out.println("Leyendo datos del CD con uso del laser.");
    }

    @Override
    public void limpiarContenido() {
        super.getContenido().clear();
        System.out.println("Limpiando contenido del CD.");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo de lector: " + tipoLector);
        System.out.println("Es regrabable: " + (esRegradable ? "Sí" : "No"));
    }

    public TipoLector getTipoLector() {
        return tipoLector;
    }

    public void setTipoLector(TipoLector tipoLector) {
        this.tipoLector = tipoLector;
    }

    public boolean isEsRegradable() {
        return esRegradable;
    }

    public void setEsRegradable(boolean esRegradable) {
        this.esRegradable = esRegradable;
    }
}