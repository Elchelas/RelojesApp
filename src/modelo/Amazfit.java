package modelo;

public class Amazfit extends RelojInteligente implements ControlDeMusica, Podometro, NotificacionDeMensaje, MonitorDeRitmoCardiaco{
    //Atributos de la clase
    protected String modelo;

    //Contructor de la clase

    public Amazfit(String correa, double pantalla, String color, int bateria, String marca, String modelo) {
        super(correa, pantalla, color, bateria, marca);
        this.modelo = modelo;
    }
    


    //Metodos de la clase
    @Override
    public void avanzar() {
        System.out.println(" > Se cambio a la siguiente cancion.");
    }

    @Override
    public void detener() {
        System.out.println(" || Se pauso la canion actual.");
    }

    @Override
    public void atrazar() {
        System.out.println(" < Se retrosedio a la anterior cancion.");
    }

    @Override
    public void contarPasos(int KilometrosRecorridos) {
        int x = KilometrosRecorridos * 1500;
        System.out.println("El dia de hoy se han recorrido " + KilometrosRecorridos + " kilometros dando un total de " + x + " pasos.");
    }

    @Override
    public void mensajeAlerta(String nombre) {
        System.out.println("Mensaje nuevo de: " + nombre);
    }

    @Override
    public void calcularRitmoCar(int latidos, int minutos) {
        int a = latidos/minutos;
        System.out.println("Por favor no se mueva, para calcular su ritmo cardiaco");
        System.out.println("Calculando...");
        System.out.println("Su ritmo cardiaco es de " + a + " pulsasiones por minuto.");
    }
    
    
}
