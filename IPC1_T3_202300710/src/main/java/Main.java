import java.sql.Array;
import java.util.ArrayList;
public class Main {

    public static ArrayList<Figura> figuras = new ArrayList<>();

    public static void main(String[] argumentos){
        figuras.add(new Circulo(3));
        figuras.add(new Cuadrado(6));
        figuras.add(new Triangulo(12,8));

        for(int i = 0; i< figuras.size(); i++){
            System.out.println("Nombre de la figura: " + figuras.get(i).nombre()+"\n" +
                    "Area: " + figuras.get(i).area() +"\n");
        }
    }
}
