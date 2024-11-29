public class Factura {

    //atributos
    private String fecha;
    private float total;
    private int numero;

    //relaciones
    Ticket ticket;

    //Constructor
    public Factura(String fecha, int numero, Ticket ticket) {
        this.fecha = fecha;
        if (ticket.cliente != null && ticket.cliente.esVisitante()) {
            this.total = ticket.calcularTotal(ticket.vehiculo);
        } else {
            this.total = 0;
        }
    }

    public void mostrarDatos(Factura factura) {
        System.out.println("Se muestran los datos de la factura");
        System.out.println("Fecha: " + fecha);
        System.out.println("Numero: " + numero);
        System.out.println("Total: " + total);
    }

}