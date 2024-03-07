public class Triangulo extends Figura {
    private double altura;
    private double base;
    private String nombre;
        public Triangulo(double base, double altura){
        this.altura = altura;
        this.base = base;
        this.lados = 3;
        this.nombre = "Triangulo";
    }


    @Override
    String nombre() {
        return this.nombre;
    }

    @Override
    public String area() {
        return dosDecimales.format(0.5*base*altura);
    }
}
