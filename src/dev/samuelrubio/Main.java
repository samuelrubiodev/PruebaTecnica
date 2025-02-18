package dev.samuelrubio;

public class Main {

    public static void main(String[] args) {
        Cd cd1 = new Cd("Sony", "Disco de música", 700, "CD-R", "Láser", false);
        DiscoDuro disco1 = new DiscoDuro("Seagate", "Barracuda", 1000, "HDD", 7200, "SATA", false);

        System.out.println("Disco: ");

        cd1.mostrarInformacion();
        cd1.girar();
        cd1.escribir("Datos de música");
        cd1.leer();
        cd1.mostrarInformacion();

        System.out.println("\nDisco Duro: ");

        disco1.mostrarInformacion();
        disco1.girar();
        disco1.escribir("Datos de trabajo");
        disco1.leer();
        disco1.mostrarInformacion();
    }
}
