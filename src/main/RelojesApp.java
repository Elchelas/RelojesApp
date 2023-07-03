package main;

import modelo.*;

public class RelojesApp {

    public static void main(String[] args) {
        
        Amazfit mini2 = new Amazfit("Cuero", 1.3, "Negro",300, "Amazfit", "Mini 2");
        
        mini2.atrazar();
        mini2.calcularRitmoCar(75, 1);
        mini2.contarPasos(5);
        mini2.mensajeAlerta("ponsho");
        mini2.avanzar();
    }
    
}
