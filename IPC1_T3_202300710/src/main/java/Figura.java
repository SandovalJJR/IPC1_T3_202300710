import java.text.DecimalFormat;
import java.util.zip.DeflaterInputStream;

abstract class Figura {
    public DecimalFormat dosDecimales = new DecimalFormat("#.##");
    public int lados;
    abstract String nombre();
    abstract String area();
}
