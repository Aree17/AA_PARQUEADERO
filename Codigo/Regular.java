import java.util.List;
import java.util.ArrayList;

public class Regular extends Cliente {
    private String codigoSuscripcion;

    //relaciones
    List<Reserva> reservas;
    Suscripcion suscripcion;

    //constructor
    public Regular(String nombre, String cedula, Suscripcion suscripcion) {
        super(nombre, cedula);
        this.reservas = new ArrayList<>();
        this.codigoSuscripcion = suscripcion.getCodigo();
    }

    //metodos
    public void addReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void mostrarDatos() {
        System.out.println("Se muestran los datos del cliente regular");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Cedula: " + getCedula());
        System.out.println("Codigo de suscripcion: " + codigoSuscripcion+"\n");
    }


}
