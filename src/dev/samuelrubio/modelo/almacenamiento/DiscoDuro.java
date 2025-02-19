package dev.samuelrubio.modelo.almacenamiento;

import dev.samuelrubio.modelo.DispositivoAlmacenamiento;

/**
 * Clase que representa un disco duro herederando de DispositivoAlmacenamiento.
 * Tiene los comportamientos basicos de DispositivoAlmacenamiento y sus propios atributos.
 */
public class DiscoDuro extends DispositivoAlmacenamiento {

    public enum TipoConexion {
        SATA, IDE, SCSI, USB, FIREWIRE
    }

    private TipoConexion tipoConexion;
    private boolean esSSD;

    /**
     * Constructor de la clase DiscoDuro.
     * @param marca Marca del DiscoDuro
     * @param nombre Nombre del dispositivo
     * @param velocidadGiro Velocidad de giro del disco duro
     * @param capacidad Capacidad del disco duro
     * @param tipoDisco Tipo de disco (usando DispositivoAlmacenamiento.TipoDisco)
     * @param tipoConexion Tipo de conexion del disco duro (usando DiscoDuro.TipoConexion)
     * @param esSSD Si es un disco duro SSD
     * @param soloLectura Si el disco duro es de solo lectura
     */
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
    public String toString() {
        return super.toString() +
            "\nTipo de conexión: " + tipoConexion +
            "\nEs SSD: " + (esSSD ? "Sí" : "No");
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
