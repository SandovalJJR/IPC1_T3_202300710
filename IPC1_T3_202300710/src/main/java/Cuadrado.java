public class Cuadrado extends Figura{
    private double lado;
    private String nombre;
    public Cuadrado(double lado){
        this.lado = lado;
        this.lados = 4;
        this.nombre = "Cuadrado";
    }

    public String getNombre(){
        return nombre;
    }

    @Override
    String nombre() {
        return this.nombre;
    }

    @Override
    public String area() {
        return dosDecimales.format(Math.pow(lado,2));
    }
}
