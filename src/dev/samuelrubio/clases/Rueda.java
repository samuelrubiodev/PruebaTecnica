package dev.samuelrubio.clases;

import dev.samuelrubio.ObjetoGiratorio;

public class Rueda extends ObjetoGiratorio {

    public enum TipoTerreno {
        ASFALTO, TIERRA, ARENA
    }

    public enum Material {
        GOMA, PLASTICO, METAL
    }

    private Material material; // Goma, plástico, etc.
    private double presion; // PSI
    private double diametro;
    private TipoTerreno tipoTerreno; // Asfalto, tierra, etc.

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
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Material: " + material);
        System.out.println("Presión: " + presion);
        System.out.println("Diámetro: " + diametro);
        System.out.println("Tipo de terreno: " + tipoTerreno);
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
