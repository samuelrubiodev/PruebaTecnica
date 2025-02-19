package dev.samuelrubio.main;

import dev.samuelrubio.DispositivoAlmacenamiento;
import dev.samuelrubio.clases.*;


public class Main {

    public static void main(String[] args) {
        Cd cd1 = new Cd("Sony", "Disco de música", 500.0, 700, DispositivoAlmacenamiento.TipoDisco.CD_R, Cd.TipoLector.CD_ROM, false,false);
        DiscoDuro disco1 = new DiscoDuro("Western Digital", "Blue", 7200.0, 1000, DispositivoAlmacenamiento.TipoDisco.HDD, DiscoDuro.TipoConexion.SATA, false,false);
        DiscoVinilo miVinilo = new DiscoVinilo("Sony", "Greatest Hits", 33.3, 700, DispositivoAlmacenamiento.TipoDisco.VINILO, true, DiscoVinilo.Tipo.LP, DiscoVinilo.Genero.ROCK);
        BlueRay blueRay = new BlueRay("Sony", "Blue Ray", 1000, 500, DispositivoAlmacenamiento.TipoDisco.BLUERAY, false, BlueRay.TipoLaser.AZUL, 405);
        Rueda rueda = new Rueda("Michelin", "Rueda Todo Terreno", 300, Rueda.Material.GOMA, 35.5, 17.5, Rueda.TipoTerreno.TIERRA);
        Frisbee frisbee = new Frisbee("Discraft", "Ultra-Star", 25.0, true, 30.5, Frisbee.TipoVuelo.LARGO, false);

        System.out.println("----- CD -----\n");

        cd1.mostrarInformacion();
        cd1.girar();
        cd1.escribir("Datos de música");
        cd1.leer();
        cd1.mostrarInformacion();

        System.out.println("\n----- Disco Duro -----\n");

        disco1.mostrarInformacion();
        disco1.girar();
        disco1.escribir("Datos de trabajo");
        disco1.leer();
        disco1.mostrarInformacion();

        System.out.println("\n----- Disco Vinilo -----\n");

        miVinilo.girar();
        miVinilo.escribir("Datos de música");
        miVinilo.leer();
        miVinilo.mostrarInformacion();

        System.out.println("\n----- Blue Ray -----\n");

        blueRay.mostrarInformacion();
        blueRay.girar();
        blueRay.escribir("Datos de video");
        blueRay.leer();
        blueRay.reproducirVideo();
        blueRay.detenerReproduccionVideo();
        blueRay.mostrarInformacion();

        System.out.println("\n----- Rueda -----\n");
        rueda.mostrarInformacion();
        rueda.girar();

        System.out.println("\n----- Frisbee -----\n");
        frisbee.mostrarInformacion();
        frisbee.girar();

    }
}
