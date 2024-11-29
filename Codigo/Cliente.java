import java.util.List;

public class Cliente extends Persona {

    //relaciones
    Ticket ticket;
    List<Vehiculo> vehiculos;


    //constructor
    public Cliente(String nombre, String cedula) {
        super(nombre, cedula);
    }

    //metodos
    public void pagarTotal(Ticket ticket){
        System.out.println("Pagando total..\n");
    }

    public boolean esVisitante() {
        return false;
    }

    //Getters
    public Ticket getTicket() {
        return ticket;
    }

    public String getSuscripcion() {
        return "El señor tiene una reserva";
    }




}
