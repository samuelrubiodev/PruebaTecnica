package dev.samuelrubio;

public class DiscoDuro extends DispositivoAlmacenamiento{

    private int rpm;
    private String tipoConexion; // (SATA, IDE, etc.)
    private boolean esSSD;

    public DiscoDuro(String nombre, int capacidad, String tipoDisco, int rpm, String tipoConexion, boolean esSSD) {
        super(nombre, capacidad, tipoDisco);
        this.rpm = rpm;
        this.tipoConexion = tipoConexion;
        this.esSSD = esSSD;
    }

    @Override
    public void girar() {
        System.out.println("Disco Duro girando..");
    }

    @Override
    public void escribir(String dato) {
        System.out.println("Escribiendo datos en el disco duro mediante el uso del cabezal magnético.");
        super.almacenarDato(dato);
    }

    @Override
    public void leer() {
        System.out.println("Leyendo datos del disco duro mediante el uso del cabezal magnético.");
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public String getTipoConexion() {
        return tipoConexion;
    }

    public void setTipoConexion(String tipoConexion) {
        this.tipoConexion = tipoConexion;
    }

    public boolean isEsSSD() {
        return esSSD;
    }

    public void setEsSSD(boolean esSSD) {
        this.esSSD = esSSD;
    }
}
