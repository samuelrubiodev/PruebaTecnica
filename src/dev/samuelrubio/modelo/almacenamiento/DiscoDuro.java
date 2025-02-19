package dev.samuelrubio.modelo.almacenamiento;

import dev.samuelrubio.modelo.DispositivoAlmacenamiento;

public class DiscoDuro extends DispositivoAlmacenamiento {

    public enum TipoConexion {
        SATA, IDE, SCSI, USB, FIREWIRE
    }

    private TipoConexion tipoConexion;
    private boolean esSSD;

    public DiscoDuro(String marca, String nombre, double velocidadGiro, int capacidad, TipoDisco tipoDisco, TipoConexion tipoConexion, boolean esSSD, boolean soloLectura) {
        super(marca, nombre, velocidadGiro, capacidad, tipoDisco, soloLectura);
        this.tipoConexion = tipoConexion;
        this.esSSD = esSSD;
    }

    @Override
    public void girarDisco() {
        System.out.println("Disco Duro girando..");
    }

    @Override
    public void escribir(String dato) {
        System.out.println("Escribiendo datos en el disco duro mediante el uso del cabezal magnético.");
        super.almacenarDato(dato);
    }

    @Override
    public void limpiarContenido() {
        super.getContenido().clear();
        System.out.println("Limpiando contenido del disco duro.");
    }

    @Override
    public void leer() {
        System.out.println("Leyendo datos del disco duro mediante el uso del cabezal magnético.");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo de conexión: " + tipoConexion);
        System.out.println("Es SSD: " + (esSSD ? "Sí" : "No"));
    }

    public TipoConexion getTipoConexion() {
        return tipoConexion;
    }

    public void setTipoConexion(TipoConexion tipoConexion) {
        this.tipoConexion = tipoConexion;
    }

    public boolean isEsSSD() {
        return esSSD;
    }

    public void setEsSSD(boolean esSSD) {
        this.esSSD = esSSD;
    }
}
