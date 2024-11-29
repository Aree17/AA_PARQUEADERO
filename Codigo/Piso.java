import java.util.List;
import java.util.ArrayList;

public class Piso {

    private int numero;

    //relaciones
    Parqueadero parqueadero;
    private List<Plaza> plazas;

    //constructor
    public Piso(int numero, Parqueadero parqueadero) {
        this.numero = numero;
        this.parqueadero = parqueadero;
        plazas = new ArrayList<>();
    }

    //metodos
    public void mostrarDatos() {
        System.out.println("Numero: " + numero);
    }
}
