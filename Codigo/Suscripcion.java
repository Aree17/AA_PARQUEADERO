public class Suscripcion {
    private String codigo;
    private String fechaInicio;
    private String fechaFin;
    private float precio;

    //relaciones
    MetodoPago metodoPago;

    //constructor
    public Suscripcion() {
        this.codigo = "A1";
        this.fechaInicio = "17/01/2024";
        this.fechaFin = "17/12/2024";
        this.precio = 20.0f;
        this.metodoPago = MetodoPago.EFECTIVO;
    }




    public String getCodigo() {
        return codigo;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public float getPrecio() {
        return precio;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void mostrarDatos(Suscripcion suscripcion) {
        System.out.println("Se generó una suscripción con los siguientes datos:");
        System.out.println("Codigo: " + codigo);
        System.out.println("Fecha de inicio: " + fechaInicio);
        System.out.println("Fecha de fin: " + fechaFin);
        System.out.println("Precio: " + precio+ "\n");
    }
}
