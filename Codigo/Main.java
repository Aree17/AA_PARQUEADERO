//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero("PARQUEADERO CENTRAL", "Calle 123");
        parqueadero.mostrarDatos();
        Piso piso = new Piso(1, parqueadero);
        Plaza plaza = new Plaza("A1", false, piso);
        plaza.mostrarDatos(plaza);
        Supervisor supervisor = new Supervisor("Juan", "Perez", "07049875547", 500.0f);
        supervisor.trabajar();
        Cajero cajero = new Cajero("Maria", "Lopez", "07049875547", 300.0f);
        Suscripcion suscripcion = new Suscripcion();
        Regular regular = new Regular("Juan", "0704235", suscripcion);
        regular.mostrarDatos();
        cajero.trabajar();
        suscripcion.mostrarDatos(suscripcion);
        Visitante visitante = new Visitante("Pedro", "0704235");
        visitante.mostrarDatos(visitante);
        Automovil automovil = new Automovil("Deportivo", "Rojo", "Chevrolet", "AJILG002", 4);
        Ticket ticket = new Ticket(automovil,1.5f, "25/11/2024", visitante);
        visitante.pagarTotal(ticket);
        ticket.mostrarDatos(ticket);
        Reserva reserva = new Reserva(plaza, "12:00", "25/11/2024");
        regular.addReserva(reserva);
        reserva.mostrarDatos(reserva);




    }
}