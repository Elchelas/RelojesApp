package modelo;

public abstract class RelojInteligente {
    //Atributos de la clase
    protected String correa;
    protected double pantalla;
    protected String color;
    protected int bateria;
    public String marca;
    
    //Constructor de la clase

    public RelojInteligente(String correa, double pantalla, String color, int bateria, String marca) 
    {
        this.correa = correa;
        this.pantalla = pantalla;
        this.color = color;
        this.bateria = bateria;
        this.marca = marca;
    }
    
    //Metodos de la clase


    
}
