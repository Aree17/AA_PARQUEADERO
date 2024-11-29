public class Visitante extends Cliente{

    //constructor
    public Visitante(String nombre, String cedula) {
        super(nombre, cedula);
    }

    //metodos
    public void pagarTotal(Ticket ticket){
        System.out.println("El cliente visitante está pagando un total de "+ticket.getTotal()+"\n");
    }
    @Override
    public boolean esVisitante() {
        return true;
    }

    public void mostrarDatos(Visitante visitante) {
        System.out.println("Se muestran los datos del visitante");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cedula: " + cedula+"\n");
    }
}
