package dev.samuelrubio.clases;

import dev.samuelrubio.ObjetoGiratorio;

public class Rueda extends ObjetoGiratorio {

    private String material; // Goma, plástico, etc.
    private double presion; // PSI
    private double diametro;
    private String tipoTerreno; // Asfalto, tierra, etc.

    public Rueda(String marca, String nombre, double velocidadGiro, String material, double presion, double diametro, String tipoTerreno) {
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
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

    public String getTipoTerreno() {
        return tipoTerreno;
    }

    public void setTipoTerreno(String tipoTerreno) {
        this.tipoTerreno = tipoTerreno;
    }
}
