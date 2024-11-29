public class Ticket {
    private float horasUsadas;
    private String fecha;
    private float total;

    //relaciones
    Vehiculo vehiculo;
    Factura factura;
    Plaza plaza;
    Cliente cliente;

    //Constructor
    public Ticket(Vehiculo vehiculo, float horasUsadas, String fecha, Cliente cliente){
        this.horasUsadas = horasUsadas;
        this.fecha = fecha;
        this.cliente = cliente;
        this.total = calcularTotal(vehiculo);
    }


    //metodos
    public float calcularTotal(Vehiculo vehiculo) {
        return horasUsadas * vehiculo.tarifa;
    }

    public String asignarPlaza(Plaza plaza){
        return "La plaza "+plaza.getCodigo()+" ha sido asignada al vehiculo "+vehiculo.getMarca()+" "+vehiculo.getModelo()+" al usuario "+cliente.getNombre();
    }

    //Getters y Setters
    public float getHorasUsadas() {
        return horasUsadas;
    }

    public void setHorasUsadas(float horasUsadas) {
        this.horasUsadas = horasUsadas;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public float getTotal() {
        return total;
    }

    public void mostrarDatos(Ticket ticket) {
        System.out.println("Se muestran los datos del ticket");
        System.out.println("Fecha: " + fecha);
        System.out.println("Horas Usadas: " + horasUsadas);
        System.out.println("Total: " + total+"\n");
    }
}
