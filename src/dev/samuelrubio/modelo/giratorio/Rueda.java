package dev.samuelrubio.modelo.giratorio;

import dev.samuelrubio.modelo.ObjetoGiratorio;

/**
 * Clase que representa una rueda herederando de ObjetoGiratorio
 * Tiene los comportamientos basicos de ObjetoGiratorio y sus propios atributos y comportamientos
 */
public class Rueda extends ObjetoGiratorio {

    public enum TipoTerreno {
        ASFALTO, TIERRA, ARENA
    }

    public enum Material {
        GOMA, PLASTICO, METAL
    }

    private Material material;
    private double presion; // PSI
    private double diametro;
    private TipoTerreno tipoTerreno;

    /**
     * Constructor de la clase Rueda
     * @param marca Marca de la rueda
     * @param nombre Nombre de la rueda
     * @param velocidadGiro Velocidad de giro de la rueda
     * @param material Material de la rueda (usando Rueda.Material)
     * @param presion Presion de la rueda
     * @param diametro Diametro de la rueda
     * @param tipoTerreno Tipo de terreno de la rueda (usando Rueda.TipoTerreno)
     */
    public Rueda(String marca, String nombre, double velocidadGiro, Material material, double presion, double diametro, TipoTerreno tipoTerreno) {
        super(marca, nombre, velocidadGiro);
        this.material = material;
        this.presion = presion;
        this.diametro = diametro;
        this.tipoTerreno = tipoTerreno;
    }

    @Override
    public void girar() {
        System.out.println("Rueda girando..");
    }

    public void detener() {
        System.out.println("Rueda detenida.");
    }

    @Override
    public String toString() {
        return super.toString() +
            "\nMaterial: " + material + "\n" +
            "Presión: " + presion + "\n" +
            "Diámetro: " + diametro + "\n" +
            "Tipo de terreno: " + tipoTerreno + "\n";
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public double getPresion() {
        return presion;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public TipoTerreno getTipoTerreno() {
        return tipoTerreno;
    }

    public void setTipoTerreno(TipoTerreno tipoTerreno) {
        this.tipoTerreno = tipoTerreno;
    }
}
