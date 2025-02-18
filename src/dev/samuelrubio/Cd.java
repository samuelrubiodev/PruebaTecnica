package dev.samuelrubio;

public class Cd extends DispositivoAlmacenamiento {

    private String tipoLector; // (DVD-ROM, CD-ROM, etc.)
    private boolean esRegradable; // Si es CD-R o CD-RW

    public Cd(String marca, String nombre, int capacidad, String tipoDisco, String tipoLector, boolean esRegradable) {
        super(marca,nombre, capacidad, tipoDisco);
        this.esRegradable = esRegradable;
        this.tipoLector = tipoLector;
    }

    @Override
    public void girar() {
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
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo de lector: " + tipoLector);
        System.out.println("Es regrabable: " + (esRegradable ? "Sí" : "No"));
    }

    public String getTipoLector() {
        return tipoLector;
    }

    public void setTipoLector(String tipoLector) {
        this.tipoLector = tipoLector;
    }

    public boolean isEsRegradable() {
        return esRegradable;
    }

    public void setEsRegradable(boolean esRegradable) {
        this.esRegradable = esRegradable;
    }
}