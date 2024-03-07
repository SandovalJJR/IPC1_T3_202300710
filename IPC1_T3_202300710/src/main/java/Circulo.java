public class Circulo extends Figura{
    private double radio;
    private String nombre;
    public Circulo(double radio){
        this.radio = radio;
        this.lados = 0;
        this.nombre = "Circulo";
    }

    @Override
    String nombre() {
        return this.nombre;
    }

    @Override
    public String area() {
        return dosDecimales.format(Math.pow(radio, 2)*Math.PI);
    }

}
