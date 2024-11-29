public class Reserva {
    private String codigo;
    private String fecha;
    Plaza plaza;


    //Constructor
    public Reserva(Plaza plaza, String codigo, String fecha) {
        this.fecha = fecha;
        this.plaza = plaza;
        this.codigo = codigo;
    }

    public String validarReserva() {
        System.out.println("Datos de la reserva");
        if (plaza.isReservado()) {
            return "Esta plaza está ocupada";
        } else {
            return "Reserva generada";
        }

    }

    public String eliminarReserva() {
        return "Reserva eliminada";
    }

    public void mostrarDatos(Reserva reserva) {
        System.out.println("Codigo: " + codigo);
        System.out.println("Reservado: " + reserva.validarReserva());
    }

}