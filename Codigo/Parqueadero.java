import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Parqueadero {
    private String nombre;
    private String direccion;

    //relaciones
    private List<Empleado> empleados;
    private List<Piso> pisos;
    private List<Cliente> clientes;
    private List<Persona> personas;

    //constructor
    public Parqueadero(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        empleados = new ArrayList<>();
        pisos = new ArrayList<>();
        clientes = new ArrayList<>();
        personas = new ArrayList<>();
    }

    //metodos
    public void mostrarDatos() {
        System.out.println("BIENVENIDO AL " + nombre+"\n");
        System.out.println("Direccion: " + direccion);
    }
}
